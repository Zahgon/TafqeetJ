package io.github.osamabmaq.tafqeetj.converters.negative;

import io.github.osamabmaq.tafqeetj.converters.QuantitiveNumberConverter;
import io.github.osamabmaq.tafqeetj.converters.QuantitiveNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNamesFactory;
import io.github.osamabmaq.tafqeetj.numbers.negative.NegativeQuantitiveNumberNamesFactory;
import io.github.osamabmaq.tafqeetj.converters.BasicNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;
import java.util.Map;

public class NegativeQuantitiveNumberConvertersFactory implements QuantitiveNumberConverterFactory {

    private final Map<String, QuantitiveNumberConverter> negativeConvertersMap;

    private static NegativeQuantitiveNumberConvertersFactory instance;

    private NegativeQuantitiveNumberConvertersFactory() {
        QuantitiveNumberNamesFactory negativesFactory = NegativeQuantitiveNumberNamesFactory.getInstance();
        negativeConvertersMap = Map.ofEntries(Map.entry("thousands", createQuantitiveConverter(negativesFactory.getThousands())), Map.entry("millions", createQuantitiveConverter(negativesFactory.getMillions())), Map.entry("billions", createQuantitiveConverter(negativesFactory.getBillions())), Map.entry("trillions", createQuantitiveConverter(negativesFactory.getTrillions())));
    }

    public synchronized static NegativeQuantitiveNumberConvertersFactory getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public QuantitiveNumberConverter getConverter(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private QuantitiveNumberConverter createQuantitiveConverter(QuantitiveNumberNames names) {
        return new QuantitiveNumberConverter(names, BasicNumberConverterFactory.getNegativeConverter());
    }
}
