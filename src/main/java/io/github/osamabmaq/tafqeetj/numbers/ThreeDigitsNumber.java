package io.github.osamabmaq.tafqeetj.numbers;

import java.util.Objects;

public class ThreeDigitsNumber {

    private final int number;

    private final NumberSign sign;

    private ThreeDigitsNumber(int number, NumberSign sign) {
        if (number < 0 || number > 999)
            throw new IllegalArgumentException("Number must be between 0 and 999 inclusive: " + number);
        this.number = number;
        this.sign = sign;
    }

    public static ThreeDigitsNumber of(int number, NumberSign sign) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public NumberSign getSign() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsHundreds() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsTens() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsOnes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean containsComposedNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
