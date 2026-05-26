package io.github.osamabmaq.tafqeetj.numbers;

import io.github.osamabmaq.tafqeetj.converters.BasicNumberConverter;
import io.github.osamabmaq.tafqeetj.converters.BasicNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.converters.QuantitiveNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.converters.negative.NegativeQuantitiveNumberConvertersFactory;
import io.github.osamabmaq.tafqeetj.converters.positive.PositiveQuantitiveNumberConvertersFactory;
import java.math.BigDecimal;
import java.math.BigInteger;

public enum NumberSign {

    POSITIVE(PositiveQuantitiveNumberConvertersFactory.getInstance(), BasicNumberConverterFactory.getPositiveConverter()), NEGATIVE(NegativeQuantitiveNumberConvertersFactory.getInstance(), BasicNumberConverterFactory.getNegativeConverter());

    private final QuantitiveNumberConverterFactory quantitiveNumberConverterFactory;

    private final BasicNumberConverter basicNumberConverter;

    NumberSign(QuantitiveNumberConverterFactory quantitiveNumberConverterFactory, BasicNumberConverter basicNumberConverter) {
        this.quantitiveNumberConverterFactory = quantitiveNumberConverterFactory;
        this.basicNumberConverter = basicNumberConverter;
    }

    public QuantitiveNumberConverterFactory getQuantitiveNumberConverterFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BasicNumberConverter getBasicNumberConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static NumberSign signOf(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static NumberSign signOf(byte number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static NumberSign signOf(short number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static NumberSign signOf(long number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static NumberSign signOf(BigInteger number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static NumberSign signOf(BigDecimal number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
