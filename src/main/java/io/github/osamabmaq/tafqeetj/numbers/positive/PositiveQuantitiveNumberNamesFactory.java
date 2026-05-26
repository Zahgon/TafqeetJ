package io.github.osamabmaq.tafqeetj.numbers.positive;

import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNamesFactory;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;

public class PositiveQuantitiveNumberNamesFactory implements QuantitiveNumberNamesFactory {

    private final static QuantitiveNumberNames thousands;

    private final static QuantitiveNumberNames millions;

    private final static QuantitiveNumberNames billions;

    private final static QuantitiveNumberNames trillions;

    static {
        thousands = new QuantitiveNumberNames("ألف", "ألفان", "آلاف", "ألفًا");
        millions = new QuantitiveNumberNames("مليون", "مليونان", "ملايين", "مليونًا");
        billions = new QuantitiveNumberNames("مليار", "ملياران", "مليارات", "مليارًا");
        trillions = new QuantitiveNumberNames("ترليون", "ترليونان", "ترليونات", "ترليونًا");
    }

    private static PositiveQuantitiveNumberNamesFactory instance;

    private PositiveQuantitiveNumberNamesFactory() {
    }

    public synchronized static PositiveQuantitiveNumberNamesFactory getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public QuantitiveNumberNames getThousands() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public QuantitiveNumberNames getMillions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public QuantitiveNumberNames getBillions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public QuantitiveNumberNames getTrillions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
