package com.shpp.p2p.cs.vzablotskyi.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.*;

public class Assignment2Part2 extends WindowProgram {

    @Override
    public void run() {
        final double CIRCLE_CREATED_BY_WIDTH = getWidth() / 3.0;
        final double CIRCLE_CREATED_BY_HEIGHT = getHeight() / 3.0;
        if (getWidth() >= getHeight()) {
            GOval leftTopCircle = new GOval(0, 0, CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT);
            leftTopCircle.setFilled(true);
            leftTopCircle.setColor(Color.RED);
            add(leftTopCircle);

            GOval rightTopCircle = new GOval(getWidth() - CIRCLE_CREATED_BY_HEIGHT, 0, CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT);
            rightTopCircle.setFilled(true);
            rightTopCircle.setColor(Color.BLUE);
            add(rightTopCircle);

            GOval leftBottomCircle = new GOval(0, getHeight() - CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT);
            leftBottomCircle.setFilled(true);
            leftBottomCircle.setColor(Color.BLACK);
            add(leftBottomCircle);

            GOval rightBottomCircle = new GOval(getWidth() - CIRCLE_CREATED_BY_HEIGHT, getHeight() - CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT, CIRCLE_CREATED_BY_HEIGHT);
            rightBottomCircle.setFilled(true);
            rightBottomCircle.setColor(Color.YELLOW);
            add(rightBottomCircle);

            GRect square = new GRect((CIRCLE_CREATED_BY_HEIGHT) / 2, (CIRCLE_CREATED_BY_HEIGHT) / 2, getWidth() - CIRCLE_CREATED_BY_HEIGHT, getHeight() - CIRCLE_CREATED_BY_HEIGHT);
            square.setFilled(true);
            square.setColor(Color.GRAY);
            add(square);
        } else if (getWidth() < getHeight()) {
            GOval leftTopCircle = new GOval(0, 0, CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH);
            leftTopCircle.setFilled(true);
            leftTopCircle.setColor(Color.RED);
            add(leftTopCircle);

            GOval rightTopCircle = new GOval(getWidth() - CIRCLE_CREATED_BY_WIDTH, 0, CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH);
            rightTopCircle.setFilled(true);
            rightTopCircle.setColor(Color.BLUE);
            add(rightTopCircle);

            GOval leftBottomCircle = new GOval(0, getHeight() - CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH);
            leftBottomCircle.setFilled(true);
            leftBottomCircle.setColor(Color.BLACK);
            add(leftBottomCircle);

            GOval rightBottomCircle = new GOval(getWidth() - CIRCLE_CREATED_BY_WIDTH, getHeight() - CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH, CIRCLE_CREATED_BY_WIDTH);
            rightBottomCircle.setFilled(true);
            rightBottomCircle.setColor(Color.YELLOW);
            add(rightBottomCircle);

            GRect square = new GRect((CIRCLE_CREATED_BY_WIDTH) / 2, (CIRCLE_CREATED_BY_WIDTH) / 2, getWidth() - CIRCLE_CREATED_BY_WIDTH, getHeight() - CIRCLE_CREATED_BY_WIDTH);
            square.setFilled(true);
            square.setColor(Color.GRAY);
            add(square);
        }
    }
}