package org.JavaNote.calculation;

import junit.framework.TestCase;

public class OperationTest extends TestCase {
    double a = 10;
    double b = 5;

    public void testAdd() {
        Operation op = new AddOperation();
        double result = op.apply(a, b);
        assertEquals(15.0, result);
    }

    public void testSub() {
        Operation op = new SubOperation();
        double result = op.apply(a, b);
        assertEquals(5.0, result);
    }
}