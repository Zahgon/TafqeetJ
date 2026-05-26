package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.BasicNumberPlacesNames;
import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;

public class BasicNumberConverter {

    private final BasicNumberPlacesNames basicNumberPlacesNames;

    public BasicNumberConverter(BasicNumberPlacesNames basicNumberPlacesNames) {
        this.basicNumberPlacesNames = basicNumberPlacesNames;
    }

    public String convert(ThreeDigitsNumber number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String convertOnes(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String convertComposedNumbers(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String convertTens(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String convertHundreds(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
