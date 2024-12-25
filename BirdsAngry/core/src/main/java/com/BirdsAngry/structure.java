//package com.BirdsAngry;
//
//import com.badlogic.gdx.scenes.scene2d.Actor;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//
//public class structure {
//    // creae the strcutre here
//
//}


package com.BirdsAngry;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class structure {
        private static ironblock i1;
        private static ironblock i2;
        private static ironblock i3;
        private static ironblock i4;
        private static ironblock i5;
        private static ironblock i6;
        private static ironblock i7;
        private static ironblock i8;
        private static glassblock g1;
        private static glassblock g2;
        private static woodblock w1;
        private static woodblock w2;
        private static woodblock w3;
        private static woodblock w4;
        private static woodblock w5;
        private static woodblock w6;
        private static woodblock w7;
        private static woodblock w8;
        private static woodblock w9;
        private static woodblock w10;
        private static tntblock t1;
        private static tntblock t2;
        private static tntblock t3;
        private static pig p1;
        private static pig p2;
        private static pig p3;


    public structure() {
        i1 = new ironblock("Iron", 0+500, 140+70, 45, 50, 100);
        i2 = new ironblock("Iron", 90+500, 140+70, 45, 50, 100);
        i3 = new ironblock("Iron", 0+500, 165+70, 45, 50, 100);
        i4 = new ironblock("Iron", 90+500, 165+70, 45, 50, 100);
        i5 = new ironblock("Iron", 0+500, 190+70, 45, 50, 100);
        i6 = new ironblock("Iron", 90+500, 190+70, 45, 50, 100);
        i7 = new ironblock("Iron", 32+500, 190+70, 45, 50, 100);
        i8 = new ironblock("Iron", 58+500, 190+70, 45, 50, 100);

        g1 = new glassblock("Glass", 20+500, 215+70, 45, 50, 50);
        g2 = new glassblock("Glass", 70+500, 215+70, 45, 50, 50);

        w1 = new woodblock("Wood", 28+500, 255+70, 50, 50, 75);
        w2 = new woodblock("Wood", 58+500, 255+70, 50, 50, 75);
        w3 = new woodblock("Wood", 0+500, 40+70, 50, 50, 75);
        w4 = new woodblock("Wood", 0+500, 70+70, 50, 50, 75);
        w5 = new woodblock("Wood", 0+500, 100+70, 50, 50, 75);
        w6 = new woodblock("Wood", 30+500, 100+70, 50, 50, 75);
        w7 = new woodblock("Wood", 60+500, 100+70, 50, 50, 75);
        w8 = new woodblock("Wood", 90+500, 100+70, 50, 50, 75);
        w9 = new woodblock("Wood", 90+500, 70+70, 50, 50, 75);
        w10 = new woodblock("Wood", 90+500, 40+70, 50, 50, 75);

        t1 = new tntblock("TNT", 0+500, 0+70, 50, 50, 100);
        t2 = new tntblock("TNT", 50+500, 0+70, 50, 50, 100);
        t3 = new tntblock("TNT", 100+500, 0+70, 50, 50, 100);

        p1 = new pig(43+500, 290+70, 40, 40,2);
        p2 = new pig(145+500, 20+70, 70, 70,4);
        p3 = new pig(45+500, 50+70, 50, 50,3);



    }
//        // Initialize blocks and pigs
//        ironblocks = new ironblock[]{
//            new ironblock("Iron", 0, 140, 45, 50, 100),
//            new ironblock("Iron", 90, 140, 45, 50, 100),
//            new ironblock("Iron", 0, 165, 45, 50, 100),
//            new ironblock("Iron", 90, 165, 45, 50, 100),
//            new ironblock("Iron", 0, 190, 45, 50, 100),
//            new ironblock("Iron", 90, 190, 45, 50, 100),
//            new ironblock("Iron", 32, 190, 45, 50, 100),
//            new ironblock("Iron", 58, 190, 45, 50, 100)
//        };
//
//        glassblocks = new glassblock[]{
//            new glassblock("Glass", 20, 215, 45, 50, 50),
//            new glassblock("Glass", 70, 215, 45, 50, 50)
//        };
//
//        woodblocks = new woodblock[]{
//            new woodblock("Wood", 28, 255, 50, 50, 75),
//            new woodblock("Wood", 58, 255, 50, 50, 75),
//            new woodblock("Wood", 0, 40, 50, 50, 75),
//            new woodblock("Wood", 0, 70, 50, 50, 75),
//            new woodblock("Wood", 0, 100, 50, 50, 75),
//            new woodblock("Wood", 30, 100, 50, 50, 75),
//            new woodblock("Wood", 60, 100, 50, 50, 75),
//            new woodblock("Wood", 90, 100, 50, 50, 75),
//            new woodblock("Wood", 90, 70, 50, 50, 75),
//            new woodblock("Wood", 90, 40, 50, 50, 75)
//        };
//
//        tntblocks = new tntblock[]{
//            new tntblock("TNT", 0, 0, 50, 50, 100),
//            new tntblock("TNT", 50, 0, 50, 50, 100),
//            new tntblock("TNT", 100, 0, 50, 50, 100)
//        };
//
//        pigs = new pig[]{
//            new pig(43, 290, 40, 40,2),
//            new pig(145, 20, 70, 70,4),
//            new pig(45, 50, 50, 50,3)
//        };
//    }

    public static void draw(SpriteBatch batch, int xpos, int ypos) {
        batch.draw(i1.getTexture(), xpos + i1.getPosx(), ypos + i1.getPosy(), i1.getWidth(), i1.getHeight());
        batch.draw(i2.getTexture(), xpos + i2.getPosx(), ypos + i2.getPosy(), i2.getWidth(), i2.getHeight());
        batch.draw(i3.getTexture(), xpos + i3.getPosx(), ypos + i3.getPosy(), i3.getWidth(), i3.getHeight());
        batch.draw(i4.getTexture(), xpos + i4.getPosx(), ypos + i4.getPosy(), i4.getWidth(), i4.getHeight());
        batch.draw(i5.getTexture(), xpos + i5.getPosx(), ypos + i5.getPosy(), i5.getWidth(), i5.getHeight());
        batch.draw(i6.getTexture(), xpos + i6.getPosx(), ypos + i6.getPosy(), i6.getWidth(), i6.getHeight());
        batch.draw(i7.getTexture(), xpos + i7.getPosx(), ypos + i7.getPosy(), i7.getWidth(), i7.getHeight());
        batch.draw(i8.getTexture(), xpos + i8.getPosx(), ypos + i8.getPosy(), i8.getWidth(), i8.getHeight());
        batch.draw(g1.getTexture(), xpos + g1.getPosx(), ypos + g1.getPosy(), g1.getWidth(), g1.getHeight());
        batch.draw(g2.getTexture(), xpos + g2.getPosx(), ypos + g2.getPosy(), g2.getWidth(), g2.getHeight());
        batch.draw(w1.getTexture(), xpos + w1.getPosx(), ypos + w1.getPosy(), w1.getWidth(), w1.getHeight());
        batch.draw(w2.getTexture(), xpos + w2.getPosx(), ypos + w2.getPosy(), w2.getWidth(), w2.getHeight());
        batch.draw(w3.getTexture(), xpos + w3.getPosx(), ypos + w3.getPosy(), w3.getWidth(), w3.getHeight());
        batch.draw(w4.getTexture(), xpos + w4.getPosx(), ypos + w4.getPosy(), w4.getWidth(), w4.getHeight());
        batch.draw(w5.getTexture(), xpos + w5.getPosx(), ypos + w5.getPosy(), w5.getWidth(), w5.getHeight());
        batch.draw(w6.getTexture(), xpos + w6.getPosx(), ypos + w6.getPosy(), w6.getWidth(), w6.getHeight());
        batch.draw(w7.getTexture(), xpos + w7.getPosx(), ypos + w7.getPosy(), w7.getWidth(), w7.getHeight());
        batch.draw(w8.getTexture(), xpos + w8.getPosx(), ypos + w8.getPosy(), w8.getWidth(), w8.getHeight());
        batch.draw(w9.getTexture(), xpos + w9.getPosx(), ypos + w9.getPosy(), w9.getWidth(), w9.getHeight());
        batch.draw(w10.getTexture(), xpos + w10.getPosx(), ypos + w10.getPosy(), w10.getWidth(), w10.getHeight());
        batch.draw(t1.getTexture(), xpos + t1.getPosx(), ypos + t1.getPosy(), t1.getWidth(), t1.getHeight());
        batch.draw(t2.getTexture(), xpos + t2.getPosx(), ypos + t2.getPosy(), t2.getWidth(), t2.getHeight());
        batch.draw(t3.getTexture(), xpos + t3.getPosx(), ypos + t3.getPosy(), t3.getWidth(), t3.getHeight());
        batch.draw(p1.getPigTexture(), xpos + p1.getPosx(), ypos + p1.getPosy(), p1.getWidth(), p1.getHeight());
        batch.draw(p2.getPigTexture(), xpos + p2.getPosx(), ypos + p2.getPosy(), p2.getWidth(), p2.getHeight());
        batch.draw(p3.getPigTexture(), xpos + p3.getPosx(), ypos + p3.getPosy(), p3.getWidth(), p3.getHeight());
    }




    // add blocks to stage
//    public void addBlocksToStage(Stage stage) {
//        for (ironblock block : ironblocks) {
//            stage.addActor(block);
//        }
//        for (glassblock block : glassblocks) {
//            stage.addActor(block);
//        }
//        for (woodblock block : woodblocks) {
//            stage.addActor(block);
//        }
//        for (tntblock block : tntblocks) {
//            stage.addActor(block);
//        }
//        for (pig pig : pigs) {
//            stage.addActor(pig);
//        }
//    }

    //getters and setters
    public ironblock getI1() {
        return i1;
    }

    public ironblock getI2() {
        return i2;
    }

    public ironblock getI3() {
        return i3;
    }

    public ironblock getI4() {
        return i4;
    }

    public ironblock getI5() {
        return i5;
    }

    public ironblock getI6() {
        return i6;
    }

    public ironblock getI7() {
        return i7;
    }

    public ironblock getI8() {
        return i8;
    }

    public glassblock getG1() {
        return g1;
    }

    public glassblock getG2() {
        return g2;
    }


    public static woodblock getW1() {
        return w1;
    }

    public woodblock getW2() {
        return w2;
    }

    public woodblock getW3() {
        return w3;
    }

    public woodblock getW4() {
        return w4;
    }

    public woodblock getW5() {
        return w5;
    }

    public woodblock getW6() {
        return w6;
    }

    public woodblock getW7() {
        return w7;
    }

    public woodblock getW8() {
        return w8;
    }

    public woodblock getW9() {
        return w9;
    }

    public woodblock getW10() {
        return w10;
    }

    public tntblock getT1() {
        return t1;
    }

    public tntblock getT2() {
        return t2;
    }

    public tntblock getT3() {
        return t3;
    }

    public pig getP1() {
        return p1;
    }

    public pig getP2() {
        return p2;
    }

    public pig getP3() {
        return p3;
    }


    // add to stage
    public void addBlocksToStage(Stage stage) {
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
    }




}

