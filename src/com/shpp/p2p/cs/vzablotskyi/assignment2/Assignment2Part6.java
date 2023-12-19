package com.shpp.p2p.cs.vzablotskyi.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {
    private static final int FIRST_SECTION = 50; // radius of the first section of the snake
    private static final int BODY_LENGTH = 3; // number of ovals in the snake (2 sections are created in one iteration)
    private static final int SECOND_SECTION = 50; // radius of the second section of the snake
    private static final Color BORDER_SECTION_COLOR = Color.RED; // frame color of the snake section
    private static final Color BODY_SECTION_COLOR = Color.GREEN; // body color of the snake section

    public void run() {
        double startX = 100; // initial X coordinate for the first section of the snake
        double startY = 150; // initial Y coordinate for the first section of the snake

        for (int i = 0; i < BODY_LENGTH; i++) {
            drawSnakeCircle(startX, startY, FIRST_SECTION, SECOND_SECTION);
            startX += FIRST_SECTION * 2; // X coordinate for the second section of the snake
        }
    }

    private void drawSnakeCircle(double x, double y, double circleRadius, double curveRadius) {
        double controlX = x + circleRadius; // initial X coordinate for the second section of the snake
        double controlY = y - curveRadius / 2;  // initial Y coordinate for the second section of the snake

        // add the first section of the snake
        GOval firstSnakeSection = new GOval(x, y, circleRadius * 2, circleRadius * 2);
        firstSnakeSection.setFilled(true);
        firstSnakeSection.setColor(BORDER_SECTION_COLOR);
        firstSnakeSection.setFillColor(BODY_SECTION_COLOR);
        add(firstSnakeSection);


        // add the second section of the snake
        GOval secondSnakeSection = new GOval(controlX, controlY, curveRadius * 2, curveRadius * 2);
        secondSnakeSection.setFilled(true);
        secondSnakeSection.setColor(BORDER_SECTION_COLOR);
        secondSnakeSection.setFillColor(BODY_SECTION_COLOR);
        add(secondSnakeSection);
    }
}



