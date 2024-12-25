package com.BirdsAngry;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class createloadgame implements Screen {
    private Main game;
    private final Screen current_level;
    private transient SpriteBatch batch;
    private transient Texture go;
    private transient Texture go1;
    private transient Texture background;
    private transient Texture pausebutton;
    private transient Texture catapult;
    private transient Stage stage;
    // deserialize the game

    ironblock iron1,iron2,iron3,iron4,iron5,iron6,iron7,iron8;
    glassblock glass1,glass2;
    woodblock wood1,wood2,wood3,wood4,wood5,wood6,wood7,wood8,wood9,wood10;
    tntblock tnt1,tnt2,tnt3;
    pig pigu1,pigu2,pigu3;
    redbird r1;
    yellowbird y1;
    terence t1;
    bluebird b1;
    bluebird b11;
    bluebird b12;
    blackbird bl1;


    public createloadgame(Main game, SpriteBatch batch, Texture go, Texture go1, Texture background, Texture pausebutton, Texture catapult, Stage stage, Screen current_level) {
        this.game = game;
        this.batch = batch;
        this.go = go;
        this.go1 = go1;
        this.background = background;
        this.pausebutton = pausebutton;
        this.catapult = catapult;
        this.stage = stage;
        this.current_level = current_level;

       if (current_level instanceof Level1){
           try {
               // Reading the object from a file
               FileInputStream file = new FileInputStream("level1.txt");
               ObjectInputStream in = new ObjectInputStream(file);
               redbird redbird1 = (redbird) in.readObject();
               r1 = new redbird(redbird1.getName(), redbird1.getPosx(), redbird1.getPosy(), redbird1.getBirdVelocity(),(int) redbird1.getWidth(), (int) redbird1.getHeight());
               yellowbird yellowbird1 = (yellowbird) in.readObject();
               y1 = new yellowbird(yellowbird1.getName(), yellowbird1.getPosx(), yellowbird1.getPosy(), yellowbird1.getBirdVelocity(),(int) yellowbird1.getWidth(), (int) yellowbird1.getHeight());
               terence terencebird1 = (terence) in.readObject();
               t1 = new terence(terencebird1.getName(), terencebird1.getPosx(), terencebird1.getPosy(), terencebird1.getBirdVelocity(),(int) terencebird1.getWidth(), (int) terencebird1.getHeight());
               ironblock i1 = (ironblock) in.readObject();
               iron1 = new ironblock(i1.getName(), i1.getPosx(), i1.getPosy(), (int) i1.getWidth(), (int) i1.getHeight(), i1.getHealth());
               ironblock i2 = (ironblock) in.readObject();
                iron2 = new ironblock(i2.getName(), i2.getPosx(), i2.getPosy(), (int) i2.getWidth(), (int) i2.getHeight(), i2.getHealth());
               ironblock i3 = (ironblock) in.readObject();
                iron3 = new ironblock(i3.getName(), i3.getPosx(), i3.getPosy(), (int) i3.getWidth(), (int) i3.getHeight(), i3.getHealth());
               ironblock i4 = (ironblock) in.readObject();
                iron4 = new ironblock(i4.getName(), i4.getPosx(), i4.getPosy(), (int) i4.getWidth(), (int) i4.getHeight(), i4.getHealth());
               ironblock i5 = (ironblock) in.readObject();
                iron5 = new ironblock(i5.getName(), i5.getPosx(), i5.getPosy(), (int) i5.getWidth(), (int) i5.getHeight(), i5.getHealth());
               ironblock i6 = (ironblock) in.readObject();
                iron6 = new ironblock(i6.getName(), i6.getPosx(), i6.getPosy(), (int) i6.getWidth(), (int) i6.getHeight(), i6.getHealth());
               ironblock i7 = (ironblock) in.readObject();
                iron7 = new ironblock(i7.getName(), i7.getPosx(), i7.getPosy(), (int) i7.getWidth(), (int) i7.getHeight(), i7.getHealth());
               ironblock i8 = (ironblock) in.readObject();
                iron8 = new ironblock(i8.getName(), i8.getPosx(), i8.getPosy(), (int) i8.getWidth(), (int) i8.getHeight(), i8.getHealth());

               glassblock g1 = (glassblock) in.readObject();
                glass1 = new glassblock(g1.getName(), g1.getPosx(), g1.getPosy(), (int) g1.getWidth(), (int) g1.getHeight(), g1.getHealth());
               glassblock g2 = (glassblock) in.readObject();
                glass2 = new glassblock(g2.getName(), g2.getPosx(), g2.getPosy(), (int) g2.getWidth(), (int) g2.getHeight(), g2.getHealth());

               woodblock w1 = (woodblock) in.readObject();
                wood1 = new woodblock(w1.getName(), w1.getPosx(), w1.getPosy(), (int) w1.getWidth(), (int) w1.getHeight(), w1.getHealth());
               woodblock w2 = (woodblock) in.readObject();
                wood2 = new woodblock(w2.getName(), w2.getPosx(), w2.getPosy(), (int) w2.getWidth(), (int) w2.getHeight(), w2.getHealth());
               woodblock w3 = (woodblock) in.readObject();
                wood3 = new woodblock(w3.getName(), w3.getPosx(), w3.getPosy(), (int) w3.getWidth(), (int) w3.getHeight(), w3.getHealth());
               woodblock w4 = (woodblock) in.readObject();
                wood4 = new woodblock(w4.getName(), w4.getPosx(), w4.getPosy(), (int) w4.getWidth(), (int) w4.getHeight(), w4.getHealth());
               woodblock w5 = (woodblock) in.readObject();
                wood5 = new woodblock(w5.getName(), w5.getPosx(), w5.getPosy(), (int) w5.getWidth(), (int) w5.getHeight(), w5.getHealth());
               woodblock w6 = (woodblock) in.readObject();
                wood6 = new woodblock(w6.getName(), w6.getPosx(), w6.getPosy(), (int) w6.getWidth(), (int) w6.getHeight(), w6.getHealth());
               woodblock w7 = (woodblock) in.readObject();
                wood7 = new woodblock(w7.getName(), w7.getPosx(), w7.getPosy(), (int) w7.getWidth(), (int) w7.getHeight(), w7.getHealth());
               woodblock w8 = (woodblock) in.readObject();
                wood8 = new woodblock(w8.getName(), w8.getPosx(), w8.getPosy(), (int) w8.getWidth(), (int) w8.getHeight(), w8.getHealth());
               woodblock w9 = (woodblock) in.readObject();
                wood9 = new woodblock(w9.getName(), w9.getPosx(), w9.getPosy(), (int) w9.getWidth(), (int) w9.getHeight(), w9.getHealth());
               woodblock w10 = (woodblock) in.readObject();
                wood10 = new woodblock(w10.getName(), w10.getPosx(), w10.getPosy(), (int) w10.getWidth(), (int) w10.getHeight(), w10.getHealth());

               tntblock t1 = (tntblock) in.readObject();
                tnt1 = new tntblock(t1.getName(), t1.getPosx(), t1.getPosy(), (int) t1.getWidth(), (int) t1.getHeight(), t1.getHealth());
               tntblock t2 = (tntblock) in.readObject();
                tnt2 = new tntblock(t2.getName(), t2.getPosx(), t2.getPosy(), (int) t2.getWidth(), (int) t2.getHeight(), t2.getHealth());
               tntblock t3 = (tntblock) in.readObject();
                tnt3 = new tntblock(t3.getName(), t3.getPosx(), t3.getPosy(), (int) t3.getWidth(), (int) t3.getHeight(), t3.getHealth());

               pig pig1 = (pig) in.readObject();
                pigu1 = new pig(pig1.getPosx(), pig1.getPosy(), (int) pig1.getWidth(), (int) pig1.getHeight(), pig1.getHealth());
               pig pig2 = (pig) in.readObject();
                pigu2 = new pig(pig2.getPosx(), pig2.getPosy(), (int) pig2.getWidth(), (int) pig2.getHeight(), pig2.getHealth());
               pig pig3 = (pig) in.readObject();
                pigu3 = new pig(pig3.getPosx(), pig3.getPosy(), (int) pig3.getWidth(), (int) pig3.getHeight(), pig3.getHealth());

               // Closing the stream
               in.close();
               file.close();
           }
           catch (FileNotFoundException e) {
               e.printStackTrace();
           }
           catch (IOException e) {
               e.printStackTrace();
           } catch (ClassNotFoundException e) {
               throw new RuntimeException(e);
           }
       }
       // -------------------------------------------------------------------

        if (current_level instanceof Level2){
            try {
                // Reading the object from a file
                FileInputStream file = new FileInputStream("level1.txt");
                ObjectInputStream in = new ObjectInputStream(file);

                redbird redbird1 = (redbird) in.readObject();
                r1 = new redbird(redbird1.getName(), redbird1.getPosx(), redbird1.getPosy(), redbird1.getBirdVelocity(),(int) redbird1.getWidth(), (int) redbird1.getHeight());

                bluebird bluebird1 = (bluebird) in.readObject();
                b1 = new bluebird(bluebird1.getName(),bluebird1.getPosx(),bluebird1.getPosy(),bluebird1.getBirdVelocity(),(int) bluebird1.getWidth(), (int) bluebird1.getHeight());

                bluebird bubu = (bluebird) in.readObject();
                b11 = new bluebird(bubu.getName(), bubu.getPosx(), bubu.getPosy(), bubu.getBirdVelocity(),(int) bubu.getWidth(), (int) bubu.getHeight());
                bluebird bubu1 = (bluebird) in.readObject();
                b12 = new bluebird(bubu1.getName(), bubu1.getPosx(), bubu1.getPosy(), bubu1.getBirdVelocity(),(int) bubu1.getWidth(), (int) bubu1.getHeight());

                terence terencebird1 = (terence) in.readObject();
                t1 = new terence(terencebird1.getName(), terencebird1.getPosx(), terencebird1.getPosy(), terencebird1.getBirdVelocity(),(int) terencebird1.getWidth(), (int) terencebird1.getHeight());

                ironblock i1 = (ironblock) in.readObject();
                iron1 = new ironblock(i1.getName(), i1.getPosx(), i1.getPosy(), (int) i1.getWidth(), (int) i1.getHeight(), i1.getHealth());
                ironblock i2 = (ironblock) in.readObject();
                iron2 = new ironblock(i2.getName(), i2.getPosx(), i2.getPosy(), (int) i2.getWidth(), (int) i2.getHeight(), i2.getHealth());
                ironblock i3 = (ironblock) in.readObject();
                iron3 = new ironblock(i3.getName(), i3.getPosx(), i3.getPosy(), (int) i3.getWidth(), (int) i3.getHeight(), i3.getHealth());
                ironblock i4 = (ironblock) in.readObject();
                iron4 = new ironblock(i4.getName(), i4.getPosx(), i4.getPosy(), (int) i4.getWidth(), (int) i4.getHeight(), i4.getHealth());
                ironblock i5 = (ironblock) in.readObject();
                iron5 = new ironblock(i5.getName(), i5.getPosx(), i5.getPosy(), (int) i5.getWidth(), (int) i5.getHeight(), i5.getHealth());
                ironblock i6 = (ironblock) in.readObject();
                iron6 = new ironblock(i6.getName(), i6.getPosx(), i6.getPosy(), (int) i6.getWidth(), (int) i6.getHeight(), i6.getHealth());
                ironblock i7 = (ironblock) in.readObject();
                iron7 = new ironblock(i7.getName(), i7.getPosx(), i7.getPosy(), (int) i7.getWidth(), (int) i7.getHeight(), i7.getHealth());
                ironblock i8 = (ironblock) in.readObject();
                iron8 = new ironblock(i8.getName(), i8.getPosx(), i8.getPosy(), (int) i8.getWidth(), (int) i8.getHeight(), i8.getHealth());

                glassblock g1 = (glassblock) in.readObject();
                glass1 = new glassblock(g1.getName(), g1.getPosx(), g1.getPosy(), (int) g1.getWidth(), (int) g1.getHeight(), g1.getHealth());
                glassblock g2 = (glassblock) in.readObject();
                glass2 = new glassblock(g2.getName(), g2.getPosx(), g2.getPosy(), (int) g2.getWidth(), (int) g2.getHeight(), g2.getHealth());

                woodblock w1 = (woodblock) in.readObject();
                wood1 = new woodblock(w1.getName(), w1.getPosx(), w1.getPosy(), (int) w1.getWidth(), (int) w1.getHeight(), w1.getHealth());
                woodblock w2 = (woodblock) in.readObject();
                wood2 = new woodblock(w2.getName(), w2.getPosx(), w2.getPosy(), (int) w2.getWidth(), (int) w2.getHeight(), w2.getHealth());
                woodblock w3 = (woodblock) in.readObject();
                wood3 = new woodblock(w3.getName(), w3.getPosx(), w3.getPosy(), (int) w3.getWidth(), (int) w3.getHeight(), w3.getHealth());
                woodblock w4 = (woodblock) in.readObject();
                wood4 = new woodblock(w4.getName(), w4.getPosx(), w4.getPosy(), (int) w4.getWidth(), (int) w4.getHeight(), w4.getHealth());
                woodblock w5 = (woodblock) in.readObject();
                wood5 = new woodblock(w5.getName(), w5.getPosx(), w5.getPosy(), (int) w5.getWidth(), (int) w5.getHeight(), w5.getHealth());
                woodblock w6 = (woodblock) in.readObject();
                wood6 = new woodblock(w6.getName(), w6.getPosx(), w6.getPosy(), (int) w6.getWidth(), (int) w6.getHeight(), w6.getHealth());
                woodblock w7 = (woodblock) in.readObject();
                wood7 = new woodblock(w7.getName(), w7.getPosx(), w7.getPosy(), (int) w7.getWidth(), (int) w7.getHeight(), w7.getHealth());
                woodblock w8 = (woodblock) in.readObject();
                wood8 = new woodblock(w8.getName(), w8.getPosx(), w8.getPosy(), (int) w8.getWidth(), (int) w8.getHeight(), w8.getHealth());
                woodblock w9 = (woodblock) in.readObject();
                wood9 = new woodblock(w9.getName(), w9.getPosx(), w9.getPosy(), (int) w9.getWidth(), (int) w9.getHeight(), w9.getHealth());
                woodblock w10 = (woodblock) in.readObject();
                wood10 = new woodblock(w10.getName(), w10.getPosx(), w10.getPosy(), (int) w10.getWidth(), (int) w10.getHeight(), w10.getHealth());

                tntblock t1 = (tntblock) in.readObject();
                tnt1 = new tntblock(t1.getName(), t1.getPosx(), t1.getPosy(), (int) t1.getWidth(), (int) t1.getHeight(), t1.getHealth());
                tntblock t2 = (tntblock) in.readObject();
                tnt2 = new tntblock(t2.getName(), t2.getPosx(), t2.getPosy(), (int) t2.getWidth(), (int) t2.getHeight(), t2.getHealth());
                tntblock t3 = (tntblock) in.readObject();
                tnt3 = new tntblock(t3.getName(), t3.getPosx(), t3.getPosy(), (int) t3.getWidth(), (int) t3.getHeight(), t3.getHealth());

                pig pig1 = (pig) in.readObject();
                pigu1 = new pig(pig1.getPosx(), pig1.getPosy(), (int) pig1.getWidth(), (int) pig1.getHeight(), pig1.getHealth());
                pig pig2 = (pig) in.readObject();
                pigu2 = new pig(pig2.getPosx(), pig2.getPosy(), (int) pig2.getWidth(), (int) pig2.getHeight(), pig2.getHealth());
                pig pig3 = (pig) in.readObject();
                pigu3 = new pig(pig3.getPosx(), pig3.getPosy(), (int) pig3.getWidth(), (int) pig3.getHeight(), pig3.getHealth());

                // Closing the stream
                in.close();
                file.close();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

       }

        // -------------------------------------------------------------------

        if (current_level instanceof Level3) {

            try {
                // Reading the object from a file
                FileInputStream file = new FileInputStream("level1.txt");
                ObjectInputStream in = new ObjectInputStream(file);
                blackbird blackbird1 = (blackbird) in.readObject();
                bl1 = new blackbird(blackbird1.getName(), blackbird1.getPosx(), blackbird1.getPosy(), blackbird1.getBirdVelocity(), (int) blackbird1.getWidth(), (int) blackbird1.getHeight());
                yellowbird yellowbird1 = (yellowbird) in.readObject();
                y1 = new yellowbird(yellowbird1.getName(), yellowbird1.getPosx(), yellowbird1.getPosy(), yellowbird1.getBirdVelocity(), (int) yellowbird1.getWidth(), (int) yellowbird1.getHeight());
                terence terencebird1 = (terence) in.readObject();
                t1 = new terence(terencebird1.getName(), terencebird1.getPosx(), terencebird1.getPosy(), terencebird1.getBirdVelocity(), (int) terencebird1.getWidth(), (int) terencebird1.getHeight());
                ironblock i1 = (ironblock) in.readObject();
                iron1 = new ironblock(i1.getName(), i1.getPosx(), i1.getPosy(), (int) i1.getWidth(), (int) i1.getHeight(), i1.getHealth());
                ironblock i2 = (ironblock) in.readObject();
                iron2 = new ironblock(i2.getName(), i2.getPosx(), i2.getPosy(), (int) i2.getWidth(), (int) i2.getHeight(), i2.getHealth());
                ironblock i3 = (ironblock) in.readObject();
                iron3 = new ironblock(i3.getName(), i3.getPosx(), i3.getPosy(), (int) i3.getWidth(), (int) i3.getHeight(), i3.getHealth());
                ironblock i4 = (ironblock) in.readObject();
                iron4 = new ironblock(i4.getName(), i4.getPosx(), i4.getPosy(), (int) i4.getWidth(), (int) i4.getHeight(), i4.getHealth());
                ironblock i5 = (ironblock) in.readObject();
                iron5 = new ironblock(i5.getName(), i5.getPosx(), i5.getPosy(), (int) i5.getWidth(), (int) i5.getHeight(), i5.getHealth());
                ironblock i6 = (ironblock) in.readObject();
                iron6 = new ironblock(i6.getName(), i6.getPosx(), i6.getPosy(), (int) i6.getWidth(), (int) i6.getHeight(), i6.getHealth());
                ironblock i7 = (ironblock) in.readObject();
                iron7 = new ironblock(i7.getName(), i7.getPosx(), i7.getPosy(), (int) i7.getWidth(), (int) i7.getHeight(), i7.getHealth());
                ironblock i8 = (ironblock) in.readObject();
                iron8 = new ironblock(i8.getName(), i8.getPosx(), i8.getPosy(), (int) i8.getWidth(), (int) i8.getHeight(), i8.getHealth());

                glassblock g1 = (glassblock) in.readObject();
                glass1 = new glassblock(g1.getName(), g1.getPosx(), g1.getPosy(), (int) g1.getWidth(), (int) g1.getHeight(), g1.getHealth());
                glassblock g2 = (glassblock) in.readObject();
                glass2 = new glassblock(g2.getName(), g2.getPosx(), g2.getPosy(), (int) g2.getWidth(), (int) g2.getHeight(), g2.getHealth());

                woodblock w1 = (woodblock) in.readObject();
                wood1 = new woodblock(w1.getName(), w1.getPosx(), w1.getPosy(), (int) w1.getWidth(), (int) w1.getHeight(), w1.getHealth());
                woodblock w2 = (woodblock) in.readObject();
                wood2 = new woodblock(w2.getName(), w2.getPosx(), w2.getPosy(), (int) w2.getWidth(), (int) w2.getHeight(), w2.getHealth());
                woodblock w3 = (woodblock) in.readObject();
                wood3 = new woodblock(w3.getName(), w3.getPosx(), w3.getPosy(), (int) w3.getWidth(), (int) w3.getHeight(), w3.getHealth());
                woodblock w4 = (woodblock) in.readObject();
                wood4 = new woodblock(w4.getName(), w4.getPosx(), w4.getPosy(), (int) w4.getWidth(), (int) w4.getHeight(), w4.getHealth());
                woodblock w5 = (woodblock) in.readObject();
                wood5 = new woodblock(w5.getName(), w5.getPosx(), w5.getPosy(), (int) w5.getWidth(), (int) w5.getHeight(), w5.getHealth());
                woodblock w6 = (woodblock) in.readObject();
                wood6 = new woodblock(w6.getName(), w6.getPosx(), w6.getPosy(), (int) w6.getWidth(), (int) w6.getHeight(), w6.getHealth());
                woodblock w7 = (woodblock) in.readObject();
                wood7 = new woodblock(w7.getName(), w7.getPosx(), w7.getPosy(), (int) w7.getWidth(), (int) w7.getHeight(), w7.getHealth());
                woodblock w8 = (woodblock) in.readObject();
                wood8 = new woodblock(w8.getName(), w8.getPosx(), w8.getPosy(), (int) w8.getWidth(), (int) w8.getHeight(), w8.getHealth());
                woodblock w9 = (woodblock) in.readObject();
                wood9 = new woodblock(w9.getName(), w9.getPosx(), w9.getPosy(), (int) w9.getWidth(), (int) w9.getHeight(), w9.getHealth());
                woodblock w10 = (woodblock) in.readObject();
                wood10 = new woodblock(w10.getName(), w10.getPosx(), w10.getPosy(), (int) w10.getWidth(), (int) w10.getHeight(), w10.getHealth());

                tntblock t1 = (tntblock) in.readObject();
                tnt1 = new tntblock(t1.getName(), t1.getPosx(), t1.getPosy(), (int) t1.getWidth(), (int) t1.getHeight(), t1.getHealth());
                tntblock t2 = (tntblock) in.readObject();
                tnt2 = new tntblock(t2.getName(), t2.getPosx(), t2.getPosy(), (int) t2.getWidth(), (int) t2.getHeight(), t2.getHealth());
                tntblock t3 = (tntblock) in.readObject();
                tnt3 = new tntblock(t3.getName(), t3.getPosx(), t3.getPosy(), (int) t3.getWidth(), (int) t3.getHeight(), t3.getHealth());

                pig pig1 = (pig) in.readObject();
                pigu1 = new pig(pig1.getPosx(), pig1.getPosy(), (int) pig1.getWidth(), (int) pig1.getHeight(), pig1.getHealth());
                pig pig2 = (pig) in.readObject();
                pigu2 = new pig(pig2.getPosx(), pig2.getPosy(), (int) pig2.getWidth(), (int) pig2.getHeight(), pig2.getHealth());
                pig pig3 = (pig) in.readObject();
                pigu3 = new pig(pig3.getPosx(), pig3.getPosy(), (int) pig3.getWidth(), (int) pig3.getHeight(), pig3.getHealth());

                // Closing the stream
                in.close();
                file.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void show() {
        // Prepare your screen here.
        Gdx.input.setInputProcessor(stage);


        if (current_level instanceof Level1) {

            InputListener redbirdListener = new InputListener() {
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    System.out.println("red bird touched");
                    r1.startDragging(x, y);
                    return true;
                }

                public void touchDragged(InputEvent event, float x, float y, int pointer) {
                    System.out.println("red bird dragged");
                    r1.startDragging(x, y);
                }

                public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                    System.out.println("red bird released");
                    r1.stopDragging();
                }
            };

            InputListener yellowbbirdListener = new InputListener() {
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    System.out.println("yellow bird touched");
                    y1.startDragging(x, y);
                    return true;
                }

                public void touchDragged(InputEvent event, float x, float y, int pointer) {
                    System.out.println("yellow bird dragged");
                    y1.startDragging(x, y);
                }

                public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                    System.out.println("yellow bird released");
                    y1.stopDragging();
                }
            };

            InputListener terenceListener = new InputListener() {
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    System.out.println("terence touched");
                    t1.startDragging(x, y);
                    return true;
                }

                public void touchDragged(InputEvent event, float x, float y, int pointer) {
                    System.out.println("terence dragged");
                    t1.startDragging(x, y);
                }

                public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                    System.out.println("terence released");
                    t1.stopDragging();
                }
            };
            r1.addListener(redbirdListener);
            y1.addListener(yellowbbirdListener);
            t1.addListener(terenceListener);


            Drawable pausebuttond = new TextureRegionDrawable(pausebutton);
            ImageButton pauseButton = new ImageButton(pausebuttond);
            pauseButton.setPosition(370, 5);
            pauseButton.setSize(60, 60);
            pauseButton.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    game.setScreen(new PauseScreen(game, current_level));
                }
            });
//            pauseButton.addListener(new ClickListener() {
//                @Override
//                public void clicked(InputEvent event, float x, float y) {
//                    try {
//                        serialise();
//                    } catch (FileNotFoundException e) {
//                        throw new RuntimeException(e);
//                    }
//                    game.setScreen(new PauseScreen(game, current_level));
//                }
//            });

            stage.addActor(pauseButton);
            if (iron1.getHealth()>0){
                stage.addActor(iron1);
            }
            if (iron2.getHealth()>0){
                stage.addActor(iron2);
            }
            if (iron3.getHealth()>0){
                stage.addActor(iron3);
            }
            if (iron4.getHealth()>0){
                stage.addActor(iron4);
            }
            if (iron5.getHealth()>0){
                stage.addActor(iron5);
            }
            if (iron6.getHealth()>0){
                stage.addActor(iron6);
            }
            if (iron7.getHealth()>0){
                stage.addActor(iron7);
            }
            if (iron8.getHealth()>0){
                stage.addActor(iron8);
            }

            if (glass1.getHealth()>0){
                stage.addActor(glass1);
            }
            if (glass2.getHealth()>0){
                stage.addActor(glass2);
            }

            if (wood1.getHealth()>0){
                stage.addActor(wood1);
            }
            if (wood2.getHealth()>0){
                stage.addActor(wood2);
            }
            if (wood3.getHealth()>0){
                stage.addActor(wood3);
            }
            if (wood4.getHealth()>0){
                stage.addActor(wood4);
            }
            if (wood5.getHealth()>0){
                stage.addActor(wood5);
            }
            if (wood6.getHealth()>0){
                stage.addActor(wood6);
            }
            if (wood7.getHealth()>0){
                stage.addActor(wood7);
            }
            if (wood8.getHealth()>0){
                stage.addActor(wood8);
            }
            if (wood9.getHealth()>0){
                stage.addActor(wood9);
            }
            if (wood10.getHealth()>0){
                stage.addActor(wood10);
            }

            if (tnt1.getHealth()>0){
                stage.addActor(tnt1);
            }
            if (tnt2.getHealth()>0){
                stage.addActor(tnt2);
            }
            if (tnt3.getHealth()>0){
                stage.addActor(tnt3);
            }

//            stage.addActor(iron1);stage.addActor(iron2);stage.addActor(iron3);stage.addActor(iron4);stage.addActor(iron5);stage.addActor(iron6);stage.addActor(iron7);stage.addActor(iron8);
//            stage.addActor(glass1);stage.addActor(glass2);
//            stage.addActor(wood1);stage.addActor(wood2);stage.addActor(wood3);stage.addActor(wood4);stage.addActor(wood5);stage.addActor(wood6);stage.addActor(wood7);stage.addActor(wood8);stage.addActor(wood9);stage.addActor(wood10);
//            stage.addActor(tnt1);stage.addActor(tnt2);stage.addActor(tnt3);
            if(pigu1.getHealth()>-50){
                stage.addActor(pigu1);
            }
            if(pigu2.getHealth()>-50){
                stage.addActor(pigu2);
            }
            if(pigu3.getHealth()>-50){
                stage.addActor(pigu3);
            }
//            stage.addActor(pigu1);stage.addActor(pigu2);stage.addActor(pigu3);
//            stage.addActor(r1);stage.addActor(y1);stage.addActor(t1);
        }

        if (current_level instanceof Level2){
            InputListener redbirdListener = new InputListener(){
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("red bird touched");
                    r1.startDragging(x, y);
                    return true;
                }
                public void touchDragged(InputEvent event, float x, float y, int pointer){
                    System.out.println("red bird dragged");
                    r1.startDragging(x, y);
                }
                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("red bird released");
                    r1.stopDragging();
                }
            };

            InputListener bluebbirdListener = new InputListener(){
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("blue bird touched");
                    b1.startDragging(x, y);
                    return true;
                }
                public void touchDragged(InputEvent event, float x, float y, int pointer){
                    System.out.println("blue bird dragged");
                    b1.startDragging(x, y);
                }
                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("blue bird released");
                    b1.stopDragging();
                }
            };
            InputListener terenceListener = new InputListener(){
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("terence touched");
                    t1.startDragging(x, y);
                    return true;
                }
                public void touchDragged(InputEvent event, float x, float y, int pointer){
                    System.out.println("terence dragged");
                    t1.startDragging(x, y);
                }
                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("terence released");
                    t1.stopDragging();
                }
            };

            // split the bludbird into three on click
            b1.addListener(new ClickListener(){
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    // split the bird into three
                    b11.setPosition(b1.getX()+60, b1.getY()+10);
                    stage.addActor(b11);
                    // set the velocity of the bird
                    b11.setcurrentvelocity(b1.getcurrentvelocity());
                    b11.setIsLaunched(true);

                    b12.setPosition(b1.getX()+60, b1.getY()-30);
                    stage.addActor(b12);
                    b1.setcurrentvelocity(new Vector2(150,150));
                    b12.setcurrentvelocity(b12.getcurrentvelocity());
                    b12.setIsLaunched(true);
//                bluebird1.split(stage);

                    b1.setcurrentvelocity(new Vector2(0,0));

                }
            });
            r1.addListener(redbirdListener);
            b1.addListener(bluebbirdListener);
            t1.addListener(terenceListener);


            Drawable pausebuttond = new TextureRegionDrawable(pausebutton);
            ImageButton pauseButton = new ImageButton(pausebuttond);
            pauseButton.setPosition(370, 5);
            pauseButton.setSize(60, 60);
            pauseButton.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    game.setScreen(new PauseScreen(game, current_level));
                }
            });
            stage.addActor(pauseButton);


            if (iron1.getHealth()>0){
                stage.addActor(iron1);
            }
            if (iron2.getHealth()>0){
                stage.addActor(iron2);
            }
            if (iron3.getHealth()>0){
                stage.addActor(iron3);
            }
            if (iron4.getHealth()>0){
                stage.addActor(iron4);
            }
            if (iron5.getHealth()>0){
                stage.addActor(iron5);
            }
            if (iron6.getHealth()>0){
                stage.addActor(iron6);
            }
            if (iron7.getHealth()>0){
                stage.addActor(iron7);
            }
            if (iron8.getHealth()>0){
                stage.addActor(iron8);
            }

            if (glass1.getHealth()>0){
                stage.addActor(glass1);
            }
            if (glass2.getHealth()>0){
                stage.addActor(glass2);
            }

            if (wood1.getHealth()>0){
                stage.addActor(wood1);
            }
            if (wood2.getHealth()>0){
                stage.addActor(wood2);
            }
            if (wood3.getHealth()>0){
                stage.addActor(wood3);
            }
            if (wood4.getHealth()>0){
                stage.addActor(wood4);
            }
            if (wood5.getHealth()>0){
                stage.addActor(wood5);
            }
            if (wood6.getHealth()>0){
                stage.addActor(wood6);
            }
            if (wood7.getHealth()>0){
                stage.addActor(wood7);
            }
            if (wood8.getHealth()>0){
                stage.addActor(wood8);
            }
            if (wood9.getHealth()>0){
                stage.addActor(wood9);
            }
            if (wood10.getHealth()>0){
                stage.addActor(wood10);
            }

            if (tnt1.getHealth()>0){
                stage.addActor(tnt1);
            }
            if (tnt2.getHealth()>0){
                stage.addActor(tnt2);
            }
            if (tnt3.getHealth()>0){
                stage.addActor(tnt3);
            }
//            stage.addActor(iron1);stage.addActor(iron2);stage.addActor(iron3);stage.addActor(iron4);stage.addActor(iron5);stage.addActor(iron6);stage.addActor(iron7);stage.addActor(iron8);
//            stage.addActor(glass1);stage.addActor(glass2);
//            stage.addActor(wood1);stage.addActor(wood2);stage.addActor(wood3);stage.addActor(wood4);stage.addActor(wood5);stage.addActor(wood6);stage.addActor(wood7);stage.addActor(wood8);stage.addActor(wood9);stage.addActor(wood10);
//            stage.addActor(tnt1);stage.addActor(tnt2);stage.addActor(tnt3);
            if(pigu1.getHealth()>-50){
                stage.addActor(pigu1);
            }
            if(pigu2.getHealth()>-50){
                stage.addActor(pigu2);
            }
            if(pigu3.getHealth()>-50){
                stage.addActor(pigu3);
            }
//            stage.addActor(pigu1);stage.addActor(pigu2);stage.addActor(pigu3);
//            stage.addActor(r1);stage.addActor(b1);stage.addActor(t1);

        }

        if (current_level instanceof Level3){

            InputListener blackbirdListener = new InputListener(){
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("black bird touched");
                    bl1.startDragging(x, y);
                    return true;
                }
                public void touchDragged(InputEvent event, float x, float y, int pointer){
                    System.out.println("black bird dragged");
                    bl1.startDragging(x, y);
                }
                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("black bird released");
                    bl1.stopDragging();
                }
            };
            InputListener yellowbirdListener = new InputListener(){
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("yellow bird touched");
                    y1.startDragging(x, y);
                    return true;
                }
                public void touchDragged(InputEvent event, float x, float y, int pointer){
                    System.out.println("yellow bird dragged");
                    y1.startDragging(x, y);
                }
                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("yellow bird released");
                    y1.stopDragging();
                }
            };
            InputListener terenceListener = new InputListener(){
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("terence touched");
                    t1.startDragging(x, y);
                    return true;
                }
                public void touchDragged(InputEvent event, float x, float y, int pointer){
                    System.out.println("terence dragged");
                    t1.startDragging(x, y);
                }
                public void touchUp(InputEvent event, float x, float y, int pointer, int button){
                    System.out.println("terence released");
                    t1.stopDragging();
                }
            };
            bl1.addListener(blackbirdListener);
            y1.addListener(yellowbirdListener);
            t1.addListener(terenceListener);
//
            Drawable pausebuttond = new TextureRegionDrawable(pausebutton);
            ImageButton pauseButton = new ImageButton(pausebuttond);
            pauseButton.setPosition(370, 25);
            pauseButton.setSize(60,60);
            pauseButton.addListener(new ClickListener(){
                @Override
                public void clicked(InputEvent event, float x, float y){
                    game.setScreen(new PauseScreen(game, current_level));
                }
            });
//
            stage.addActor(pauseButton);

            if (iron1.getHealth()>0){
                stage.addActor(iron1);
            }
            if (iron2.getHealth()>0){
                stage.addActor(iron2);
            }
            if (iron3.getHealth()>0){
                stage.addActor(iron3);
            }
            if (iron4.getHealth()>0){
                stage.addActor(iron4);
            }
            if (iron5.getHealth()>0){
                stage.addActor(iron5);
            }
            if (iron6.getHealth()>0){
                stage.addActor(iron6);
            }
            if (iron7.getHealth()>0){
                stage.addActor(iron7);
            }
            if (iron8.getHealth()>0){
                stage.addActor(iron8);
            }

            if (glass1.getHealth()>0){
                stage.addActor(glass1);
            }
            if (glass2.getHealth()>0){
                stage.addActor(glass2);
            }

            if (wood1.getHealth()>0){
                stage.addActor(wood1);
            }
            if (wood2.getHealth()>0){
                stage.addActor(wood2);
            }
            if (wood3.getHealth()>0){
                stage.addActor(wood3);
            }
            if (wood4.getHealth()>0){
                stage.addActor(wood4);
            }
            if (wood5.getHealth()>0){
                stage.addActor(wood5);
            }
            if (wood6.getHealth()>0){
                stage.addActor(wood6);
            }
            if (wood7.getHealth()>0){
                stage.addActor(wood7);
            }
            if (wood8.getHealth()>0){
                stage.addActor(wood8);
            }
            if (wood9.getHealth()>0){
                stage.addActor(wood9);
            }
            if (wood10.getHealth()>0){
                stage.addActor(wood10);
            }

            if (tnt1.getHealth()>0){
                stage.addActor(tnt1);
            }
            if (tnt2.getHealth()>0){
                stage.addActor(tnt2);
            }
            if (tnt3.getHealth()>0){
                stage.addActor(tnt3);
            }
//
//            stage.addActor(iron1);stage.addActor(iron2);stage.addActor(iron3);stage.addActor(iron4);stage.addActor(iron5);stage.addActor(iron6);stage.addActor(iron7);stage.addActor(iron8);
//            stage.addActor(glass1);stage.addActor(glass2);
//            stage.addActor(wood1);stage.addActor(wood2);stage.addActor(wood3);stage.addActor(wood4);stage.addActor(wood5);stage.addActor(wood6);stage.addActor(wood7);stage.addActor(wood8);stage.addActor(wood9);stage.addActor(wood10);
//            stage.addActor(tnt1);stage.addActor(tnt2);stage.addActor(tnt3);
//            if(pigu1.getHealth() > 0) stage.addActor(pigu1);
//            if(pigu2.getHealth() > 0) stage.addActor(pigu2);
//            if(pigu3.getHealth() > 0) stage.addActor(pigu3);

            if(pigu1.getHealth()>-50){
                stage.addActor(pigu1);
            }
            if(pigu2.getHealth()>-50){
                stage.addActor(pigu2);
            }
            if(pigu3.getHealth()>-50){
                stage.addActor(pigu3);
            }
//            stage.addActor(pigu1);stage.addActor(pigu2);stage.addActor(pigu3);
//            stage.addActor(bl1);stage.addActor(y1);stage.addActor(t1);
//
        }
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1);


        if (current_level instanceof Level1){
            batch.begin();
            batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            batch.draw(catapult, 100, 70, 50, 70);
            batch.end();

            if (r1.getBounds().overlaps(pigu1.getBounds()) || y1.getBounds().overlaps(pigu1.getBounds()) || t1.getBounds().overlaps(pigu1.getBounds())) {
                pigu1.sethit(true);
                pigu1.onHit();
            }
            if (r1.getBounds().overlaps(pigu2.getBounds()) || y1.getBounds().overlaps(pigu2.getBounds()) || t1.getBounds().overlaps(pigu2.getBounds())) {
                pigu2.sethit(true);
                pigu2.onHit();
            }
            if (r1.getBounds().overlaps(pigu3.getBounds()) || y1.getBounds().overlaps(pigu3.getBounds()) || t1.getBounds().overlaps(pigu3.getBounds())) {
                pigu3.sethit(true);
                pigu3.onHit();
            }
            if (r1.getBounds().overlaps(wood1.getBounds()) || y1.getBounds().overlaps(wood1.getBounds()) || t1.getBounds().overlaps(wood1.getBounds())) {
                wood1.onhit();
            }
            if (r1.getBounds().overlaps(wood2.getBounds()) || y1.getBounds().overlaps(wood2.getBounds()) || t1.getBounds().overlaps(wood2.getBounds())) {
                wood2.onhit();
            }
            if (r1.getBounds().overlaps(wood3.getBounds()) || y1.getBounds().overlaps(wood3.getBounds()) || t1.getBounds().overlaps(wood3.getBounds())) {
                wood3.onhit();
            }
            if (r1.getBounds().overlaps(wood4.getBounds()) || y1.getBounds().overlaps(wood4.getBounds()) || t1.getBounds().overlaps(wood4.getBounds())) {
                wood4.onhit();
            }
            if (r1.getBounds().overlaps(wood5.getBounds()) || y1.getBounds().overlaps(wood5.getBounds()) || t1.getBounds().overlaps(wood5.getBounds())) {
                wood5.onhit();
            }
            if (r1.getBounds().overlaps(wood6.getBounds()) || y1.getBounds().overlaps(wood6.getBounds()) || t1.getBounds().overlaps(wood6.getBounds())) {
                wood6.onhit();
            }
            if (r1.getBounds().overlaps(wood7.getBounds()) || y1.getBounds().overlaps(wood7.getBounds()) || t1.getBounds().overlaps(wood7.getBounds())) {
                wood7.onhit();
            }
            if (r1.getBounds().overlaps(wood8.getBounds()) || y1.getBounds().overlaps(wood8.getBounds()) || t1.getBounds().overlaps(wood8.getBounds())) {
                wood8.onhit();
            }
            if (r1.getBounds().overlaps(wood9.getBounds()) || y1.getBounds().overlaps(wood9.getBounds()) || t1.getBounds().overlaps(wood9.getBounds())) {
                wood9.onhit();
            }
            if (r1.getBounds().overlaps(wood10.getBounds()) || y1.getBounds().overlaps(wood10.getBounds()) || t1.getBounds().overlaps(wood10.getBounds())) {
                wood10.onhit();
            }
            if (r1.getBounds().overlaps(iron1.getBounds()) || y1.getBounds().overlaps(iron1.getBounds()) || t1.getBounds().overlaps(iron1.getBounds())) {
                iron1.onhit();
            }
            if (r1.getBounds().overlaps(iron2.getBounds()) || y1.getBounds().overlaps(iron2.getBounds()) || t1.getBounds().overlaps(iron2.getBounds())) {
                iron2.onhit();
            }
            if (r1.getBounds().overlaps(iron3.getBounds()) || y1.getBounds().overlaps(iron3.getBounds()) || t1.getBounds().overlaps(iron3.getBounds())) {
                iron3.onhit();
            }
            if (r1.getBounds().overlaps(iron4.getBounds()) || y1.getBounds().overlaps(iron4.getBounds()) || t1.getBounds().overlaps(iron4.getBounds())) {
                iron4.onhit();
            }
            if (r1.getBounds().overlaps(iron5.getBounds()) || y1.getBounds().overlaps(iron5.getBounds()) || t1.getBounds().overlaps(iron5.getBounds())) {
                iron5.onhit();
            }
            if (r1.getBounds().overlaps(iron6.getBounds()) || y1.getBounds().overlaps(iron6.getBounds()) || t1.getBounds().overlaps(iron6.getBounds())) {
                iron6.onhit();
            }
            if (r1.getBounds().overlaps(iron7.getBounds()) || y1.getBounds().overlaps(iron7.getBounds()) || t1.getBounds().overlaps(iron7.getBounds())) {
                iron7.onhit();
            }
            if (r1.getBounds().overlaps(iron8.getBounds()) || y1.getBounds().overlaps(iron8.getBounds()) || t1.getBounds().overlaps(iron8.getBounds())) {
                iron8.onhit();
            }
            if (r1.getBounds().overlaps(glass1.getBounds()) || y1.getBounds().overlaps(glass1.getBounds()) || t1.getBounds().overlaps(glass1.getBounds())) {
                glass1.onhit();
            }
            if (r1.getBounds().overlaps(glass2.getBounds()) || y1.getBounds().overlaps(glass2.getBounds()) || t1.getBounds().overlaps(glass2.getBounds())) {
                glass2.onhit();
            }
            if (r1.getBounds().overlaps(tnt1.getBounds()) || y1.getBounds().overlaps(tnt1.getBounds()) || t1.getBounds().overlaps(tnt1.getBounds())) {
                tnt1.onhit();
            }
            if (r1.getBounds().overlaps(tnt2.getBounds()) || y1.getBounds().overlaps(tnt2.getBounds()) || t1.getBounds().overlaps(tnt2.getBounds())) {
                tnt2.onhit();
            }
            if (r1.getBounds().overlaps(tnt3.getBounds()) || y1.getBounds().overlaps(tnt3.getBounds()) || t1.getBounds().overlaps(tnt3.getBounds())) {
                tnt3.onhit();
            }
            if (r1.getBounds().overlaps(glass1.getBounds()) || y1.getBounds().overlaps(glass1.getBounds()) || t1.getBounds().overlaps(glass1.getBounds())) {
                glass1.onhit();
            }
            if (r1.getBounds().overlaps(glass2.getBounds()) || y1.getBounds().overlaps(glass2.getBounds()) || t1.getBounds().overlaps(glass2.getBounds())) {
                glass2.onhit();
            }

            if (allpigsdead()) {
                game.setScreen(new winScreen(game, current_level));
            }

            if (r1.getPosy() <= 70) {
                r1.remove();
                stage.addActor(y1);

            }
            if (y1.getPosy() <= 70) {
                y1.remove();
                stage.addActor(t1);
            }
            if (t1.getPosy() <= 70) {
                t1.remove();
                stage.addActor(r1);
            }
            if (r1.getPosy() <= 70 && y1.getPosy() <= 70 && t1.getPosy() <= 70) {
                game.setScreen(new looseScreen(game));
            }

        }

        //=========================================================================================================

        if (current_level instanceof Level2){
            batch.begin();
            batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            batch.draw(catapult, 100, 150, 50, 70);
            batch.end();



            if(r1.getBounds().overlaps(pigu1.getBounds()) || b11.getBounds().overlaps(pigu1.getBounds()) || b12.getBounds().overlaps(pigu1.getBounds()) || b1.getBounds().overlaps(pigu1.getBounds()) || t1.getBounds().overlaps(pigu1.getBounds())){
                pigu1.sethit(true);
                pigu1.onHit();

            }
            if(r1.getBounds().overlaps(pigu2.getBounds()) || b11.getBounds().overlaps(pigu2.getBounds()) || b12.getBounds().overlaps(pigu2.getBounds()) || b1.getBounds().overlaps(pigu2.getBounds()) || t1.getBounds().overlaps(pigu2.getBounds())){
                pigu2.sethit(true);
                pigu2.onHit();
            }
            if(r1.getBounds().overlaps(pigu3.getBounds()) || b11.getBounds().overlaps(pigu3.getBounds()) || b12.getBounds().overlaps(pigu3.getBounds()) || b1.getBounds().overlaps(pigu3.getBounds()) || t1.getBounds().overlaps(pigu3.getBounds())){
                pigu3.sethit(true);
                pigu3.onHit();
            }
            if(r1.getBounds().overlaps(wood1.getBounds()) || b11.getBounds().overlaps(wood1.getBounds()) || b12.getBounds().overlaps(wood1.getBounds()) || b1.getBounds().overlaps(wood1.getBounds()) || t1.getBounds().overlaps(wood1.getBounds())){
                wood1.onhit();
            }
            if(r1.getBounds().overlaps(wood2.getBounds()) || b11.getBounds().overlaps(wood2.getBounds()) || b12.getBounds().overlaps(wood2.getBounds()) || b1.getBounds().overlaps(wood2.getBounds()) || t1.getBounds().overlaps(wood2.getBounds())){
                wood2.onhit();
            }
            if(r1.getBounds().overlaps(wood3.getBounds()) || b11.getBounds().overlaps(wood3.getBounds()) || b12.getBounds().overlaps(wood3.getBounds()) || b1.getBounds().overlaps(wood3.getBounds()) || t1.getBounds().overlaps(wood3.getBounds())){
                wood3.onhit();
            }
            if(r1.getBounds().overlaps(wood4.getBounds()) || b11.getBounds().overlaps(wood4.getBounds()) || b12.getBounds().overlaps(wood4.getBounds()) || b1.getBounds().overlaps(wood4.getBounds()) || t1.getBounds().overlaps(wood4.getBounds())){
                wood4.onhit();
            }
            if(r1.getBounds().overlaps(wood5.getBounds()) || b11.getBounds().overlaps(wood5.getBounds()) || b12.getBounds().overlaps(wood5.getBounds()) || b1.getBounds().overlaps(wood5.getBounds()) || t1.getBounds().overlaps(wood5.getBounds())){
                wood5.onhit();
            }
            if(r1.getBounds().overlaps(wood6.getBounds()) || b11.getBounds().overlaps(wood6.getBounds()) || b12.getBounds().overlaps(wood6.getBounds()) || b1.getBounds().overlaps(wood6.getBounds()) || t1.getBounds().overlaps(wood6.getBounds())){
                wood6.onhit();
            }
            if(r1.getBounds().overlaps(wood7.getBounds()) || b11.getBounds().overlaps(wood7.getBounds()) || b12.getBounds().overlaps(wood7.getBounds()) || b1.getBounds().overlaps(wood7.getBounds()) || t1.getBounds().overlaps(wood7.getBounds())){
                wood7.onhit();
            }
            if(r1.getBounds().overlaps(wood8.getBounds()) || b11.getBounds().overlaps(wood8.getBounds()) || b12.getBounds().overlaps(wood8.getBounds()) || b1.getBounds().overlaps(wood8.getBounds()) || t1.getBounds().overlaps(wood8.getBounds())){
                wood8.onhit();
            }
            if(r1.getBounds().overlaps(wood9.getBounds()) || b11.getBounds().overlaps(wood9.getBounds()) || b12.getBounds().overlaps(wood9.getBounds()) || b1.getBounds().overlaps(wood9.getBounds()) || t1.getBounds().overlaps(wood9.getBounds())){
                wood9.onhit();
            }
            if(r1.getBounds().overlaps(wood10.getBounds()) || b11.getBounds().overlaps(wood10.getBounds()) || b12.getBounds().overlaps(wood10.getBounds()) || b1.getBounds().overlaps(wood10.getBounds()) || t1.getBounds().overlaps(wood10.getBounds())){
                wood10.onhit();
            }
            if(r1.getBounds().overlaps(iron1.getBounds()) || b11.getBounds().overlaps(iron1.getBounds()) || b12.getBounds().overlaps(iron1.getBounds()) || b1.getBounds().overlaps(iron1.getBounds()) || t1.getBounds().overlaps(iron1.getBounds())){
                iron1.onhit();
            }
            if(r1.getBounds().overlaps(iron2.getBounds()) || b11.getBounds().overlaps(iron2.getBounds()) || b12.getBounds().overlaps(iron2.getBounds()) || b1.getBounds().overlaps(iron2.getBounds()) || t1.getBounds().overlaps(iron2.getBounds())){
                iron2.onhit();
            }
            if(r1.getBounds().overlaps(iron3.getBounds()) || b11.getBounds().overlaps(iron3.getBounds()) || b12.getBounds().overlaps(iron3.getBounds()) || b1.getBounds().overlaps(iron3.getBounds()) || t1.getBounds().overlaps(iron3.getBounds())){
                iron3.onhit();
            }
            if(r1.getBounds().overlaps(iron4.getBounds()) || b11.getBounds().overlaps(iron4.getBounds()) || b12.getBounds().overlaps(iron4.getBounds()) || b1.getBounds().overlaps(iron4.getBounds()) || t1.getBounds().overlaps(iron4.getBounds())){
                iron4.onhit();
            }
            if(r1.getBounds().overlaps(iron5.getBounds()) || b11.getBounds().overlaps(iron5.getBounds()) || b12.getBounds().overlaps(iron5.getBounds()) || b1.getBounds().overlaps(iron5.getBounds()) || t1.getBounds().overlaps(iron5.getBounds())){
                iron5.onhit();
            }
            if(r1.getBounds().overlaps(iron6.getBounds()) || b11.getBounds().overlaps(iron6.getBounds()) || b12.getBounds().overlaps(iron6.getBounds()) || b1.getBounds().overlaps(iron6.getBounds()) || t1.getBounds().overlaps(iron6.getBounds())){
                iron6.onhit();
            }
            if(r1.getBounds().overlaps(iron7.getBounds()) || b11.getBounds().overlaps(iron7.getBounds()) || b12.getBounds().overlaps(iron7.getBounds()) || b1.getBounds().overlaps(iron7.getBounds()) || t1.getBounds().overlaps(iron7.getBounds())){
                iron7.onhit();
            }
            if(r1.getBounds().overlaps(iron8.getBounds()) || b11.getBounds().overlaps(iron8.getBounds()) || b12.getBounds().overlaps(iron8.getBounds()) || b1.getBounds().overlaps(iron8.getBounds()) || t1.getBounds().overlaps(iron8.getBounds())){
                iron8.onhit();
            }
            if(r1.getBounds().overlaps(glass1.getBounds()) || b11.getBounds().overlaps(glass1.getBounds()) || glass1.getBounds().overlaps(pigu1.getBounds()) || b1.getBounds().overlaps(glass1.getBounds()) || t1.getBounds().overlaps(glass1.getBounds())){
                glass1.onhit();
            }
            if(r1.getBounds().overlaps(glass2.getBounds()) || b11.getBounds().overlaps(glass2.getBounds()) || b12.getBounds().overlaps(glass2.getBounds()) || b1.getBounds().overlaps(glass2.getBounds()) || t1.getBounds().overlaps(glass2.getBounds())){
                glass2.onhit();
            }
            if(r1.getBounds().overlaps(tnt1.getBounds()) || b11.getBounds().overlaps(tnt1.getBounds()) || b12.getBounds().overlaps(tnt1.getBounds()) || b1.getBounds().overlaps(tnt1.getBounds()) || t1.getBounds().overlaps(tnt1.getBounds())){
                tnt1.onhit();
            }
            if(r1.getBounds().overlaps(tnt2.getBounds()) || b11.getBounds().overlaps(tnt2.getBounds()) || b12.getBounds().overlaps(tnt2.getBounds()) || b1.getBounds().overlaps(tnt2.getBounds()) || t1.getBounds().overlaps(tnt2.getBounds())){
                tnt2.onhit();
            }
            if(r1.getBounds().overlaps(tnt3.getBounds()) || b11.getBounds().overlaps(tnt3.getBounds()) || b12.getBounds().overlaps(tnt3.getBounds()) || b1.getBounds().overlaps(tnt3.getBounds()) || t1.getBounds().overlaps(tnt3.getBounds())){
                tnt3.onhit();
            }
            if(r1.getBounds().overlaps(glass1.getBounds()) || b11.getBounds().overlaps(glass1.getBounds()) || b12.getBounds().overlaps(glass1.getBounds()) || b1.getBounds().overlaps(glass1.getBounds()) || t1.getBounds().overlaps(glass1.getBounds())){
                glass1.onhit();
            }
            if(r1.getBounds().overlaps(glass2.getBounds()) || b11.getBounds().overlaps(glass2.getBounds()) || b12.getBounds().overlaps(glass2.getBounds()) || b1.getBounds().overlaps(glass2.getBounds()) || t1.getBounds().overlaps(glass2.getBounds())){
                glass2.onhit();
            }

            if (allpigsdead()){
                game.setScreen(new winScreen(game, current_level));

            }

            if (r1.getPosy()<=150){
                r1.remove();
                stage.addActor(b1);


            }
            if (b1.getPosy()<=150){
                b1.remove();
                b11.remove();
                b12.remove();
                stage.addActor(t1);

            }
            if (t1.getPosy()<=150){
                t1.remove();
                stage.addActor(b1);
            }
            if (r1.getPosy()<=150 && b1.getPosy()<=150 && t1.getPosy()<=150){
                game.setScreen(new looseScreen(game));
            }
        }

        //=========================================================================================================

        if (current_level instanceof Level3){
            batch.begin();
            batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            batch.draw(catapult, 100, 110, 50, 70);
            batch.end();


            if (bl1.getBounds().overlaps(pigu1.getBounds()) || y1.getBounds().overlaps(pigu1.getBounds()) || t1.getBounds().overlaps(pigu1.getBounds())) {
                pigu1.sethit(true);
                pigu1.onHit();
            }
            if (bl1.getBounds().overlaps(pigu2.getBounds()) || y1.getBounds().overlaps(pigu2.getBounds()) || t1.getBounds().overlaps(pigu2.getBounds())) {
                pigu2.sethit(true);
                pigu2.onHit();
            }
            if (bl1.getBounds().overlaps(pigu3.getBounds()) || y1.getBounds().overlaps(pigu3.getBounds()) || t1.getBounds().overlaps(pigu3.getBounds())) {
                pigu3.sethit(true);
                pigu3.onHit();
            }
            if (bl1.getBounds().overlaps(wood1.getBounds()) || y1.getBounds().overlaps(wood1.getBounds()) || t1.getBounds().overlaps(wood1.getBounds())) {
                wood1.onhit();
            }
            if (bl1.getBounds().overlaps(wood2.getBounds()) || y1.getBounds().overlaps(wood2.getBounds()) || t1.getBounds().overlaps(wood2.getBounds())) {
                wood2.onhit();
            }
            if (bl1.getBounds().overlaps(wood3.getBounds()) || y1.getBounds().overlaps(wood3.getBounds()) || t1.getBounds().overlaps(wood3.getBounds())) {
                wood3.onhit();
            }
            if (bl1.getBounds().overlaps(wood4.getBounds()) || y1.getBounds().overlaps(wood4.getBounds()) || t1.getBounds().overlaps(wood4.getBounds())) {
                wood4.onhit();
            }
            if (bl1.getBounds().overlaps(wood5.getBounds()) || y1.getBounds().overlaps(wood5.getBounds()) || t1.getBounds().overlaps(wood5.getBounds())) {
                wood5.onhit();
            }
            if (bl1.getBounds().overlaps(wood6.getBounds()) || y1.getBounds().overlaps(wood6.getBounds()) || t1.getBounds().overlaps(wood6.getBounds())) {
                wood6.onhit();
            }
            if (bl1.getBounds().overlaps(wood7.getBounds()) || y1.getBounds().overlaps(wood7.getBounds()) || t1.getBounds().overlaps(wood7.getBounds())) {
                wood7.onhit();
            }
            if (bl1.getBounds().overlaps(wood8.getBounds()) || y1.getBounds().overlaps(wood8.getBounds()) || t1.getBounds().overlaps(wood8.getBounds())) {
                wood8.onhit();
            }
            if (bl1.getBounds().overlaps(wood9.getBounds()) || y1.getBounds().overlaps(wood9.getBounds()) || t1.getBounds().overlaps(wood9.getBounds())) {
                wood9.onhit();
            }
            if (bl1.getBounds().overlaps(wood10.getBounds()) || y1.getBounds().overlaps(wood10.getBounds()) || t1.getBounds().overlaps(wood10.getBounds())) {
                wood10.onhit();
            }
            if (bl1.getBounds().overlaps(iron1.getBounds()) || y1.getBounds().overlaps(iron1.getBounds()) || t1.getBounds().overlaps(iron1.getBounds())) {
                iron1.onhit();
            }
            if (bl1.getBounds().overlaps(iron2.getBounds()) || y1.getBounds().overlaps(iron2.getBounds()) || t1.getBounds().overlaps(iron2.getBounds())) {
                iron2.onhit();
            }
            if (bl1.getBounds().overlaps(iron3.getBounds()) || y1.getBounds().overlaps(iron3.getBounds()) || t1.getBounds().overlaps(iron3.getBounds())) {
                iron3.onhit();
            }
            if (bl1.getBounds().overlaps(iron4.getBounds()) || y1.getBounds().overlaps(iron4.getBounds()) || t1.getBounds().overlaps(iron4.getBounds())) {
                iron4.onhit();
            }
            if (bl1.getBounds().overlaps(iron5.getBounds()) || y1.getBounds().overlaps(iron5.getBounds()) || t1.getBounds().overlaps(iron5.getBounds())) {
                iron5.onhit();
            }
            if (bl1.getBounds().overlaps(iron6.getBounds()) || y1.getBounds().overlaps(iron6.getBounds()) || t1.getBounds().overlaps(iron6.getBounds())) {
                iron6.onhit();
            }
            if (bl1.getBounds().overlaps(iron7.getBounds()) || y1.getBounds().overlaps(iron7.getBounds()) || t1.getBounds().overlaps(iron7.getBounds())) {
                iron7.onhit();
            }
            if (bl1.getBounds().overlaps(iron8.getBounds()) || y1.getBounds().overlaps(iron8.getBounds()) || t1.getBounds().overlaps(iron8.getBounds())) {
                iron8.onhit();
            }
            if (bl1.getBounds().overlaps(glass1.getBounds()) || y1.getBounds().overlaps(glass1.getBounds()) || t1.getBounds().overlaps(glass1.getBounds())) {
                glass1.onhit();
            }
            if (bl1.getBounds().overlaps(glass2.getBounds()) || y1.getBounds().overlaps(glass2.getBounds()) || t1.getBounds().overlaps(glass2.getBounds())) {
                glass2.onhit();
            }
            if (bl1.getBounds().overlaps(tnt1.getBounds()) || y1.getBounds().overlaps(tnt1.getBounds()) || t1.getBounds().overlaps(tnt1.getBounds())) {
                tnt1.onhit();
            }
            if (bl1.getBounds().overlaps(tnt2.getBounds()) || y1.getBounds().overlaps(tnt2.getBounds()) || t1.getBounds().overlaps(tnt2.getBounds())) {
                tnt2.onhit();
            }
            if (bl1.getBounds().overlaps(tnt3.getBounds()) || y1.getBounds().overlaps(tnt3.getBounds()) || t1.getBounds().overlaps(tnt3.getBounds())) {
                tnt3.onhit();
            }
            if (bl1.getBounds().overlaps(glass1.getBounds()) || y1.getBounds().overlaps(glass1.getBounds()) || t1.getBounds().overlaps(glass1.getBounds())) {
                glass1.onhit();
            }
            if (bl1.getBounds().overlaps(glass2.getBounds()) || y1.getBounds().overlaps(glass2.getBounds()) || t1.getBounds().overlaps(glass2.getBounds())) {
                glass2.onhit();
            }

            if (allpigsdead()) {
                game.setScreen(new winScreen(game, current_level));
            }

            if (bl1.getPosy() <= 110) {
                bl1.remove();
                stage.addActor(y1);

            }
            if (y1.getPosy() <= 110) {
                y1.remove();
                stage.addActor(t1);
            }
            if (t1.getPosy() <= 110) {
                t1.remove();
                stage.addActor(bl1);
            }
            if (bl1.getPosy() <= 110 && y1.getPosy() <= 110 && t1.getPosy() <= 110) {
                game.setScreen(new looseScreen(game));
            }

        }


        stage.act();
        stage.draw();

    }

    private boolean allpigsdead() {
        if (pigu1.getHealth() <= -50 && pigu2.getHealth() <= -50 && pigu3.getHealth() <= -50) {
            return true;
        }
        return false;
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

}


//    public static void main(String[] args) {

//        try {
//            // Reading the object from a file
//            FileInputStream file = new FileInputStream("level1.txt");
//            ObjectInputStream in = new ObjectInputStream(file);
//
//            // Method for deserialization of object
//
//            redbird redbird1 = (redbird) in.readObject();
//            System.out.println(redbird1.getName());
//            System.out.println(" ");
//            yellowbird yellowbird1 = (yellowbird) in.readObject();
//            System.out.println(yellowbird1.getName());
//            System.out.println(" ");
//            terence terencebird1 = (terence) in.readObject();
//            System.out.println(terencebird1.getName());
//            System.out.println(" ");
////
//            ironblock i1= (ironblock) in.readObject();
//            System.out.println(i1.getName());
//            System.out.println(i1.getPosx());
//            System.out.println(" ");
//            ironblock i2 = (ironblock) in.readObject();
//            ironblock i3 = (ironblock) in.readObject();
//            ironblock i4 = (ironblock) in.readObject();
//            ironblock i5 = (ironblock) in.readObject();
//            ironblock i6 = (ironblock) in.readObject();
//            ironblock i7 = (ironblock) in.readObject();
//            ironblock i8 = (ironblock) in.readObject();
////
//            glassblock g1 = (glassblock) in.readObject();
//            glassblock g2 = (glassblock) in.readObject();
////
//            woodblock w1 = (woodblock) in.readObject();
//            woodblock w2 = (woodblock) in.readObject();
//            woodblock w3 = (woodblock) in.readObject();
//            woodblock w4 = (woodblock) in.readObject();
//            woodblock w5 = (woodblock) in.readObject();
//            woodblock w6 = (woodblock) in.readObject();
//            woodblock w7 = (woodblock) in.readObject();
//            woodblock w8 = (woodblock) in.readObject();
//            woodblock w9 = (woodblock) in.readObject();
//            woodblock w10 = (woodblock) in.readObject();
////
//            tntblock t1 = (tntblock) in.readObject();
//            tntblock t2 = (tntblock) in.readObject();
//            tntblock t3 = (tntblock) in.readObject();
////
//            pig pig1 = (pig) in.readObject();
//            pig pig2 = (pig) in.readObject();
//            pig pig3 = (pig) in.readObject();
//
//            // Closing the stream
//            in.close();
//            file.close();
//
//
//
//
//
//
//
//            System.out.println("Object has been deserialized ");
//        } catch (IOException ex) {
//            System.out.println("IOException is caught");
//        } catch (ClassNotFoundException ex) {
//            System.out.println("ClassNotFoundException is caught");
//        }
//    }

//}
