package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import java.io.Serializable;

import static com.badlogic.gdx.graphics.g3d.particles.ParticleShader.Inputs.screenWidth;

public class pig extends Actor implements Serializable {
    private int posx;
    private int posy;
    private int width;
    private int height;
    private transient Texture pig;
    private transient TextureRegion pigRegion;
    private int health;
    private final float GRAVITY = 9.8f; // Gravity constant
    private final float DAMPING = 1f; // Damping factor to reduce velocity
    private Vector2 velocity = new Vector2(); // Velocity of the pig
    private float velocityX = 100; // Initial velocity in X direction
    private float velocityY = 200; // Initial velocity in Y direction
    private float rotationSpeed = 150; // Degrees per second
    private boolean isBouncing = false; // Is the pig bouncing?
    private float gravity = -500; // Pixels per second^2
    private float bounceFactor = 0.6f; // Energy retained after bounce
    private float groundY = 0; // Ground level (y-coordinate)
    private Boolean isHit = false;

    private transient Texture redpig;





    public pig(int posx, int posy, int width, int height, int health) {
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
        this.health = health;
        pig = new Texture("pig.png");
        redpig = new Texture("redpig1.png");
        pigRegion = new TextureRegion(pig);

        setBounds(posx, posy, width, height);

    }

//    public void getHit() {
//        isHit = true;
//    }
    public void sethit(Boolean hit) {
        this.isHit = hit;
    }


    @Override
    public void act(float delta) {
        super.act(delta);

        // set current position of the pig


        if (isBouncing) {
            velocity.y -= GRAVITY * delta; // Apply gravity
            float newX = getX() + velocity.x * delta;
            float newY = getY() + velocity.y * delta;

            // Apply damping to reduce velocity over time
            velocity.scl(DAMPING);

            // Check for collision with ground
            if (newY <= 70) { // Assuming 70 is the ground level
                newY = 70;
                velocity.y = -velocity.y; // Reverse Y velocity
                if (Math.abs(velocity.y) < 1) { // If Y velocity is very small, stop bouncing
                    velocity.y = 0;
                    isBouncing = false;
                }
            }

            setPosition(newX, newY); // Update position
        }


    }



    @Override
    public void draw(Batch batch, float parentAlpha) {
        // draw accoridng to the texture region
//        batch.draw(pigRegion,getPosx(),getPosy(),getWidth()/2,getHeight()/2,getWidth(), getHeight(),1,1,getRotation());
        batch.draw(pig, posx, posy, width, height);
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }


    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Texture getPigTexture() {
        return pig;
    }

    public int getHealth() {
        return health;
    }

    public void dispose() {
        pig.dispose();
    }

    public void setHealth(int i) {
        this.health = i;
    }

    public Rectangle getBounds() {
        return new Rectangle(getPosx(), getPosy(), width, height);
    }

  //   handle collision with other actors
    public void onHit() {
      if (isHit){
          health--;
          // change to red pig
            chaneToRedPig();
          System.out.println("Pig health: " + health);
          if (health <= -50) {
              System.out.println("Pig is dead");
              // remove the pig from the stage
              this.remove();
          }
          isHit = false;
      }
    }

    public void chaneToRedPig() {
        addAction(Actions.sequence(
            Actions.run(() -> {
                pig = redpig;
            }),
            Actions.delay(0.1f),
            Actions.run(() -> {
                pig = new Texture("pig.png");
            }),
            Actions.delay(0.1f),
            Actions.run(() -> {
                pig = redpig;
            }),
            Actions.delay(0.1f),
            Actions.run(() -> {
                pig = new Texture("pig.png");
            })
        ));

    }



}
