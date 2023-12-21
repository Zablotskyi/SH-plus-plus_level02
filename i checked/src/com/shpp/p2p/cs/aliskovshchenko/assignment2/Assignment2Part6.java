package com.shpp.p2p.cs.aliskovshchenko.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {
    /*Count of caterpillars segments */
    private static final int COUNT_SEGMENTS = 6;
    /*The radius of caterpillar segment*/
    private static final int RADIUS = 40;
    /*The radius of caterpillar segment*/
    private static final int DIAMETER = RADIUS * 2;
    /*
    The segment offset coefficient, which helps to place the next segment not from the central part
    but slightly to the right, as shown in the picture
    */
    private static final double COEFFICIENT_OFFSET = 1.25;

    public void run() {
        drawTheCaterpillar();
    }

    /**
     * This method draws caterpillar the required length, using the constants
     */
    private void drawTheCaterpillar() {
        for (int i = 0; i < COUNT_SEGMENTS; i++) {
            //every second segment should be at the height of the radius of the circle (caterpillar segment)
            if (i % 2 == 0) {
                drawOneSegment((int) ((RADIUS * i) * COEFFICIENT_OFFSET), RADIUS + DIAMETER);
            } else {
                drawOneSegment((int) ((RADIUS * i) * COEFFICIENT_OFFSET), DIAMETER);
            }
        }
    }

    /**
     * method that draws one filled oval (one segment from caterpillar)
     */
    private void drawOneSegment(int x, int y) {
        GOval oval = new GOval(x, y, DIAMETER, DIAMETER);
        oval.setFilled(true);
        oval.setColor(Color.RED);
        oval.setFillColor(Color.GREEN);
        add(oval);
    }
}
