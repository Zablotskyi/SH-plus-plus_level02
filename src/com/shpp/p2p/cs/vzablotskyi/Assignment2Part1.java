package com.shpp.p2p.cs.vzablotskyi;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {

    @Override
    public void run() {
        println("1" + "2");

        int a = readInt("a: ");
        int b = readInt("b: ");
        int sum = a + b;

        println("result = " + sum);
    }
}