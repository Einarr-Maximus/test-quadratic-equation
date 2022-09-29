package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Object object() {
        return new Object[][]{
                {0, 0, -5},
                {0, 10, 30},
                {0, 1, -50},
                {0, 11, 111}
        };
    }

    @Test(expected = Exception.class)
    public void testZeroACase() {
        quadraticEquation.solve(a, b, c);
    }
}
