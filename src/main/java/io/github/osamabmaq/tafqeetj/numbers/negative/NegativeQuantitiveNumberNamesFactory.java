package io.github.osamabmaq.tafqeetj.numbers.negative;

import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNamesFactory;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;

public class NegativeQuantitiveNumberNamesFactory implements QuantitiveNumberNamesFactory {

    private final static QuantitiveNumberNames thousands;

    private final static QuantitiveNumberNames millions;

    private final static QuantitiveNumberNames billions;

    private final static QuantitiveNumberNames trillions;

    static {
        thousands = new QuantitiveNumberNames("ألف", "ألفين", "آلاف", "ألفًا");
        millions = new QuantitiveNumberNames("مليون", "مليونين", "ملايين", "مليونًا");
        billions = new QuantitiveNumberNames("مليار", "مليارين", "مليارات", "مليارًا");
        trillions = new QuantitiveNumberNames("ترليون", "ترليونين", "ترليونات", "ترليونًا");
    }

    private static NegativeQuantitiveNumberNamesFactory instance;

    private NegativeQuantitiveNumberNamesFactory() {
    }

    public synchronized static NegativeQuantitiveNumberNamesFactory getInstance() {
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
