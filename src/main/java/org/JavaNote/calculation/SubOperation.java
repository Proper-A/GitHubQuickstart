package org.JavaNote.calculation;

public class SubOperation implements Operation {
    @Override
    public double apply(double a, double b) {
        return a - b;
    }
}
