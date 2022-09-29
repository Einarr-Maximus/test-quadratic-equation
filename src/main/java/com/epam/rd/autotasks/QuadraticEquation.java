package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        double D = b * b - 4 * a * c;
        if (D == 0) {
            double x = -b / (2 * a);
            return "" + x;
        } else if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            return x1 + " " + x2;
        } else {
            return "no roots";
        }
    }
}