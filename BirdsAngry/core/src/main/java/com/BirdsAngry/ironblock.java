package com.BirdsAngry;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import java.io.Serializable;

public class ironblock extends Actor implements Serializable {
    private String name;
    private int posx;
    private int posy;
    private int width;
    private int height;
    private int health;
    private transient Texture ironblock;
    private boolean destroyed = false;

    public ironblock(String name, int posx,int posy,int width, int height, int health) {
        this.name = name;
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
        this.health = health;
        ironblock = new Texture("ironblock.png");
        setBounds(posx, posy, width, height);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(ironblock, posx, posy, width, height);
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public int getPosx(){
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public float getWidth(){
        return width;
    }

    public float getHeight(){
        return height;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }


    public Texture getTexture() {
        return ironblock;
    }


    public Rectangle getBounds() {
        return new Rectangle(getPosx(), getPosy(), getWidth(), getHeight());
    }

    public void dispose(){
        ironblock.dispose();
    }
    public void onhit(){
        health -= 1;
        if(health <= 0){
            destroyed = true;
            this.remove();
        }
    }
}
