package org.JavaNote.calculation;

public class PowOperation implements Operation {
    @Override
    public double apply(double a, double b) {
        return Math.pow(a, b);
    }
}
