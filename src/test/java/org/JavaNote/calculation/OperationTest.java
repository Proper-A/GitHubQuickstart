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

    public void testMul() {
        Operation op = new MulOperation();
        double result = op.apply(a, b);
        assertEquals(50.0, result);
    }

    public void testDiv() {
        Operation op = new DivOperation();
        double result = op.apply(a, b);
        assertEquals(2.0, result);
    }

    public void testDivByZero() {
        Operation op = new DivOperation();
        try {
            op.apply(a, 0);
            fail("应该抛出 ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("除数不能为0", e.getMessage());
        }
    }

    public void testPow() {
        Operation op = new PowOperation();
        double result = op.apply(a, b); // 10^5
        assertEquals(100000.0, result);
    }
}