package com.shpp.p2p.cs.aliskovshchenko.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;
    /* The width and height of each box. */
    private static final double BOX_SIZE = 50;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 2;

    public void run() {
        drawOpticalIllusionImage();
    }

    /**
     * method that draw all image in center of the canvas
     */
    private void drawOpticalIllusionImage() {
        for (int i = 0; i < NUM_COLS; i++)
            for (int j = 0; j < NUM_ROWS; j++) {
                double x = getWidth() / 2.0 - (NUM_COLS * (BOX_SIZE + BOX_SPACING)) / 2 + (BOX_SIZE + BOX_SPACING) * i;
                double y = getHeight() / 2.0 - (NUM_ROWS * (BOX_SIZE + BOX_SPACING)) / 2 + (BOX_SIZE + BOX_SPACING) * j;

                drawBox(x, y);
            }
    }

    /**
     * method that draw the one black box
     */
    private void drawBox(double x, double y) {
        GRect box = new GRect(x, y, BOX_SIZE, BOX_SIZE);
        box.setFilled(true);
        box.setColor(Color.BLACK);
        add(box);
    }
}
