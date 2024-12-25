package com.BirdsAngry;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.io.Serializable;

abstract public class Birds extends Actor implements Serializable {
    private String name;
    private int posx;
    private int posy;
    private int width;
    private int height;
    private int velocity;
    private int VelocityX;
    private int VelocityY;

    public Birds(String name, int posx,int posy, int velocity, int width, int height){
        this.name = name;
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
        this.velocity = velocity;

    }

    public String getName(){
        return name;
    }

    public int getPosx(){
        return posx;
    }
    public int getPosy(){
        return posy;
    }

    public int getBirdVelocity(){
        return velocity;
    }

    public float getWidth(){
        return width;
    }

    public float getHeight(){
        return height;
    }

    public abstract Texture getBirdTexture();

    // Dispose of the trajectory handler when no longer needed
    public void dispose() {
        getBirdTexture().dispose();
    }

    public void setVelocity(float velocityX, float velocityY) {
        this.velocity = (int) velocityX;
    }
}
