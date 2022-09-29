package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationNoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquationNoRootsCasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Object object() {
        return new Object[][]{
                {-563, 0, -5},
                {2, 10, 30},
                {-0.5, 1, -50},
                {2, 2, 2},
        };
    }

    @Test
    public void testNoRootsCase() {
        String actualString = quadraticEquation.solve(a, b, c);
        String expectedString = "no roots";
        assertEquals(expectedString, actualString);
    }
}
