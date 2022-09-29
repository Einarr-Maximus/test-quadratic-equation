package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private final double a;
    private final double b;
    private final double c;
    private final String expected;

    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object object() {
        return new Object[][]{
                {2, 5, -3, "-3.0 0.5"},
                {1, -3, 1, "0.3819660112501051 2.618033988749895"},
                {2, -38, 156, "13.0 6.0"},
                {-0.5, 34, 1046.5, "-23.0 91.0"}
        };
    }

    @Test
    public void testTwoRootsCase() {
        String actualString = quadraticEquation.solve(a, b, c);
        double[] actualRoots = Arrays.stream(actualString.replace(",",".").trim().split(" ")).mapToDouble(Double::parseDouble).toArray();
        if (actualRoots[0] > actualRoots[1]) {
            actualRoots = new double[]{actualRoots[1], actualRoots[0]};
        }
        double[] expectedRoots = Arrays.stream(expected.replace(",",".").trim().split(" ")).mapToDouble(Double::parseDouble).toArray();
        if (expectedRoots[0] > expectedRoots[1]) {
            expectedRoots = new double[]{expectedRoots[1], expectedRoots[0]};
        }
        assertArrayEquals(expectedRoots, actualRoots, 0.00001);
    }
}
