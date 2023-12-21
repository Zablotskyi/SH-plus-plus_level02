package com.shpp.p2p.cs.aliskovshchenko.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {

    /*constant regulating the diameter of the round */
    public static final int DIAMETER = 100;
    /*constant regulating the width of the canvas */
    public static final int APPLICATION_WIDTH = 300;
    /*constant regulating the height of the canvas */
    public static final int APPLICATION_HEIGHT = 300;

    /**
     * method run() builds white rectangle overlapping the four circles
     */
    public void run() {
        drawTheRound(0, 0);
        drawTheRound(getWidth() - DIAMETER, getHeight() - DIAMETER);
        drawTheRound(getWidth() - DIAMETER, 0);
        drawTheRound(0, getHeight() - DIAMETER);

        drawRectangle();
    }

    /**
     * method which build the rectangle in the middle of canvas
     */
    private void drawRectangle() {
        GRect rect = new GRect(DIAMETER / 2.0, DIAMETER / 2.0,
                getWidth() - DIAMETER, getHeight() - DIAMETER);
        rect.setFilled(true);
        rect.setColor(Color.WHITE);// fill edge of rectangle to white color
        rect.setFillColor(Color.WHITE);
        add(rect);
    }

    /**
     * method which build one circle in the coordinates x and y
     */
    private void drawTheRound(int x, int y) {
        GOval oval = new GOval(x, y, DIAMETER, DIAMETER);
        oval.setFilled(true);
        oval.setFillColor(Color.BLACK);
        add(oval);
    }
}
