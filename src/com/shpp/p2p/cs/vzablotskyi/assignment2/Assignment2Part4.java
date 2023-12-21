package com.shpp.p2p.cs.vzablotskyi.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    private static final double FLAG_WIDTH = 450; // flag width constant
    private static final double FLAG_HEIGHT = 300; // flag height constant

    /** the method creates the Germany flag. Three rectangles are created that correspond to the colors of the Germany flag and are centered
     * relative to the size of the window. An inscription with the name of the flag is added in the lower right corner */
    @Override
    public void run() {
        creteRectangle((getWidth() - FLAG_WIDTH) / 2, (getHeight() - FLAG_HEIGHT) / 2,  FLAG_WIDTH, FLAG_HEIGHT / 3, Color.BLACK);
        creteRectangle((getWidth() - FLAG_WIDTH) / 2,  ((getHeight() - FLAG_HEIGHT) / 2) + FLAG_HEIGHT / 3, FLAG_WIDTH,  FLAG_HEIGHT / 3, Color.RED);
        creteRectangle((getWidth() - FLAG_WIDTH) / 2,  ((getHeight() - FLAG_HEIGHT) / 2) + FLAG_HEIGHT / 3 * 2, FLAG_WIDTH,  FLAG_HEIGHT / 3, Color.YELLOW);

        GLabel countryFlag = new GLabel("flag of Germany ", getWidth() - 120, getHeight() - 10);
        countryFlag.setFont("Arial");
        countryFlag.setColor(Color.BLACK);
        countryFlag.setFont("100");
        double x = (getWidth() - countryFlag.getWidth()); // X coordinate for the name of the state
        double y = getHeight() - countryFlag.getAscent(); // У coordinate for the name of the state
        add(countryFlag, x, y);
    }

    /** method creates one of the flag strips with the specified size, color and coordinates */
    private void creteRectangle(double x, double y, double width, double height, Color color) {
        GRect rectangle = new GRect(x, y, width, height);
        rectangle.setFilled(true);
        rectangle.setColor(color);
        add(rectangle);
    }
}