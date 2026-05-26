package io.github.osamabmaq.tafqeetj.converters;

import java.util.Objects;

public class DecimalInWords {

    private final IntegerInWords numberLeftDecimalPoint;

    private final IntegerInWords numberRightDecimalPoint;

    private final String fractionalRatioName;

    public DecimalInWords(IntegerInWords numberLeftDecimalPoint, IntegerInWords numberRightDecimalPoint, String fractionalRatioName) {
        this.numberLeftDecimalPoint = Objects.requireNonNull(numberLeftDecimalPoint);
        this.numberRightDecimalPoint = Objects.requireNonNull(numberRightDecimalPoint);
        if (numberRightDecimalPoint.equals(IntegerInWords.createZero()))
            fractionalRatioName = "";
        this.fractionalRatioName = Objects.requireNonNull(fractionalRatioName);
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
