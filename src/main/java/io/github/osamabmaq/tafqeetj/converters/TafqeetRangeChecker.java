package io.github.osamabmaq.tafqeetj.converters;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TafqeetRangeChecker {

    public static final long INT_PRIMITIVES_MIN_SUPPORTED_VALUE = -999_999_999_999_999L;

    public static final long INT_PRIMITIVES_MAX_SUPPORTED_VALUE = 999_999_999_999_999L;

    public static final BigInteger BI_MIN_ACCEPTED_VALUE = BigInteger.valueOf(INT_PRIMITIVES_MIN_SUPPORTED_VALUE);

    public static final BigInteger BI_MAX_ACCEPTED_VALUE = BigInteger.valueOf(INT_PRIMITIVES_MAX_SUPPORTED_VALUE);

    public static final int MAX_NUM_OF_DIGITS_LEFT_DECIMAL_POINT = 15;

    public static final int MAX_NUM_OF_DIGITS_RIGHT_DECIMAL_POINT = 15;

    private TafqeetRangeChecker() {
    }

    public static boolean isOutOfRange(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isOutOfRange(byte number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isOutOfRange(short number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isOutOfRange(long number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isOutOfRange(BigInteger number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isOutOfRange(BigDecimal number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String removeTrailingZeroes(String number) {
        int end = number.length();
        for (int i = number.length() - 1; i > 0; i--) if (number.charAt(i) == '0')
            end = i;
        else
            break;
        return number.substring(0, end);
    }
}
