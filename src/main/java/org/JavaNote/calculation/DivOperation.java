package org.JavaNote.calculation;

public class DivOperation implements Operation {
    @Override
    public double apply(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return a / b;
    }
}
