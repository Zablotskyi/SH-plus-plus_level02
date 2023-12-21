package com.shpp.p2p.cs.vzablotskyi.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    /**
     * The number of rows and columns in the grid, respectively.
     */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /**
     * The width and height of each box.
     */
    private static final double BOX_SIZE = 40;

    /**
     * The horizontal and vertical spacing between the boxes.
     */
    private static final double BOX_SPACING = 10;

    @Override
    public void run() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                GRect innerSquare = new GRect(j * (BOX_SIZE + BOX_SPACING),
                        i * (BOX_SIZE + BOX_SPACING), BOX_SIZE, BOX_SIZE);
                innerSquare.setFilled(true);
                innerSquare.setColor(Color.BLACK);
                add(innerSquare);
            }
        }

        centerRectangles(NUM_ROWS, NUM_COLS, BOX_SIZE, BOX_SPACING);
    }

    /**
     * create an additional method that calculates the starting coordinates for each square using the built-in methods
     * of the GObject class. Receiving parameters such as: - the number of rows; - the number of columns;
     * - the size of the square; - the size of the interval between the squares, we calculate by which coordinates
     * we need to move the square relative to the square from which we get the coordinates at each iteration.
     */
    private void centerRectangles(int rows, int cols, double boxSize, double boxSpacing) {
        double centerX = getWidth() / 2 - (cols * boxSize) / 2 - (cols - 1) * boxSpacing / 2;
        double centerY = getHeight() / 2 - (rows * boxSize) / 2 - (rows - 1) * boxSpacing / 2;

        for (int i = 0; i < getElementCount(); i++) {
            GRect rect = (GRect) getElement(i);
            rect.setLocation(rect.getX() + centerX, rect.getY() + centerY);
        }
    }
}