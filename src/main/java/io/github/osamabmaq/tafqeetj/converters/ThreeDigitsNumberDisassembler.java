package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;
import java.util.Objects;

public class ThreeDigitsNumberDisassembler {

    private final ThreeDigitsNumber threeDigitsNumber;

    public ThreeDigitsNumberDisassembler(ThreeDigitsNumber threeDigitsNumber) {
        this.threeDigitsNumber = Objects.requireNonNull(threeDigitsNumber);
    }

    public ThreeDigitsNumber getThreeDigitsNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getHundreds() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getTens() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getComposedNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getOnes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
