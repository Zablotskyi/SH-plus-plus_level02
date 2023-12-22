package com.shpp.p2p.cs.vzablotskyi.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    double a, b, c; // derivative numbers
    double discriminant = b * b - 4 * a * c; // discriminant formula

    @Override
    public void run() {
        a = readDouble("Please enter a:");
        b = readDouble("Please enter b:");
        c = readDouble("Please enter c:");
        checkingTheDiscriminant(a, b, c);
    }
    /**
     searching for a discriminant using a mathematical formula of three derivatives
     */
    private void checkingTheDiscriminant(double a, double b, double c) {
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