package com.shpp.p2p.cs.vzablotskyi;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    private final double FLAG_WIDTH = 450;
    private final double FLAG_HEIGHT = 300;
    @Override
    public void run() {
        GRect firstLane = new GRect((getWidth() - FLAG_WIDTH) / 2, (getHeight() - FLAG_HEIGHT) / 2, 450, 100);
        firstLane.setFilled(true);
        firstLane.setColor(Color.BLACK);
        add(firstLane);

        GRect secondLane = new GRect((getWidth() - FLAG_WIDTH) / 2, ((getHeight() - FLAG_HEIGHT) / 2) + FLAG_HEIGHT / 3, 450, 100);
        secondLane.setFilled(true);
        secondLane.setColor(Color.RED);
        add(secondLane);

        GRect thirdLane = new GRect((getWidth() - FLAG_WIDTH) / 2, ((getHeight() - FLAG_HEIGHT) / 2) + FLAG_HEIGHT / 3 * 2, 450, 100);
        thirdLane.setFilled(true);
        thirdLane.setColor(Color.YELLOW);
        add(thirdLane);

        GLabel countryFlag = new GLabel("flag of Germany", getWidth() - 120, getHeight() - 10);
        countryFlag.setFont("Arial");
        countryFlag.setColor(Color.BLACK);
        countryFlag.setFont("100");
        add(countryFlag);
    }
}