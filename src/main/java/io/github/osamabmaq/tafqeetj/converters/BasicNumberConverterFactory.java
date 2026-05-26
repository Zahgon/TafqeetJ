package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.negative.NegativeBasicNumberPlacesNames;
import io.github.osamabmaq.tafqeetj.numbers.positive.PositiveBasicNumbersPLacesNames;

public class BasicNumberConverterFactory {

    private static final BasicNumberConverter positiveConverter = new BasicNumberConverter(PositiveBasicNumbersPLacesNames.getInstance());

    private static final BasicNumberConverter negativeConverter = new BasicNumberConverter(NegativeBasicNumberPlacesNames.getInstance());

    private BasicNumberConverterFactory() {
    }

    public static BasicNumberConverter getPositiveConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static BasicNumberConverter getNegativeConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
