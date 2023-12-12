package com.shpp.p2p.cs.vzablotskyi;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {

    @Override
    public void run() {
        double a = readDouble("Please enter a:");
        double b = readDouble("Please enter b:");
        double c = readDouble("Please enter c:");

/*
        discriminant formula
*/
        double discriminant = b * b - 4 * a * c;

/*
         Checking the discriminant
*/
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("There are two roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("There is one root:" + root);
        } else {
            System.out.println("There are no real roots.");
        }
    }
}