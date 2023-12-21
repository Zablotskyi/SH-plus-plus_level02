package com.shpp.p2p.cs.aliskovshchenko.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    /**
     * A console program that will take 3 numbers of type double (A,B,C)
     * as input and print the roots of a quadratic equation.
     */
    public void run() {
        /*
        after starting the program, you need to enter 3 numbers into the console: A, B, C,
        which are the real numbers of the quadratic equation: A*(x^2) + B*x + C = 0
        */
        double A = readDouble("Please enter A: ");
        double B = readDouble("Please enter B: ");
        double C = readDouble("Please enter C: ");

        //check for the case when the user enters A = 0, which does not satisfy the condition of a quadratic equation
        if (A != 0) {
            getRoots(A, B, C);
        } else {
            println("This equation is not quadratic !");
        }
    }

    /**
     * method that finds the roots of quadratic equation
     */
    private void getRoots(double a, double b, double c) {
        /*
        descr - is  the discriminant.
        The value of the discriminant can be used to determine the number of roots of a quadratic equation.
        */
        double descr = Math.pow(b, 2) - (4 * a * c);
        //if discriminant less than 0, the equation has no real roots.
        if (descr < 0) {
            println("There are no real roots");
        }
        //if discriminant is equal 0, the equation has one real root.
        if (descr == 0) {
            double x = -b / (2 * a);
            println("There is one root: " + x);
        }
        /*
        if discriminant more than 0, the equation has two real roots.
        The roots of a quadratic equation are found using the following formulas: */
        if (descr > 0) {
            double x = (-b + Math.sqrt(descr)) / (2 * a);
            double y = (-b - Math.sqrt(descr)) / (2 * a);
            println("There are two roots: " + x + " and " + y);
        }
    }
}
