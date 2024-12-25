//package com.BirdsAngry;
//
//import com.badlogic.gdx.graphics.Texture;
//
//public class blackbird extends Birds{
//    private String name;
//    private int posx;
//    private int posy;
//    private int width;
//    private int height;
//    private int velocity;
//    private Texture blackbird;
//
//    public blackbird(String name, int posx,int posy, int velocity, int width, int height) {
//        super(name,posx,posy,velocity,width,height);
//        this.name = name;
//        this.posx = posx;
//        this.posy = posy;
//        this.width = width;
//        this.height = height;
//        this.velocity = velocity;
//        blackbird = new Texture("blackbird.png");
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public int getPosx(){
//        return posx;
//    }
//    @Override
//    public int getPosy(){
//        return posy;
//    }
//    @Override
//    public int getBirdVelocity() {
//        return velocity;
//    }
//    @Override
//    public float getWidth(){
//        return width;
//    }
//    @Override
//    public float getHeight(){
//        return height;
//    }
//
//    @Override
//    public Texture getBirdTexture() {
//        return blackbird;
//    }
//
//
//
//
//
//}
//




package com.BirdsAngry;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import java.io.Serializable;

public class blackbird extends Birds implements Serializable {
    private String name;
    private int posx;
    private int posy;
    private int width;
    private int height;
    private int velocity;
    private transient Texture blackbird;
    private transient TextureRegion blackbirdRegion;


    private Vector2 currentVelocity; // Current velocity of the bird
    private boolean isLaunched = false; // Has the bird been launched?
    private float elapsedTime = 0; // Elapsed time since launch
    private Vector2 dragStart;   // Initial position on the catapult
    private Vector2 dragEnd;        // Current drag position
    private TrajectoryHandler trajectoryHandler;
    private boolean isDragging = false;
    private final float GRAVITY = 9.8f; // Gravity constant
    private final float DAMPING = 1f; // Damping factor to reduce velocity

    public blackbird(String name, int posx,int posy, int velocity, int width, int height) {
        super(name,posx,posy,velocity,width,height);
        this.name = name;
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
        this.velocity = velocity;
        blackbird = new Texture("blackbird.png");
        blackbirdRegion= new TextureRegion(blackbird);
        setBounds(posx,posy,width,height);

        dragStart = new Vector2(posx, posy); // Default start position
        dragEnd = new Vector2(posx,posy);   // Current drag position
        currentVelocity = new Vector2(0, 0); // No initial velocity
        trajectoryHandler = new TrajectoryHandler(); // Initialize TrajectoryHandler
    }
    @Override
    public void act(float delta){
        super.act(delta);
        // Add logic to update the bird's position every

        getBounds().set(getX(), getY(), getWidth(), getHeight());


        // If dragging, calculate trajectory
//
//        if (isLaunched) {
//            // Update position based on velocity and gravity
//            elapsedTime += delta; // Increment elapsed time
//
//            yVelocity -= GRAVITY * delta; // Update Y velocity
//            float newX = dragStart.x + currentVelocity.x * elapsedTime;
//            float newY = dragStart.y + currentVelocity.y * elapsedTime - 0.5f * GRAVITY * elapsedTime * elapsedTime;

//            // Prevent bird from moving out of screen bounds
//            newX = Math.max(0, Math.min(newX, 800 - getWidth())); // X coordinate is within [0, 800 - bird width]
//            newY = Math.max(0, Math.min(newY, 600 - getHeight())); // Y coordinate is within [0, 600 - bird height]
//
//            // Stop bird if it hits the ground
//            if (newY <= 0) {
//                isLaunched = false;
//                setPosition(newX, 70); // Ensure it stops at ground level
//                yVelocity = 0; // Stop Y velocity
//
//            }
//            setPosition(newX, newY); // Update position
        if (isLaunched) {
            // Update position based on velocity and gravity
            elapsedTime += delta; // Increment elapsed time

            currentVelocity.y -= GRAVITY * delta; // Update Y velocity
            float newX = getX() + currentVelocity.x * delta;
            float newY = getY() + currentVelocity.y* delta;

            // Apply damping to reduce velocity over time
            currentVelocity.scl(DAMPING);

            // Check for collision with window boundaries
            if (newX <= 0 || newX >= 800 - getWidth()) {
                currentVelocity.x = -currentVelocity.x; // Reverse X velocity
                newX = Math.max(0, Math.min(newX, 800 - getWidth())); // Ensure it stays within bounds
            }
//                if (newY <= 0 || newY >= 600 - getHeight()) {
//                    currentVelocity.y = -currentVelocity.y; // Reverse Y velocity
//                    newY = Math.max(0, Math.min(newY, 600 - getHeight())); // Ensure it stays within bounds
//                }
            if (newY <= 110) { // Assuming 70 is the ground level
                newY = 110; // Ensure it stops at ground level
                currentVelocity.y = 0; // Stop Y velocity
                currentVelocity.x = 0; // Stop X velocity
                if (Math.abs(currentVelocity.x) < 0.1f) { // If X velocity is very small, stop the bird
                    currentVelocity.x = 0;
                    isLaunched = false; // Stop the bird
                }
            }
            else if (newY >= 600 - getHeight()) {
                currentVelocity.y = -currentVelocity.y; // Reverse Y velocity
                newY = Math.max(0, Math.min(newY, 600 - getHeight())); // Ensure it stays within bounds
            }


            setPosition(newX, newY); // Update position
            //  update the bounds of the bird

            setPosx((int) newX);
            setPosy((int) newY);




        }
        else if (isDragging) {
            Vector2 velocity = new Vector2(dragStart.x - dragEnd.x, dragStart.y - dragEnd.y); // Reverse velocity direction
            trajectoryHandler.calculateTrajectory(dragStart, velocity);
        }
    }
    // Add a method to start dragging
    public void startDragging(float x, float y) {
        dragEnd.set(x, y);  // Update drag position
        isDragging = true;  // Set dragging to true
    }
    // Add a method to stop dragging (trigger launch)
    public void stopDragging() {
        isDragging = false; // Stop dragging
        isLaunched = true;  // Launch the bird
        elapsedTime = 0;    // Reset elapsed time

        currentVelocity.set(dragStart.x - dragEnd.x, dragStart.y - dragEnd.y); // Set current velocity
//        Vector2 launchVelocity = new Vector2(dragStart.x - dragEnd.x, dragStart.y - dragEnd.y);
        // Set bird movement logic here (not yet implemented)
    }

    // Add a method to render the trajectory
    public void renderTrajectory(SpriteBatch batch) {
        if (isDragging) {
//            trajectoryHandler.calculateTrajectory(dragStart, new Vector2(dragStart.x - dragEnd.x, dragStart.y - dragEnd.y));
            trajectoryHandler.render(batch); // Render the trajectory
        }
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        renderTrajectory((SpriteBatch) batch);
        batch.draw(blackbirdRegion, getX(), getY(),getWidth()/2,getHeight()/2,getWidth(), getHeight(),1,1,getRotation());

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPosx(){
        return posx;
    }
    public void setPosx(int i) {
        posx = i;

    }
    @Override
    public int getPosy(){
        return posy;
    }
    public void setPosy(int i) {
        posy = i;
    }
    @Override
    public int getBirdVelocity() {
        return velocity;
    }
    @Override
    public float getWidth(){
        return width;
    }
    @Override
    public float getHeight(){
        return height;
    }

    @Override
    public Texture getBirdTexture() {
        return blackbird;
    }

    public Rectangle getBounds(){
        return new Rectangle(getPosx(),getPosy(),width,height);
    }

    // Dispose of the trajectory handler when no longer needed
    @Override
    public void dispose() {
        super.dispose();               // Call parent class's dispose if needed
        getBirdTexture().dispose();   // Dispose of the bird's texture
        if (trajectoryHandler != null) {
            trajectoryHandler.dispose(); // Dispose of trajectory handler's resources
        }
    }
}

