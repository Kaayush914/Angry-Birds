//    package com.BirdsAngry;
//
//    import com.badlogic.gdx.Gdx;
//    import com.badlogic.gdx.Screen;
//    import com.badlogic.gdx.graphics.Texture;
//    import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//    import com.badlogic.gdx.math.Vector2;
//    import com.badlogic.gdx.scenes.scene2d.InputEvent;
//    import com.badlogic.gdx.scenes.scene2d.InputListener;
//    import com.badlogic.gdx.scenes.scene2d.Stage;
//    import com.badlogic.gdx.scenes.scene2d.actions.Actions;
//    import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
//    import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
//    import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
//    import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
//    import com.badlogic.gdx.utils.Queue;
//    import com.badlogic.gdx.utils.ScreenUtils;
//
//    import java.io.BufferedWriter;
//    import java.io.FileWriter;
//    import java.io.IOException;
//    import java.io.Serializable;
//    import java.util.LinkedList;
//
//    import static com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor;
//
//    public class Level1 implements Screen {
//
//
//        // defining attributes
//        private Main game;
//        private SpriteBatch batch;
//        private Texture go;
//        private Texture go1;
//        private Texture background;
//        private Texture pausebutton;
//        private Texture catapult;
//        private Stage stage;
//
//        private structure structure1;
//
//        //birds
//        private static redbird redbird1;
//        private static yellowbird yellowbird1;
//        private static terence terence1;
//
//        private Boolean isHit = false;
//
//    //    private woodblock woodblock1;
//
//        //blocks
//        private static ironblock i1;
//        private static ironblock i2;
//        private static ironblock i3;
//        private static ironblock i4;
//        private static ironblock i5;
//        private static ironblock i6;
//        private static ironblock i7;
//        private static ironblock i8;
//        private static glassblock g1;
//        private static glassblock g2;
//        private static woodblock w1;
//        private static woodblock w2;
//        private static woodblock w3;
//        private static woodblock w4;
//        private static woodblock w5;
//        private static woodblock w6;
//        private static woodblock w7;
//        private static woodblock w8;
//        private static woodblock w9;
//        private static woodblock w10;
//        private static tntblock t1;
//        private static tntblock t2;
//        private static tntblock t3;
//        private static pig p1;
//        private static pig p2;
//        private static pig p3;
//
//
//        private Queue<Birds> birdQueue;
//        private Birds currentBird;
//        private Vector2 catapultPosition = new Vector2(100, 200); // Example position
//
//
//
//        public Level1(Main game){
//            // level Constructor
//            this.game = game;
//            stage = new Stage();
//            batch = new SpriteBatch();
//            go = new Texture("go1.png");
//            go1 = new Texture("go.png");
//            background = new Texture("level1background.png");
//            pausebutton = new Texture("pausebutton.png");
//            catapult = new Texture("catapult.png");
//
//            yellowbird1 = new yellowbird("Yellow", 110, 110, 100, 50, 50);
////            stage.addActor(yellowbird1);
//
//            redbird1 = new redbird("Red", 110, 110,100,50, 50);
////            stage.addActor(redbird1);
//
//
//            terence1 = new terence("Terence", 110, 110, 40, 60, 60);
////            stage.addActor(terence1);
//
//
//            i1 = new ironblock("Iron", 0+500, 140+70, 45, 50, 1);
//            i2 = new ironblock("Iron", 90+500, 140+70, 45, 50, 1);
//            i3 = new ironblock("Iron", 0+500, 165+70, 45, 50, 1);
//            i4 = new ironblock("Iron", 90+500, 165+70, 45, 50, 1);
//            i5 = new ironblock("Iron", 0+500, 190+70, 45, 50, 1);
//            i6 = new ironblock("Iron", 90+500, 190+70, 45, 50, 1);
//            i7 = new ironblock("Iron", 32+500, 190+70, 45, 50, 1);
//            i8 = new ironblock("Iron", 58+500, 190+70, 45, 50, 1);
//
//            g1 = new glassblock("Glass", 20+500, 215+70, 45, 50, 50);
//            g2 = new glassblock("Glass", 70+500, 215+70, 45, 50, 50);
//
//            w1 = new woodblock("Wood", 28+500, 255+70, 50, 50, 1);
//            w2 = new woodblock("Wood", 58+500, 255+70, 50, 50, 1);
//            w3 = new woodblock("Wood", 0+500, 40+70, 50, 50, 1);
//            w4 = new woodblock("Wood", 0+500, 70+70, 50, 50, 1);
//            w5 = new woodblock("Wood", 0+500, 100+70, 50, 50, 1);
//            w6 = new woodblock("Wood", 30+500, 100+70, 50, 50, 1);
//            w7 = new woodblock("Wood", 60+500, 100+70, 50, 50, 1);
//            w8 = new woodblock("Wood", 90+500, 100+70, 50, 50, 1);
//            w9 = new woodblock("Wood", 90+500, 70+70, 50, 50, 1);
//            w10 = new woodblock("Wood", 90+500, 40+70, 50, 50, 1);
//
//            t1 = new tntblock("TNT", 0+500, 0+70, 50, 50, 100);
//            t2 = new tntblock("TNT", 50+500, 0+70, 50, 50, 100);
//            t3 = new tntblock("TNT", 100+500, 0+70, 50, 50, 100);
//
//            p1 = new pig(43+500, 290+70, 40, 40,1);
//            p2 = new pig(145+500, 20+70, 70, 70,3);
//            p3 = new pig(45+500, 50+70, 50, 50,2);
//
//        }
//
//
//
//        @Override
//        public void show() {
//            // Prepare your screen here.
//            Gdx.input.setInputProcessor(stage);
//
//            Drawable god= new TextureRegionDrawable(go);
//            ImageButton goButton = new ImageButton(god);
//            goButton.setPosition(10, 10);
//            goButton.setSize(40,40);
//            goButton.addListener(new ClickListener(){
//                @Override
//                public void clicked(InputEvent event, float x, float y){
//                    game.setScreen(new looseScreen(game));
//                }
//            });
//
//            Drawable go1d= new TextureRegionDrawable(go1);
//            ImageButton go1Button = new ImageButton(go1d);
//            go1Button.setPosition(740, 10);
//            go1Button.setSize(40,40);
//            go1Button.addListener(new ClickListener(){
//                @Override
//                public void clicked(InputEvent event, float x, float y){
//                    game.setScreen(new winScreen(game, Level1.this));
//                }
//            });
//
//            Drawable pausebuttond = new TextureRegionDrawable(pausebutton);
//            ImageButton pauseButton = new ImageButton(pausebuttond);
//            pauseButton.setPosition(370, 5);
//            pauseButton.setSize(60,60);
//            pauseButton.addListener(new ClickListener(){
//                @Override
//                public void clicked(InputEvent event, float x, float y){
//                    game.setScreen(new PauseScreen(game, Level1.this));
//                }
//            });
//
//            InputListener redbirdListener = new InputListener(){
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
//            };
//
//            InputListener yellowbbirdListener = new InputListener(){
//                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
//                    System.out.println("yellow bird touched");
//                    yellowbird1.startDragging(x, y);
//                    return true;
//                }
//                public void touchDragged(InputEvent event, float x, float y, int pointer){
//                    System.out.println("yellow bird dragged");
//                    yellowbird1.startDragging(x, y);
//                }
//                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
//                    System.out.println("yellow bird released");
//                    yellowbird1.stopDragging();
//                }
//            };
//
//            InputListener terenceListener = new InputListener(){
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
//            };
//            redbird1.addListener(redbirdListener);
//            yellowbird1.addListener(yellowbbirdListener);
//            terence1.addListener(terenceListener);
//
//            stage.addActor(goButton);
//            stage.addActor(go1Button);
//            stage.addActor(pauseButton);
//
//
//            stage.addActor(i1);
//            stage.addActor(i2);
//            stage.addActor(i3);
//            stage.addActor(i4);
//            stage.addActor(i5);
//            stage.addActor(i6);
//            stage.addActor(i7);
//            stage.addActor(i8);
//            stage.addActor(g1);
//            stage.addActor(g2);
//            stage.addActor(w1);
//            stage.addActor(w2);
//            stage.addActor(w3);
//            stage.addActor(w4);
//            stage.addActor(w5);
//            stage.addActor(w6);
//            stage.addActor(w7);
//            stage.addActor(w8);
//            stage.addActor(w9);
//            stage.addActor(w10);
//            stage.addActor(t1);
//            stage.addActor(t2);
//            stage.addActor(t3);
//            stage.addActor(p1);
//            stage.addActor(p2);
//            stage.addActor(p3);
//            stage.addActor(redbird1);
//
//
//        }
//        @Override
//        public void render(float delta) {
//            // Draw your screen here. "delta" is the time since last render in seconds.
//            ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);
////            currentBird = redbird1;
//
//            batch.begin();
//            batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//            batch.draw(catapult,100,70,50,70);
//            batch.end();
//
//
//            if(redbird1.getBounds().overlaps(p1.getBounds()) || yellowbird1.getBounds().overlaps(p1.getBounds()) || terence1.getBounds().overlaps(p1.getBounds())){
//                p1.sethit(true);
//                p1.onHit();
//            }
//            if(redbird1.getBounds().overlaps(p2.getBounds()) || yellowbird1.getBounds().overlaps(p2.getBounds()) || terence1.getBounds().overlaps(p2.getBounds())){
//                p2.sethit(true);
//                p2.onHit();
//            }
//            if(redbird1.getBounds().overlaps(p3.getBounds()) || yellowbird1.getBounds().overlaps(p3.getBounds()) || terence1.getBounds().overlaps(p3.getBounds())){
//                p3.sethit(true);
//                p3.onHit();
//            }
//            if(redbird1.getBounds().overlaps(w1.getBounds()) || yellowbird1.getBounds().overlaps(w1.getBounds()) || terence1.getBounds().overlaps(w1.getBounds())){
//                w1.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w2.getBounds()) || yellowbird1.getBounds().overlaps(w2.getBounds()) || terence1.getBounds().overlaps(w2.getBounds())){
//                w2.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w3.getBounds()) || yellowbird1.getBounds().overlaps(w3.getBounds()) || terence1.getBounds().overlaps(w3.getBounds())){
//                w3.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w4.getBounds()) || yellowbird1.getBounds().overlaps(w4.getBounds()) || terence1.getBounds().overlaps(w4.getBounds())){
//                w4.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w5.getBounds()) || yellowbird1.getBounds().overlaps(w5.getBounds()) || terence1.getBounds().overlaps(w5.getBounds())){
//                w5.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w6.getBounds()) || yellowbird1.getBounds().overlaps(w6.getBounds()) || terence1.getBounds().overlaps(w6.getBounds())){
//                w6.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w7.getBounds()) || yellowbird1.getBounds().overlaps(w7.getBounds()) || terence1.getBounds().overlaps(w7.getBounds())){
//                w7.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w8.getBounds()) || yellowbird1.getBounds().overlaps(w8.getBounds()) || terence1.getBounds().overlaps(w8.getBounds())){
//                w8.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w9.getBounds()) || yellowbird1.getBounds().overlaps(w9.getBounds()) || terence1.getBounds().overlaps(w9.getBounds())){
//                w9.onhit();
//            }
//            if(redbird1.getBounds().overlaps(w10.getBounds()) || yellowbird1.getBounds().overlaps(w10.getBounds()) || terence1.getBounds().overlaps(w10.getBounds())){
//                w10.onhit();
//            }
//            if(redbird1.getBounds().overlaps(i1.getBounds()) || yellowbird1.getBounds().overlaps(i1.getBounds()) || terence1.getBounds().overlaps(i1.getBounds())){
//                i1.onhit();
//            }
//            if(redbird1.getBounds().overlaps(i2.getBounds()) || yellowbird1.getBounds().overlaps(i2.getBounds()) || terence1.getBounds().overlaps(i2.getBounds())){
//                i2.onhit();
//            }
//            if(redbird1.getBounds().overlaps(i3.getBounds()) || yellowbird1.getBounds().overlaps(i3.getBounds()) || terence1.getBounds().overlaps(i3.getBounds())){
//                i3.onhit();
//            }
//            if(redbird1.getBounds().overlaps(i4.getBounds()) || yellowbird1.getBounds().overlaps(i4.getBounds()) || terence1.getBounds().overlaps(i4.getBounds())){
//                i4.onhit();
//            }
//            if(redbird1.getBounds().overlaps(i5.getBounds()) || yellowbird1.getBounds().overlaps(i5.getBounds()) || terence1.getBounds().overlaps(i5.getBounds())){
//                i5.onhit();
//            }
//            if(redbird1.getBounds().overlaps(i6.getBounds()) || yellowbird1.getBounds().overlaps(i6.getBounds()) || terence1.getBounds().overlaps(i6.getBounds())){
//                i6.onhit();
//            }
//            if(redbird1.getBounds().overlaps(i7.getBounds()) || yellowbird1.getBounds().overlaps(i7.getBounds()) || terence1.getBounds().overlaps(i7.getBounds())){
//                i7.onhit();
//            }
//            if(redbird1.getBounds().overlaps(i8.getBounds()) || yellowbird1.getBounds().overlaps(i8.getBounds()) || terence1.getBounds().overlaps(i8.getBounds())){
//                i8.onhit();
//            }
//            if(redbird1.getBounds().overlaps(g1.getBounds()) || yellowbird1.getBounds().overlaps(g1.getBounds()) || terence1.getBounds().overlaps(g1.getBounds())){
//                g1.onhit();
//            }
//            if(redbird1.getBounds().overlaps(g2.getBounds()) || yellowbird1.getBounds().overlaps(g2.getBounds()) || terence1.getBounds().overlaps(g2.getBounds())){
//                g2.onhit();
//            }
//            if(redbird1.getBounds().overlaps(t1.getBounds()) || yellowbird1.getBounds().overlaps(t1.getBounds()) || terence1.getBounds().overlaps(t1.getBounds())){
//                t1.onhit();
//            }
//            if(redbird1.getBounds().overlaps(t2.getBounds()) || yellowbird1.getBounds().overlaps(t2.getBounds()) || terence1.getBounds().overlaps(t2.getBounds())){
//                t2.onhit();
//            }
//            if(redbird1.getBounds().overlaps(t3.getBounds()) || yellowbird1.getBounds().overlaps(t3.getBounds()) || terence1.getBounds().overlaps(t3.getBounds())){
//                t3.onhit();
//            }
//            if(redbird1.getBounds().overlaps(g1.getBounds()) || yellowbird1.getBounds().overlaps(g1.getBounds()) || terence1.getBounds().overlaps(g1.getBounds())){
//                g1.onhit();
//            }
//            if(redbird1.getBounds().overlaps(g2.getBounds()) || yellowbird1.getBounds().overlaps(g2.getBounds()) || terence1.getBounds().overlaps(g2.getBounds())){
//                g2.onhit();
//            }
//
//            if (allpigsdead()){
//                game.setScreen(new winScreen(game, Level1.this));
//            }
//
//            if (redbird1.getPosy()<=70){
//                redbird1.remove();
//                stage.addActor(yellowbird1);
//
//            }
//            if (yellowbird1.getPosy()<=70){
//                yellowbird1.remove();
//                stage.addActor(terence1);
//            }
//            if (terence1.getPosy()<=70){
//                terence1.remove();
//                game.setScreen(new looseScreen(game));
//            }
//
//            stage.act(delta);
//            stage.draw();
//
//        }
//
//        private boolean allpigsdead() {
//            if(p1.getHealth() <= -50 && p2.getHealth() <= -50 && p3.getHealth() <= -50){
//                return true;
//            }
//            return false;
//        }
//        @Override
//        public void resize(int width, int height) {
//            // Resize your screen here. The parameters represent the new window size.
//        }
//
//        @Override
//        public void pause() {
//            // Invoked when your application is paused.
//        }
//
//        @Override
//        public void resume() {
//            // Invoked when your application is resumed after pause.
//        }
//
//        @Override
//        public void hide() {
//            // This method is called when the screen is no longer the current screen.
//        }
//
//        @Override
//        public void dispose() {
//            // Destroy screen's assets here.
//            batch.dispose();
//            background.dispose();
//    //        pausebutton.dispose();
//    //        redbird.dispose();
//    //        yellowbird.dispose();
//    //        terence.dispose();
//    //        ironblock.dispose();
//    //        woodblock.dispose();
//    //        glassblock.dispose();
//    //        tntblock.dispose();
//    //        pig.dispose();
//            catapult.dispose();
//        }
//    }















// trying serialization

package com.BirdsAngry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Queue;
import com.badlogic.gdx.utils.ScreenUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.removeActor;

public class Level1 implements Screen, Serializable {


    // defining attributes
    private transient Main game;
    private transient SpriteBatch batch;
    private transient Texture go;
    private transient Texture go1;
    private transient Texture background;
    private transient Texture pausebutton;
    private transient Texture catapult;
    private transient Stage stage;

    private structure structure1;

    //birds
    private redbird redbird1;
    private yellowbird yellowbird1;
    private terence terence1;

    private Boolean isHit = false;

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


    public Level1(Main game) {
        // level Constructor
        this.game = game;
        stage = new Stage();
        batch = new SpriteBatch();
        go = new Texture("go1.png");
        go1 = new Texture("go.png");
        background = new Texture("level1background.png");
        pausebutton = new Texture("pausebutton.png");
        catapult = new Texture("catapult.png");

        yellowbird1 = new yellowbird("Yellow", 110, 110, 100, 50, 50);
//            stage.addActor(yellowbird1);

        redbird1 = new redbird("Red", 110, 110, 100, 50, 50);
//            stage.addActor(redbird1);


        terence1 = new terence("Terence", 110, 110, 40, 60, 60);
//            stage.addActor(terence1);


        i1 = new ironblock("Iron", 0 + 500, 140 + 70, 45, 50, 1);
        i2 = new ironblock("Iron", 90 + 500, 140 + 70, 45, 50, 1);
        i3 = new ironblock("Iron", 0 + 500, 165 + 70, 45, 50, 1);
        i4 = new ironblock("Iron", 90 + 500, 165 + 70, 45, 50, 1);
        i5 = new ironblock("Iron", 0 + 500, 190 + 70, 45, 50, 1);
        i6 = new ironblock("Iron", 90 + 500, 190 + 70, 45, 50, 1);
        i7 = new ironblock("Iron", 32 + 500, 190 + 70, 45, 50, 1);
        i8 = new ironblock("Iron", 58 + 500, 190 + 70, 45, 50, 1);

        g1 = new glassblock("Glass", 20 + 500, 215 + 70, 45, 50, 50);
        g2 = new glassblock("Glass", 70 + 500, 215 + 70, 45, 50, 50);

        w1 = new woodblock("Wood", 28 + 500, 255 + 70, 50, 50, 1);
        w2 = new woodblock("Wood", 58 + 500, 255 + 70, 50, 50, 1);
        w3 = new woodblock("Wood", 0 + 500, 40 + 70, 50, 50, 1);
        w4 = new woodblock("Wood", 0 + 500, 70 + 70, 50, 50, 1);
        w5 = new woodblock("Wood", 0 + 500, 100 + 70, 50, 50, 1);
        w6 = new woodblock("Wood", 30 + 500, 100 + 70, 50, 50, 1);
        w7 = new woodblock("Wood", 60 + 500, 100 + 70, 50, 50, 1);
        w8 = new woodblock("Wood", 90 + 500, 100 + 70, 50, 50, 1);
        w9 = new woodblock("Wood", 90 + 500, 70 + 70, 50, 50, 1);
        w10 = new woodblock("Wood", 90 + 500, 40 + 70, 50, 50, 1);

        t1 = new tntblock("TNT", 0 + 500, 0 + 70, 50, 50, 100);
        t2 = new tntblock("TNT", 50 + 500, 0 + 70, 50, 50, 100);
        t3 = new tntblock("TNT", 100 + 500, 0 + 70, 50, 50, 100);

        p1 = new pig(43 + 500, 290 + 70, 40, 40, 1);
        p2 = new pig(145 + 500, 20 + 70, 70, 70, 3);
        p3 = new pig(45 + 500, 50 + 70, 50, 50, 2);

    }


    @Override
    public void show() {
        // Prepare your screen here.
        Gdx.input.setInputProcessor(stage);

        Drawable god = new TextureRegionDrawable(go);
        ImageButton goButton = new ImageButton(god);
        goButton.setPosition(10, 10);
        goButton.setSize(40, 40);
        goButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new looseScreen(game));
            }
        });

        Drawable go1d = new TextureRegionDrawable(go1);
        ImageButton go1Button = new ImageButton(go1d);
        go1Button.setPosition(740, 10);
        go1Button.setSize(40, 40);
        go1Button.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new winScreen(game, Level1.this));
            }
        });

        Drawable pausebuttond = new TextureRegionDrawable(pausebutton);
        ImageButton pauseButton = new ImageButton(pausebuttond);
        pauseButton.setPosition(370, 5);
        pauseButton.setSize(60, 60);
        pauseButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                try {
                    serialise();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                game.setScreen(new PauseScreen(game, Level1.this));
            }
        });

        InputListener redbirdListener = new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("red bird touched");
                redbird1.startDragging(x, y);
                return true;
            }

            public void touchDragged(InputEvent event, float x, float y, int pointer) {
                System.out.println("red bird dragged");
                redbird1.startDragging(x, y);
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("red bird released");
                redbird1.stopDragging();
            }
        };

        InputListener yellowbbirdListener = new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("yellow bird touched");
                yellowbird1.startDragging(x, y);
                return true;
            }

            public void touchDragged(InputEvent event, float x, float y, int pointer) {
                System.out.println("yellow bird dragged");
                yellowbird1.startDragging(x, y);
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("yellow bird released");
                yellowbird1.stopDragging();
            }
        };

        InputListener terenceListener = new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("terence touched");
                terence1.startDragging(x, y);
                return true;
            }

            public void touchDragged(InputEvent event, float x, float y, int pointer) {
                System.out.println("terence dragged");
                terence1.startDragging(x, y);
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                System.out.println("terence released");
                terence1.stopDragging();
            }
        };
        redbird1.addListener(redbirdListener);
        yellowbird1.addListener(yellowbbirdListener);
        terence1.addListener(terenceListener);

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
        stage.addActor(redbird1);


    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);
            currentBird = redbird1;

        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(catapult, 100, 70, 50, 70);
        batch.end();


        if (redbird1.getBounds().overlaps(p1.getBounds()) || yellowbird1.getBounds().overlaps(p1.getBounds()) || terence1.getBounds().overlaps(p1.getBounds())) {
            p1.sethit(true);
            p1.onHit();
        }
        if (redbird1.getBounds().overlaps(p2.getBounds()) || yellowbird1.getBounds().overlaps(p2.getBounds()) || terence1.getBounds().overlaps(p2.getBounds())) {
            p2.sethit(true);
            p2.onHit();
        }
        if (redbird1.getBounds().overlaps(p3.getBounds()) || yellowbird1.getBounds().overlaps(p3.getBounds()) || terence1.getBounds().overlaps(p3.getBounds())) {
            p3.sethit(true);
            p3.onHit();
        }
        if (redbird1.getBounds().overlaps(w1.getBounds()) || yellowbird1.getBounds().overlaps(w1.getBounds()) || terence1.getBounds().overlaps(w1.getBounds())) {
            w1.onhit();
        }
        if (redbird1.getBounds().overlaps(w2.getBounds()) || yellowbird1.getBounds().overlaps(w2.getBounds()) || terence1.getBounds().overlaps(w2.getBounds())) {
            w2.onhit();
        }
        if (redbird1.getBounds().overlaps(w3.getBounds()) || yellowbird1.getBounds().overlaps(w3.getBounds()) || terence1.getBounds().overlaps(w3.getBounds())) {
            w3.onhit();
        }
        if (redbird1.getBounds().overlaps(w4.getBounds()) || yellowbird1.getBounds().overlaps(w4.getBounds()) || terence1.getBounds().overlaps(w4.getBounds())) {
            w4.onhit();
        }
        if (redbird1.getBounds().overlaps(w5.getBounds()) || yellowbird1.getBounds().overlaps(w5.getBounds()) || terence1.getBounds().overlaps(w5.getBounds())) {
            w5.onhit();
        }
        if (redbird1.getBounds().overlaps(w6.getBounds()) || yellowbird1.getBounds().overlaps(w6.getBounds()) || terence1.getBounds().overlaps(w6.getBounds())) {
            w6.onhit();
        }
        if (redbird1.getBounds().overlaps(w7.getBounds()) || yellowbird1.getBounds().overlaps(w7.getBounds()) || terence1.getBounds().overlaps(w7.getBounds())) {
            w7.onhit();
        }
        if (redbird1.getBounds().overlaps(w8.getBounds()) || yellowbird1.getBounds().overlaps(w8.getBounds()) || terence1.getBounds().overlaps(w8.getBounds())) {
            w8.onhit();
        }
        if (redbird1.getBounds().overlaps(w9.getBounds()) || yellowbird1.getBounds().overlaps(w9.getBounds()) || terence1.getBounds().overlaps(w9.getBounds())) {
            w9.onhit();
        }
        if (redbird1.getBounds().overlaps(w10.getBounds()) || yellowbird1.getBounds().overlaps(w10.getBounds()) || terence1.getBounds().overlaps(w10.getBounds())) {
            w10.onhit();
        }
        if (redbird1.getBounds().overlaps(i1.getBounds()) || yellowbird1.getBounds().overlaps(i1.getBounds()) || terence1.getBounds().overlaps(i1.getBounds())) {
            i1.onhit();
        }
        if (redbird1.getBounds().overlaps(i2.getBounds()) || yellowbird1.getBounds().overlaps(i2.getBounds()) || terence1.getBounds().overlaps(i2.getBounds())) {
            i2.onhit();
        }
        if (redbird1.getBounds().overlaps(i3.getBounds()) || yellowbird1.getBounds().overlaps(i3.getBounds()) || terence1.getBounds().overlaps(i3.getBounds())) {
            i3.onhit();
        }
        if (redbird1.getBounds().overlaps(i4.getBounds()) || yellowbird1.getBounds().overlaps(i4.getBounds()) || terence1.getBounds().overlaps(i4.getBounds())) {
            i4.onhit();
        }
        if (redbird1.getBounds().overlaps(i5.getBounds()) || yellowbird1.getBounds().overlaps(i5.getBounds()) || terence1.getBounds().overlaps(i5.getBounds())) {
            i5.onhit();
        }
        if (redbird1.getBounds().overlaps(i6.getBounds()) || yellowbird1.getBounds().overlaps(i6.getBounds()) || terence1.getBounds().overlaps(i6.getBounds())) {
            i6.onhit();
        }
        if (redbird1.getBounds().overlaps(i7.getBounds()) || yellowbird1.getBounds().overlaps(i7.getBounds()) || terence1.getBounds().overlaps(i7.getBounds())) {
            i7.onhit();
        }
        if (redbird1.getBounds().overlaps(i8.getBounds()) || yellowbird1.getBounds().overlaps(i8.getBounds()) || terence1.getBounds().overlaps(i8.getBounds())) {
            i8.onhit();
        }
        if (redbird1.getBounds().overlaps(g1.getBounds()) || yellowbird1.getBounds().overlaps(g1.getBounds()) || terence1.getBounds().overlaps(g1.getBounds())) {
            g1.onhit();
        }
        if (redbird1.getBounds().overlaps(g2.getBounds()) || yellowbird1.getBounds().overlaps(g2.getBounds()) || terence1.getBounds().overlaps(g2.getBounds())) {
            g2.onhit();
        }
        if (redbird1.getBounds().overlaps(t1.getBounds()) || yellowbird1.getBounds().overlaps(t1.getBounds()) || terence1.getBounds().overlaps(t1.getBounds())) {
            t1.onhit();
        }
        if (redbird1.getBounds().overlaps(t2.getBounds()) || yellowbird1.getBounds().overlaps(t2.getBounds()) || terence1.getBounds().overlaps(t2.getBounds())) {
            t2.onhit();
        }
        if (redbird1.getBounds().overlaps(t3.getBounds()) || yellowbird1.getBounds().overlaps(t3.getBounds()) || terence1.getBounds().overlaps(t3.getBounds())) {
            t3.onhit();
        }
        if (redbird1.getBounds().overlaps(g1.getBounds()) || yellowbird1.getBounds().overlaps(g1.getBounds()) || terence1.getBounds().overlaps(g1.getBounds())) {
            g1.onhit();
        }
        if (redbird1.getBounds().overlaps(g2.getBounds()) || yellowbird1.getBounds().overlaps(g2.getBounds()) || terence1.getBounds().overlaps(g2.getBounds())) {
            g2.onhit();
        }

        if (allpigsdead()) {
            game.setScreen(new winScreen(game, Level1.this));
        }

        if (redbird1.getPosy() <= 70) {
            redbird1.remove();
            currentBird = yellowbird1;
            stage.addActor(yellowbird1);

        }
        if (yellowbird1.getPosy() <= 70) {
            yellowbird1.remove();
            currentBird = terence1;
            stage.addActor(terence1);
        }
        if (terence1.getPosy() <= 70) {
            terence1.remove();
            game.setScreen(new looseScreen(game));
        }

        stage.act(delta);
        stage.draw();

    }

    private boolean allpigsdead() {
        if (p1.getHealth() <= -50 && p2.getHealth() <= -50 && p3.getHealth() <= -50) {
            return true;
        }
        return false;
    }

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
                pausebutton.dispose();
        catapult.dispose();
    }


    public void serialise() throws FileNotFoundException {
        String filename = "level1.txt";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(redbird1);
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


