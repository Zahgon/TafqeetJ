package io.github.osamabmaq.tafqeetj.converters.positive;

import io.github.osamabmaq.tafqeetj.converters.BasicNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.converters.QuantitiveNumberConverter;
import io.github.osamabmaq.tafqeetj.converters.QuantitiveNumberConverterFactory;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;
import io.github.osamabmaq.tafqeetj.numbers.positive.PositiveQuantitiveNumberNamesFactory;
import java.util.Map;

public class PositiveQuantitiveNumberConvertersFactory implements QuantitiveNumberConverterFactory {

    private final Map<String, QuantitiveNumberConverter> positiveConvertersMap;

    private static PositiveQuantitiveNumberConvertersFactory instance;

    private PositiveQuantitiveNumberConvertersFactory() {
        PositiveQuantitiveNumberNamesFactory positivesFactory = PositiveQuantitiveNumberNamesFactory.getInstance();
        positiveConvertersMap = Map.ofEntries(Map.entry("thousands", createQuantitiveConverter(positivesFactory.getThousands())), Map.entry("millions", createQuantitiveConverter(positivesFactory.getMillions())), Map.entry("billions", createQuantitiveConverter(positivesFactory.getBillions())), Map.entry("trillions", createQuantitiveConverter(positivesFactory.getTrillions())));
    }

    public synchronized static PositiveQuantitiveNumberConvertersFactory getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public QuantitiveNumberConverter getConverter(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private QuantitiveNumberConverter createQuantitiveConverter(QuantitiveNumberNames names) {
        return new QuantitiveNumberConverter(names, BasicNumberConverterFactory.getPositiveConverter());
    }
}
