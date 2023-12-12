package com.shpp.p2p.cs.vzablotskyi;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    @Override
    public void run() {
//        GLabel l = new GLabel("dog", 100, 100);
//        l.setFont("Verdana-50");
//        l.setColor(Color.GRAY);
//        add(l);
        for (int i = 0; i < 10; i++) {
            GRect r = new GRect(100 + i * 10, 100 + i * 10, 200, 200);
            r.setColor(Color.RED);
            r.setFilled(true);
            r.setFillColor(Color.GREEN);
            add(r);

            GOval o = new GOval(100 + i * 10, 100 + i * 10, 200, 200);
            o.setColor(Color.GREEN);
            add(o);

            GLine l = new GLine(100 + i * 10, 100 + i * 10, 200, 200);
            l.setColor(Color.BLUE);
            add(l);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
