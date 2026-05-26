package io.github.osamabmaq.tafqeetj.converters;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Tafqeet {

    private final IntegerToWordsConverter integerConverter = IntegerToWordsConverter.getInstance();

    private final DecimalToWordsConverter decimalConverter = DecimalToWordsConverter.getInstance();

    private static Tafqeet instance;

    private Tafqeet() {
    }

    public static synchronized Tafqeet getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String doTafqeet(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String doTafqeet(byte number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String doTafqeet(short number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String doTafqeet(long number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String doTafqeet(BigInteger number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String doTafqeet(BigDecimal number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
