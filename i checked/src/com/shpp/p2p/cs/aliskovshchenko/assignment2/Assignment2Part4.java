package com.shpp.p2p.cs.aliskovshchenko.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.graphics.GRectangle;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    private static final int WIDTH_FLAG = 200;
    private static final int HEIGHT_FLAG = 40;
    /*easy adjustment of the label name country*/
    public static final String COUNTRY_NAME = "Netherlands";
    /*easy adjustment of the choice of the left part of the flag colour*/
    private static final Color UPPER_COLOR = new Color(196, 30, 58);
    /*easy adjustment of the choice of the central part of the flag colour*/
    private static final Color CENTRAL_COLOR = new Color(239, 239, 239);
    /*easy adjustment of the choice of the right part of the flag colour*/
    private static final Color LOWER_COLOR = new Color(21, 73, 162);

    public void run() {
        drawTheFlag();
        drawTheLabel();
    }

    /**
     * method that writes the name of country
     * and is regulated by a constant with the country name
     */
    private void drawTheLabel() {
        GLabel countryName = new GLabel("Flag of " + COUNTRY_NAME);
        countryName.setFont("Helvetica-20");
        add(countryName,
                getWidth() - countryName.getWidth(),
                getHeight() - countryName.getDescent());
    }

    /**
     * method that build three parts of the flag
     */
    private void drawTheFlag() {
        int upperPartFlagX = getWidth() / 2 - WIDTH_FLAG / 2;
        int upperPartFlagY = getHeight() / 2 - HEIGHT_FLAG / 2 - HEIGHT_FLAG;
        drawOnePartTheFlag(UPPER_COLOR, upperPartFlagX, upperPartFlagY);

        int centralPartFlagX = getWidth() / 2 - WIDTH_FLAG / 2;
        int centralPartFlagY = getHeight() / 2 - HEIGHT_FLAG / 2;
        drawOnePartTheFlag(CENTRAL_COLOR, centralPartFlagX, centralPartFlagY);

        int lowerPartFlagX = getWidth() / 2 - WIDTH_FLAG / 2;
        int lowerPartFlagY = getHeight() / 2 - HEIGHT_FLAG / 2 + HEIGHT_FLAG;
        drawOnePartTheFlag(LOWER_COLOR, lowerPartFlagX, lowerPartFlagY);
    }

    /**
     * method that build one part of the flag of any color
     */
    private void drawOnePartTheFlag(Color color, int x, int y) {
        GRect rect = new GRect(x, y, WIDTH_FLAG, HEIGHT_FLAG);
        rect.setFilled(true);
        rect.setColor(color);
        rect.setFillColor(color);
        add(rect);
    }
}
