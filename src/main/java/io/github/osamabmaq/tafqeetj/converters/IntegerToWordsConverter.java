package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.exceptions.NumberOutOfRangeException;
import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;
import io.github.osamabmaq.tafqeetj.numbers.NumberSign;
import java.math.BigInteger;
import java.util.Map;

class IntegerToWordsConverter {

    private final NumberToThreeDigitsNumberGroupsDivider divider = new NumberToThreeDigitsNumberGroupsDivider();

    private static IntegerToWordsConverter instance;

    private IntegerToWordsConverter() {
    }

    public synchronized static IntegerToWordsConverter getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IntegerInWords convert(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IntegerInWords convert(byte number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IntegerInWords convert(short number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IntegerInWords convert(BigInteger number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public IntegerInWords convert(long number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private IntegerInWords convertNumber(Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        IntegerInWords integerInWords = new IntegerInWords();
        integerInWords.setTrillions(convertThreeDigitsNumberIfPresent("trillions", threeDigitsNumberMap));
        integerInWords.setBillions(convertThreeDigitsNumberIfPresent("billions", threeDigitsNumberMap));
        integerInWords.setMillions(convertThreeDigitsNumberIfPresent("millions", threeDigitsNumberMap));
        integerInWords.setThousands(convertThreeDigitsNumberIfPresent("thousands", threeDigitsNumberMap));
        integerInWords.setBasicNumberGroup(convertBasicNumberIfPresent(threeDigitsNumberMap));
        return integerInWords;
    }

    private String convertBasicNumberIfPresent(Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        if (threeDigitsNumberMap.containsKey("basicNumberGroup")) {
            ThreeDigitsNumber number = threeDigitsNumberMap.get("basicNumberGroup");
            return number.getSign().getBasicNumberConverter().convert(number);
        }
        return "";
    }

    private String convertThreeDigitsNumberIfPresent(String numberGroupName, Map<String, ThreeDigitsNumber> threeDigitsNumberMap) {
        if (threeDigitsNumberMap.containsKey(numberGroupName)) {
            ThreeDigitsNumber number = threeDigitsNumberMap.get(numberGroupName);
            return number.getSign().getQuantitiveNumberConverterFactory().getConverter(numberGroupName).convert(number);
        }
        return "";
    }
}
