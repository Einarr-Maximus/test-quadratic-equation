package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private final double a;
    private final double b;
    private final double c;
    private final double expected;

    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object object() {
        return new Object[][]{
                {1, -2, 1, 1.0},
                {1, 0, 0, 0.0},
                {8, 0, 0, 0.0},
                {1, 12, 36, -6.0}
        };
    }

    @Test
    public void testSingleRootCase() {
        double actual = Double.parseDouble(quadraticEquation.solve(a, b, c));
        assertEquals(expected, actual, 0.00001);
    }
}