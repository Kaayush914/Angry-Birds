//package com.BirdsAngry;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Screen;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.scenes.scene2d.InputEvent;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
//import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
//import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
//import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
//import com.badlogic.gdx.utils.ScreenUtils;
//
//import java.security.PrivateKey;
//
//public class Level3 implements Screen {
//
//    // defining attributes
//    private Main game;
//    private SpriteBatch batch;
//    private Texture go;
//    private Texture go1;
//    private Texture background;
//    private Texture pausebutton;
//    //    private Texture redbird;
////    private Texture yellowbird;
////    private Texture terence;
//    private Texture ironblock;
//    private Texture woodblock;
//    private Texture glassblock;
//    private Texture tntblock;
//    //    private Texture pig;
//    private Texture catapult;
//    private Stage stage;
//
//    public Level3(Main game){
//        // level Constructor
//        this.game = game;
//        stage = new Stage();
//
//        batch = new SpriteBatch();
//        go = new Texture("go1.png");
//
//
//        go1 = new Texture("go.png");
//
//
//        background = new Texture("level3background.png");
//
//        pausebutton = new Texture("pausebutton.png");
//
//        //        redbird = new Texture("redbird.png");
////        yellowbird = new Texture("yellowbird.png");
////        terence = new Texture("terence.png");
//        ironblock = new Texture("ironblock.png");
//        woodblock = new Texture("woodblock.png");
//        glassblock = new Texture("glassblock.png");
//        tntblock = new Texture("tnt.png");
////        pig = new Texture("pig.png");
//        catapult = new Texture("catapult.png");
//    }
//
//
//
//    @Override
//    public void show() {
//        // Prepare your screen here.
//        Gdx.input.setInputProcessor(stage);
//
//        Drawable god= new TextureRegionDrawable(go);
//        ImageButton goButton = new ImageButton(god);
//        goButton.setPosition(10, 35);
//        goButton.setSize(40,40);
//        goButton.addListener(new ClickListener(){
//            @Override
//            public void clicked(InputEvent event, float x, float y){
//                game.setScreen(new looseScreen(game));
//            }
//        });
//
//        Drawable go1d= new TextureRegionDrawable(go1);
//        ImageButton go1Button = new ImageButton(go1d);
//        go1Button.setPosition(740, 35);
//        go1Button.setSize(40,40);
//        go1Button.addListener(new ClickListener(){
//            @Override
//            public void clicked(InputEvent event, float x, float y){
//                game.setScreen(new winScreen(game, Level3.this));
//            }
//        });
//
//        Drawable pausebuttond = new TextureRegionDrawable(pausebutton);
//        ImageButton pauseButton = new ImageButton(pausebuttond);
//        pauseButton.setPosition(370, 25);
//        pauseButton.setSize(60,60);
//        pauseButton.addListener(new ClickListener(){
//            @Override
//            public void clicked(InputEvent event, float x, float y){
//                game.setScreen(new PauseScreen(game, Level3.this));
//            }
//        });
//
//
//        stage.addActor(goButton);
//        stage.addActor(go1Button);
//        stage.addActor(pauseButton);
//    }
//
//    @Override
//    public void render(float delta) {
//        // Draw your screen here. "delta" is the time since last render in seconds.
//        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);
//        redbird redbird1 = new redbird("Red", 115, 165,50,50, 50);
////        bluebird bluebird1 = new bluebird("Blue", 50, 145, 50, 50, 50);
//        blackbird blackbird1 = new blackbird("Black", 50, 110, 50, 50, 50);
//        yellowbird yellowbird1 = new yellowbird("Yellow", 20, 105, 50, 50, 50);
////        terence terence1 = new terence("Terence", 10, 145, 40, 60, 60);
//        pig pig1 = new pig(43, 290, 40, 40,2);
//        pig pig2 = new pig(145, 20, 70, 70,4);
//        pig pig3 = new pig(45, 50, 50, 50,3);
//        batch.begin();
//        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        batch.draw(catapult,110,110,50,70);
//        batch.draw(redbird1.getBirdTexture(),redbird1.getPosx(),redbird1.getPosy(),redbird1.getWidth(),redbird1.getHeight());
//        batch.draw(blackbird1.getBirdTexture(),blackbird1.getPosx(),blackbird1.getPosy(),blackbird1.getWidth(),blackbird1.getHeight());
//        batch.draw(yellowbird1.getBirdTexture(),yellowbird1.getPosx(),yellowbird1.getPosy(),yellowbird1.getWidth(),yellowbird1.getHeight());
//
//        int xpos = Gdx.graphics.getWidth()-300;
//        int ypos = 110;
//        // creating the stucture ( harcoded for each level as of now )
//        batch.draw(ironblock, xpos, ypos+140, 45, 50);
//        batch.draw(ironblock, xpos+90, ypos + 140, 45, 50);
//        batch.draw(ironblock, xpos, ypos + 165, 45, 50);
//        batch.draw(ironblock, xpos+90, ypos + 165, 45, 50);
//        batch.draw(ironblock, xpos, ypos + 190, 45, 50);
//        batch.draw(ironblock, xpos+90, ypos + 190, 45, 50);
//        batch.draw(ironblock, xpos+32, ypos + 190, 45, 50);
//        batch.draw(ironblock, xpos+58, ypos + 190, 45, 50);
//        batch.draw(glassblock, xpos+20, ypos + 215, 45, 50);
//        batch.draw(glassblock, xpos+70, ypos + 215, 45, 50);
//        batch.draw(woodblock, xpos+28, ypos + 255, 50, 50);
//        batch.draw(woodblock, xpos+58, ypos + 255, 50, 50);
//        batch.draw(pig1.getPigTexture(), xpos+pig1.getPosx(), ypos + pig1.getPosy(), pig1.getWidth(), pig1.getHeight());
//        batch.draw(pig2.getPigTexture(), xpos+pig2.getPosx(),ypos, pig2.getWidth(), pig2.getHeight());
//        batch.draw(woodblock, xpos, ypos + 40, 50, 50);
//        batch.draw(woodblock, xpos, ypos + 70, 50, 50);
//        batch.draw(woodblock, xpos, ypos + 100, 50, 50);
//        batch.draw(pig3.getPigTexture(), xpos+pig3.getPosx(), ypos + pig3.getPosy(), pig3.getWidth(), pig3.getHeight());
//        batch.draw(woodblock, xpos+30, ypos + 100, 50, 50);
//        batch.draw(woodblock, xpos+60, ypos + 100, 50, 50);
//        batch.draw(woodblock, xpos+90, ypos + 100, 50, 50);
//        batch.draw(woodblock, xpos + 90, ypos + 70, 50, 50);
//        batch.draw(woodblock, xpos + 90, ypos + 40, 50, 50);
//
//        // putting the pause button in the middle of the screen
////        batch.draw(pausebutton,xpos-135, ypos-65, 50, 50);
//
//        batch.draw(tntblock, xpos , ypos, 50, 50);
//        batch.draw(tntblock, xpos + 50, ypos, 50, 50);
//        batch.draw(tntblock, xpos +100, ypos, 50, 50);
//
////        batch.draw(go, xpos + 200, ypos-65, 40, 40);
////        batch.draw(go1, 10, ypos-65, 40, 40);
//
//
//
//        batch.end();
//
//        stage.act(delta);
//        stage.draw();
//
//
//
//
//
//
//
//
//
////        if (Gdx.input.isTouched()){
////            int touchX = Gdx.input.getX();
////            int touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
////            if (touchX > xpos-135 && touchX < xpos-135+50 && touchY > ypos-65 && touchY < ypos-65+50){
////                game.setScreen(new PauseScreen(game,this));
////            }
////            if (touchX > xpos + 200 && touchX < xpos + 200 + 40 && touchY > ypos-65 && touchY < ypos-65+40){
////                game.setScreen(new winScreen(game));
////            }
////            if (touchX > 10 && touchX < 10 + 40 && touchY > ypos-65 && touchY < ypos-65+40){
////                game.setScreen(new looseScreen(game));
////            }
////        }
//
//
//    }
//
//    @Override
//    public void resize(int width, int height) {
//        // Resize your screen here. The parameters represent the new window size.
//    }
//
//    @Override
//    public void pause() {
//        // Invoked when your application is paused.
//    }
//
//    @Override
//    public void resume() {
//        // Invoked when your application is resumed after pause.
//    }
//
//    @Override
//    public void hide() {
//        // This method is called when the screen is no longer the current screen.
//    }
//
//    @Override
//    public void dispose() {
//        // Destroy screen's assets here.
//        batch.dispose();
//        background.dispose();
////        pausebutton.dispose();
////        redbird.dispose();
////        yellowbird.dispose();
////        terence.dispose();
//        ironblock.dispose();
//        woodblock.dispose();
//        glassblock.dispose();
//        tntblock.dispose();
////        pig.dispose();
//        catapult.dispose();
//    }
//
//
//
//}
//
//// black , yellow , terence




package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Queue;
import com.badlogic.gdx.utils.ScreenUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor;

public class Level3 implements Screen{

    // defining attributes
    private Main game;
    private SpriteBatch batch;
    private Texture go;
    private Texture go1;
    private Texture background;
    private Texture pausebutton;
    private Texture catapult;
    private Stage stage;

    private structure structure1;

    //birds
//    private redbird redbird1;
//    private bluebird bluebird1;
    private yellowbird yellowbird1;
    private blackbird blackbird1;
    private terence terence1;

    //    private woodblock woodblock1;

    //blocks
    private ironblock i1;
    private ironblock i2;
    private ironblock i3;
    private ironblock i4;
    private ironblock i5;
    private ironblock i6;
    private ironblock i7;
    private ironblock i8;
    private glassblock g1;
    private glassblock g2;
    private woodblock w1;
    private woodblock w2;
    private woodblock w3;
    private woodblock w4;
    private woodblock w5;
    private woodblock w6;
    private woodblock w7;
    private woodblock w8;
    private woodblock w9;
    private woodblock w10;
    private tntblock t1;
    private tntblock t2;
    private tntblock t3;
    private pig p1;
    private pig p2;
    private pig p3;


    private Queue<Birds> birdQueue;
    private Birds currentBird;
    private Vector2 catapultPosition = new Vector2(100, 200); // Example position



    public Level3(Main game){
        // level Constructor
        this.game = game;
        stage = new Stage();
        batch = new SpriteBatch();
        go = new Texture("go1.png");
        go1 = new Texture("go.png");
        background = new Texture("level3background.png");
        pausebutton = new Texture("pausebutton.png");
        catapult = new Texture("catapult.png");

        blackbird1 = new blackbird("Black", 110, 150, 100, 50, 50);
//            stage.addActor(yellowbird1);

        yellowbird1 = new yellowbird("Yellow", 110, 140,100,50, 50);
//            stage.addActor(redbird1);


        terence1 = new terence("Terence", 110, 140, 40, 60, 60);
//            stage.addActor(terence1);


        i1 = new ironblock("Iron", 0+500, 140+70+80-40, 45, 50, 1);
        i2 = new ironblock("Iron", 90+500, 140+70+80-40, 45, 50, 1);
        i3 = new ironblock("Iron", 0+500, 165+70+80-40, 45, 50, 1);
        i4 = new ironblock("Iron", 90+500, 165+70+80-40, 45, 50, 1);
        i5 = new ironblock("Iron", 0+500, 190+70+80-40, 45, 50, 1);
        i6 = new ironblock("Iron", 90+500, 190+70+80-40, 45, 50, 1);
        i7 = new ironblock("Iron", 32+500, 190+70+80-40, 45, 50, 1);
        i8 = new ironblock("Iron", 58+500, 190+70+80-40, 45, 50, 1);

        g1 = new glassblock("Glass", 20+500, 215+70+80-40, 45, 50, 50);
        g2 = new glassblock("Glass", 70+500, 215+70+80-40, 45, 50, 50);

        w1 = new woodblock("Wood", 28+500, 255+70+80-40, 50, 50, 1);
        w2 = new woodblock("Wood", 58+500, 255+70+80-40, 50, 50, 1);
        w3 = new woodblock("Wood", 0+500, 40+70+80-40, 50, 50, 1);
        w4 = new woodblock("Wood", 0+500, 70+70+80-40, 50, 50, 1);
        w5 = new woodblock("Wood", 0+500, 100+70+80-40, 50, 50, 1);
        w6 = new woodblock("Wood", 30+500, 100+70+80-40, 50, 50, 1);
        w7 = new woodblock("Wood", 60+500, 100+70+80-40, 50, 50, 1);
        w8 = new woodblock("Wood", 90+500, 100+70+80-40, 50, 50, 1);
        w9 = new woodblock("Wood", 90+500, 70+70+80-40, 50, 50, 1);
        w10 = new woodblock("Wood", 90+500, 40+70+80-40, 50, 50, 1);

        t1 = new tntblock("TNT", 0+500, 0+70+80-40, 50, 50, 100);
        t2 = new tntblock("TNT", 50+500, 0+70+80-40, 50, 50, 100);
        t3 = new tntblock("TNT", 100+500, 0+70+80-40, 50, 50, 100);

        p1 = new pig(43+500, 290+70+80-40, 40, 40,1);
        p2 = new pig(145+500, 20+70+80-40, 70, 70,1);
        p3 = new pig(45+500, 50+70+80-40, 50, 50,1);

    }



    @Override
    public void show() {
        // Prepare your screen here.
        Gdx.input.setInputProcessor(stage);

        //        birdQueue = new Queue<>();
        //
        //       // Add birds to the queue
        //        birdQueue.addLast(redbird1);
        //        birdQueue.addLast(yellowbird1);
        //        birdQueue.addLast(terence1);
        //
        //
        //        // Set the first bird as the current bird
        //        currentBird = birdQueue.first();
        //        currentBird.setPosition(catapultPosition.x, catapultPosition.y);
        //        stage.addActor(currentBird);

        Drawable god= new TextureRegionDrawable(go);
        ImageButton goButton = new ImageButton(god);
        goButton.setPosition(10, 10);
        goButton.setSize(40,40);
        goButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(new looseScreen(game));
            }
        });

        Drawable go1d= new TextureRegionDrawable(go1);
        ImageButton go1Button = new ImageButton(go1d);
        go1Button.setPosition(740, 10);
        go1Button.setSize(40,40);
        go1Button.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(new winScreen(game, Level3.this));
            }
        });

        Drawable pausebuttond = new TextureRegionDrawable(pausebutton);
        ImageButton pauseButton = new ImageButton(pausebuttond);
        pauseButton.setPosition(370, 45);
        pauseButton.setSize(60,60);
        pauseButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                    try {
                        serialise();
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                game.setScreen(new PauseScreen(game, Level3.this));
            }
        });

        //        redbird1.addListener(new ClickListener(){
        //            @Override
        //            public void clicked(InputEvent event, float x, float y) {
        //                redbird1.addAction(Actions.moveTo(300, 400, 1));
        //                redbird1.addAction(Actions.rotateBy(360, 1));
        //            }
        //        });

        InputListener yellowbirdListener = new InputListener(){
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                System.out.println("red bird touched");
                yellowbird1.startDragging(x, y);
                return true;
            }
            public void touchDragged(InputEvent event, float x, float y, int pointer){
                System.out.println("red bird dragged");
                yellowbird1.startDragging(x, y);
            }
            public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                System.out.println("red bird released");
                yellowbird1.stopDragging();
            }
        };

        InputListener blackbirdListener = new InputListener(){
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                System.out.println("black bird touched");
                blackbird1.startDragging(x, y);
                return true;
            }
            public void touchDragged(InputEvent event, float x, float y, int pointer){
                System.out.println("black bird dragged");
                blackbird1.startDragging(x, y);
            }
            public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                System.out.println("black bird released");
                blackbird1.stopDragging();
            }
        };

        InputListener terenceListener = new InputListener(){
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                System.out.println("terence touched");
                terence1.startDragging(x, y);
                return true;
            }
            public void touchDragged(InputEvent event, float x, float y, int pointer){
                System.out.println("terence dragged");
                terence1.startDragging(x, y);
            }
            public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                System.out.println("terence released");
                terence1.stopDragging();
            }
        };




        yellowbird1.addListener(yellowbirdListener);
        blackbird1.addListener(blackbirdListener);
        terence1.addListener(terenceListener);
//
//            redbird1.addListener(new InputListener(){
//                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
//                    System.out.println("red bird touched");
//                    redbird1.startDragging(x, y);
//                    return true;
//                }
//                public void touchDragged(InputEvent event, float x, float y, int pointer){
//                    System.out.println("red bird dragged");
//                    redbird1.startDragging(x, y);
//                }
//                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
//                    System.out.println("red bird released");
//                    redbird1.stopDragging();
//                }
//            });

//            terence1.addListener(new InputListener(){
//                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
//                    System.out.println("terence touched");
//                    terence1.startDragging(x, y);
//                    return true;
//                }
//                public void touchDragged(InputEvent event, float x, float y, int pointer){
//                    System.out.println("terence dragged");
//                    terence1.startDragging(x, y);
//                }
//                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
//                    System.out.println("terence released");
//                    terence1.stopDragging();
//                }
//            });








        //        w1.addListener(new InputListener(){
        //            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
        //                w1.remove();
        //                return true;
        //            }
        //        });





        stage.addActor(goButton);
        stage.addActor(go1Button);
        stage.addActor(pauseButton);


        stage.addActor(i1);
        stage.addActor(i2);
        stage.addActor(i3);
        stage.addActor(i4);
        stage.addActor(i5);
        stage.addActor(i6);
        stage.addActor(i7);
        stage.addActor(i8);
        stage.addActor(g1);
        stage.addActor(g2);
        stage.addActor(w1);
        stage.addActor(w2);
        stage.addActor(w3);
        stage.addActor(w4);
        stage.addActor(w5);
        stage.addActor(w6);
        stage.addActor(w7);
        stage.addActor(w8);
        stage.addActor(w9);
        stage.addActor(w10);
        stage.addActor(t1);
        stage.addActor(t2);
        stage.addActor(t3);
        stage.addActor(p1);
        stage.addActor(p2);
        stage.addActor(p3);
        stage.addActor(blackbird1);


    }







    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);
//            currentBird = redbird1;

        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(catapult,100,150-40,50,70);
        batch.end();
        // Check collision between redbird and pigs
        //        if (redbird1.getBounds().overlaps(p1.getBounds())) {
        //            System.out.println("Collision detected!");
        ////            p1.setHealth(p1.getHealth() - 1);
        ////            System.out.println("pig health reduced by 1");
        ////            if (p1.getHealth() <= 0) {
        ////                p1.addAction(Actions.removeActor());
        ////
        ////            }
        //            p1.rollAndFall();
        //        }

        //        if (redbird1.getBounds().overlaps(p1.getBounds())) {
        //            System.out.println("Collision detected with pig");
        //            p1.onHitWithActions();
        //
        //        }



        //        // Update bird and pig positions
        //        if (redbird1.getBounds().overlaps(p3.getBounds())) {
        //            System.out.println("Collision detected");
        ////            p2.setVelocityX(300); // Set initial velocity after hit
        ////            p2.setVelocityY(500); // Upward velocity
        //            p3.update(delta); // Update pig's position and handle physics
        //
        //        }

        //        handleCollision();

//            handleCollisions();



        stage.act(delta);
        stage.draw();


        if(blackbird1.getBounds().overlaps(p1.getBounds()) || yellowbird1.getBounds().overlaps(p1.getBounds()) || terence1.getBounds().overlaps(p1.getBounds())){
            p1.sethit(true);
            p1.onHit();
        }
        if(blackbird1.getBounds().overlaps(p2.getBounds()) || yellowbird1.getBounds().overlaps(p2.getBounds()) || terence1.getBounds().overlaps(p2.getBounds())){
            p2.sethit(true);
            p2.onHit();
        }
        if(blackbird1.getBounds().overlaps(p3.getBounds()) || yellowbird1.getBounds().overlaps(p3.getBounds()) || terence1.getBounds().overlaps(p3.getBounds())){
            p3.sethit(true);
            p3.onHit();
        }
        if(blackbird1.getBounds().overlaps(w1.getBounds()) || yellowbird1.getBounds().overlaps(w1.getBounds()) || terence1.getBounds().overlaps(w1.getBounds())){
            w1.onhit();
        }
        if(blackbird1.getBounds().overlaps(w2.getBounds()) || yellowbird1.getBounds().overlaps(w2.getBounds()) || terence1.getBounds().overlaps(w2.getBounds())){
            w2.onhit();
        }
        if(blackbird1.getBounds().overlaps(w3.getBounds()) || yellowbird1.getBounds().overlaps(w3.getBounds()) || terence1.getBounds().overlaps(w3.getBounds())){
            w3.onhit();
        }
        if(blackbird1.getBounds().overlaps(w4.getBounds()) || yellowbird1.getBounds().overlaps(w4.getBounds()) || terence1.getBounds().overlaps(w4.getBounds())){
            w4.onhit();
        }
        if(blackbird1.getBounds().overlaps(w5.getBounds()) || yellowbird1.getBounds().overlaps(w5.getBounds()) || terence1.getBounds().overlaps(w5.getBounds())){
            w5.onhit();
        }
        if(blackbird1.getBounds().overlaps(w6.getBounds()) || yellowbird1.getBounds().overlaps(w6.getBounds()) || terence1.getBounds().overlaps(w6.getBounds())){
            w6.onhit();
        }
        if(blackbird1.getBounds().overlaps(w7.getBounds()) || yellowbird1.getBounds().overlaps(w7.getBounds()) || terence1.getBounds().overlaps(w7.getBounds())){
            w7.onhit();
        }
        if(blackbird1.getBounds().overlaps(w8.getBounds()) || yellowbird1.getBounds().overlaps(w8.getBounds()) || terence1.getBounds().overlaps(w8.getBounds())){
            w8.onhit();
        }
        if(blackbird1.getBounds().overlaps(w9.getBounds()) || yellowbird1.getBounds().overlaps(w9.getBounds()) || terence1.getBounds().overlaps(w9.getBounds())){
            w9.onhit();
        }
        if(blackbird1.getBounds().overlaps(w10.getBounds()) || yellowbird1.getBounds().overlaps(w10.getBounds()) || terence1.getBounds().overlaps(w10.getBounds())){
            w10.onhit();
        }
        if(blackbird1.getBounds().overlaps(i1.getBounds()) || yellowbird1.getBounds().overlaps(i1.getBounds()) || terence1.getBounds().overlaps(i1.getBounds())){
            i1.onhit();
        }
        if(blackbird1.getBounds().overlaps(i2.getBounds()) || yellowbird1.getBounds().overlaps(i2.getBounds()) || terence1.getBounds().overlaps(i2.getBounds())){
            i2.onhit();
        }
        if(blackbird1.getBounds().overlaps(i3.getBounds()) || yellowbird1.getBounds().overlaps(i3.getBounds()) || terence1.getBounds().overlaps(i3.getBounds())){
            i3.onhit();
        }
        if(blackbird1.getBounds().overlaps(i4.getBounds()) || yellowbird1.getBounds().overlaps(i4.getBounds()) || terence1.getBounds().overlaps(i4.getBounds())){
            i4.onhit();
        }
        if(blackbird1.getBounds().overlaps(i5.getBounds()) || yellowbird1.getBounds().overlaps(i5.getBounds()) || terence1.getBounds().overlaps(i5.getBounds())){
            i5.onhit();
        }
        if(blackbird1.getBounds().overlaps(i6.getBounds()) || yellowbird1.getBounds().overlaps(i6.getBounds()) || terence1.getBounds().overlaps(i6.getBounds())){
            i6.onhit();
        }
        if(blackbird1.getBounds().overlaps(i7.getBounds()) || yellowbird1.getBounds().overlaps(i7.getBounds()) || terence1.getBounds().overlaps(i7.getBounds())){
            i7.onhit();
        }
        if(blackbird1.getBounds().overlaps(i8.getBounds()) || yellowbird1.getBounds().overlaps(i8.getBounds()) || terence1.getBounds().overlaps(i8.getBounds())){
            i8.onhit();
        }
        if(blackbird1.getBounds().overlaps(g1.getBounds()) || yellowbird1.getBounds().overlaps(g1.getBounds()) || terence1.getBounds().overlaps(g1.getBounds())){
            g1.onhit();
        }
        if(blackbird1.getBounds().overlaps(g2.getBounds()) || yellowbird1.getBounds().overlaps(g2.getBounds()) || terence1.getBounds().overlaps(g2.getBounds())){
            g2.onhit();
        }
        if(blackbird1.getBounds().overlaps(t1.getBounds()) || yellowbird1.getBounds().overlaps(t1.getBounds()) || terence1.getBounds().overlaps(t1.getBounds())){
            t1.onhit();
        }
        if(blackbird1.getBounds().overlaps(t2.getBounds()) || yellowbird1.getBounds().overlaps(t2.getBounds()) || terence1.getBounds().overlaps(t2.getBounds())){
            t2.onhit();
        }
        if(blackbird1.getBounds().overlaps(t3.getBounds()) || yellowbird1.getBounds().overlaps(t3.getBounds()) || terence1.getBounds().overlaps(t3.getBounds())){
            t3.onhit();
        }
        if(blackbird1.getBounds().overlaps(g1.getBounds()) || yellowbird1.getBounds().overlaps(g1.getBounds()) || terence1.getBounds().overlaps(g1.getBounds())){
            g1.onhit();
        }
        if(blackbird1.getBounds().overlaps(g2.getBounds()) || yellowbird1.getBounds().overlaps(g2.getBounds()) || terence1.getBounds().overlaps(g2.getBounds())){
            g2.onhit();
        }

        if (allpigsdead()){
            game.setScreen(new winScreen(game, Level3.this));
        }

        if (blackbird1.getPosy()<=110){
            blackbird1.remove();
            stage.addActor(yellowbird1);

        }
        if (yellowbird1.getPosy()<=110){
            yellowbird1.remove();
            stage.addActor(terence1);
        }
        if (terence1.getPosy()<=110){
            terence1.remove();
            game.setScreen(new looseScreen(game));
        }

//            switchBirds();











    }

    public void switchBirds (){

    }

    public void onHit(pig pig) {
        int health = pig.getHealth();
        health--;
        pig.setHealth(health);
        System.out.println("Pig health: " + health);
        if (health <= 0) {
            System.out.println("Pig is dead");
            // remove the pig from the stage
            pig.remove();
        }}

    private boolean allpigsdead() {
        if(p1.getHealth() <= -50 && p2.getHealth() <= -50 && p3.getHealth() <= -50){
            return true;
        }
        return false;
    }


    private void handleCollisions() {

    }



    //    private void handleCollisions() {
    //        Actor[] allActors = {
    //            redbird1, yellowbird1, terence1,
    //            p1, p2, p3,
    //            w1, w2, w3, w4,
    //            i1, i2,
    //            g1, g2,
    //            t1, t2
    //        };
    //
    //        for (int i = 0; i < allActors.length; i++) {
    //            for (int j = i + 1; j < allActors.length; j++) {
    //                Actor a = allActors[i];
    //                Actor b = allActors[j];
    //
    //                if (a != null && b != null && overlaps(a, b)) {
    //                    processCollision(a, b);
    //                }
    //            }
    //        }
    //    }
    //
    //    private boolean overlaps(Actor a, Actor b) {
    //        Rectangle rectA = new Rectangle(a.getX(), a.getY(), a.getWidth(), a.getHeight());
    //        Rectangle rectB = new Rectangle(b.getX(), b.getY(), b.getWidth(), b.getHeight());
    //        return rectA.overlaps(rectB);
    //    }
    //
    //    private void processCollision(Actor a, Actor b) {
    //        if (a == redbird1 || a == yellowbird1 || a == terence1) {
    //            reduceHealth(b);
    //            a.setPosition(a.getX(), 0); // Stop bird on ground
    //        } else if (b == redbird1 || b == yellowbird1 || b == terence1) {
    //            reduceHealth(a);
    //            b.setPosition(b.getX(), 0); // Stop bird on ground
    //        } else {
    //            reduceHealth(a);
    //            reduceHealth(b);
    //        }
    //    }
    //
    //    private void reduceHealth(Actor actor) {
    //        if (actor instanceof pig) {
    //            pig p = (pig) actor;
    //            p.setHealth(p.getHealth() - 1);
    //            if (p.getHealth() <= 0) {
    //                stage.getActors().removeValue(p, true);
    //            }
    //        } else if (actor instanceof woodblock) {
    //            woodblock w = (woodblock) actor;
    //            w.setHealth(w.getHealth() - 1);
    //            if (w.getHealth() <= 0) {
    //                stage.getActors().removeValue(w, true);
    //            }
    //        } else if (actor instanceof ironblock) {
    //            ironblock i = (ironblock) actor;
    //            i.setHealth(i.getHealth() - 1);
    //            if (i.getHealth() <= 0) {
    //                stage.getActors().removeValue(i, true);
    //            }
    //        } else if (actor instanceof glassblock) {
    //            glassblock g = (glassblock) actor;
    //            g.setHealth(g.getHealth() - 1);
    //            if (g.getHealth() <= 0) {
    //                stage.getActors().removeValue(g, true);
    //            }
    //        } else if (actor instanceof tntblock) {
    //            tntblock t = (tntblock) actor;
    //            t.setHealth(t.getHealth() - 1);
    //            if (t.getHealth() <= 0) {
    //                stage.getActors().removeValue(t, true);
    //            }
    //        }
    //    }


    @Override
    public void resize(int width, int height) {
        // Resize your screen here. The parameters represent the new window size.
    }

    @Override
    public void pause() {
        // Invoked when your application is paused.
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
        // This method is called when the screen is no longer the current screen.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
        batch.dispose();
        background.dispose();
        //        pausebutton.dispose();
        //        redbird.dispose();
        //        yellowbird.dispose();
        //        terence.dispose();
        //        ironblock.dispose();
        //        woodblock.dispose();
        //        glassblock.dispose();
        //        tntblock.dispose();
        //        pig.dispose();
        catapult.dispose();
    }



    public void serialise() throws FileNotFoundException {
        String filename = "level1.txt";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(blackbird1);
            out.writeObject(yellowbird1);
            out.writeObject(terence1);
            out.writeObject(i1);out.writeObject(i2);out.writeObject(i3);out.writeObject(i4);out.writeObject(i5);out.writeObject(i6);out.writeObject(i7);out.writeObject(i8);
            out.writeObject(g1);out.writeObject(g2);
            out.writeObject(w1);out.writeObject(w2);out.writeObject(w3);out.writeObject(w4);out.writeObject(w5);out.writeObject(w6);out.writeObject(w7);out.writeObject(w8);out.writeObject(w9);out.writeObject(w10);
            out.writeObject(t1);out.writeObject(t2);out.writeObject(t3);
            out.writeObject(p1);out.writeObject(p2);out.writeObject(p3);
            out.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
