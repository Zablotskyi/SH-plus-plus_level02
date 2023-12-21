package com.shpp.p2p.cs.vzablotskyi.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    /**  check whether we have a larger width or height. If the width is greater, then create 4 circles with a diameter of
     * 1/3 of the height at the corners of the field, if the height is greater, then create 4 circles with a diameter of
     * 1/3 of the width at the corners of the field
     * create a rectangle in the middle, each vertex of the rectangle is the center of the circle*/
    @Override
    public void run() {
        final double CIRCLE_CREATED_BY_WIDTH = getWidth() / 3.0; // constant for creating a circle relative to the width of the field
        final double CIRCLE_CREATED_BY_HEIGHT = getHeight() / 3.0; // constant for creating a circle relative to the height of the field
        if (getWidth() >= getHeight()) {
            createCircle(0, 0, CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT, Color.BLACK);
            createCircle(getWidth() - CIRCLE_CREATED_BY_HEIGHT, 0, CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT, Color.BLACK);
            createCircle(0, getHeight() - CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT, Color.BLACK);
            createCircle(getWidth() - CIRCLE_CREATED_BY_HEIGHT, getHeight() - CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT, Color.BLACK);
            creteRectangle((CIRCLE_CREATED_BY_HEIGHT) / 2, (CIRCLE_CREATED_BY_HEIGHT) / 2, getWidth() - CIRCLE_CREATED_BY_HEIGHT, getHeight() - CIRCLE_CREATED_BY_HEIGHT, Color.WHITE);
        } else if (getWidth() < getHeight()) {
            createCircle(0, 0, CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH, Color.BLACK);
            createCircle(getWidth() - CIRCLE_CREATED_BY_WIDTH, 0, CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH, Color.BLACK);
            createCircle(0, getHeight() - CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH, Color.BLACK);
            createCircle(getWidth() - CIRCLE_CREATED_BY_WIDTH, getHeight() - CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH, Color.BLACK);
            creteRectangle((CIRCLE_CREATED_BY_WIDTH) / 2, (CIRCLE_CREATED_BY_WIDTH) / 2, getWidth() - CIRCLE_CREATED_BY_WIDTH, getHeight() - CIRCLE_CREATED_BY_WIDTH, Color.WHITE);
        }
    }
    /** the method creates a circle at the specified coordinates X and Y,
    * with the specified width and height and fills it with a color */
    private void createCircle(double x, double y, double width, double height, Color color) {
        GOval circle = new GOval(x, y, width, height);
        circle.setFilled(true);
        circle.setColor(color);
        add(circle);
    }

    /** method creates a rectangle at the given coordinates X and Y, with the given width and height and fills it with a color */
    private void creteRectangle(double x, double y, double width, double height, Color color) {
        GRect square = new GRect(x, y, width, height);
        square.setFilled(true);
        square.setColor(color);
        add(square);
    }
}