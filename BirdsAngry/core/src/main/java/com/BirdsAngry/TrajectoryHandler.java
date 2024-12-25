package com.BirdsAngry;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.io.Serializable;
import java.util.ArrayList;

public class TrajectoryHandler implements Serializable {
    private transient Texture dotTexture;               // Dot texture
    private ArrayList<Vector2> trajectoryDots; // List to hold dot positions
    private final float GRAVITY = 9.8f;       // Gravity constant
    private final int DOT_SPACING = 40;       // Time interval between dots

    public TrajectoryHandler() {
        dotTexture = new Texture("dot.png");
        trajectoryDots = new ArrayList<>();
    }

    public void calculateTrajectory(Vector2 startPosition, Vector2 velocity) {
        trajectoryDots.clear(); // Clear previous trajectory
        float time = 0;

        // Calculate trajectory positions
        for (int i = 0; i < 30; i++) { // Create 30 dots along the trajectory
            float x = startPosition.x + velocity.x * time;
            float y = startPosition.y + (velocity.y * time - 0.5f * GRAVITY * time * time);

            if (y < 0) break; // Stop if the dot goes below the ground level

            trajectoryDots.add(new Vector2(x, y));
            time += DOT_SPACING/1000f; // Increment time (convert milliseconds to seconds)
        }
    }

    public void render(SpriteBatch batch) {
        for (Vector2 dotPosition : trajectoryDots) {
            batch.draw(dotTexture, dotPosition.x, dotPosition.y, 5, 5); // Render dots at calculated positions
        }
    }

    public void dispose() {
        dotTexture.dispose();
    }
}
