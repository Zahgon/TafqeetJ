package io.github.osamabmaq.tafqeetj.converters;

import io.github.osamabmaq.tafqeetj.numbers.NumberSign;
import io.github.osamabmaq.tafqeetj.numbers.QuantitiveNumberNames;
import io.github.osamabmaq.tafqeetj.numbers.ThreeDigitsNumber;

public class QuantitiveNumberConverter {

    private final QuantitiveNumberNames quantitiveNumberNames;

    private final BasicNumberConverter basicNumberConverter;

    public QuantitiveNumberConverter(QuantitiveNumberNames quantitiveNumberNames, BasicNumberConverter basicNumberConverter) {
        this.quantitiveNumberNames = quantitiveNumberNames;
        this.basicNumberConverter = basicNumberConverter;
    }

    public String convert(ThreeDigitsNumber number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getTwoHundredsWordDependingOnNumberSign(NumberSign sign) {
        if (sign == NumberSign.POSITIVE)
            return "مئتا";
        return "مئتي";
    }

    private String convertNumberBetweenZeroAndTwo(StringBuilder numberInWords, int number) {
        if (numberInWords.length() != 0)
            //هذا للمئات، من مثل مئة ألف أو تسعمئة مليون
            numberInWords.append(" ").append(quantitiveNumberNames.getNameWhenEqualsOne());
        if (number != 0 && numberInWords.length() != 0)
            numberInWords.append(" و");
        if (number == 1)
            numberInWords.append(quantitiveNumberNames.getNameWhenEqualsOne());
        else if (number == 2)
            numberInWords.append(quantitiveNumberNames.getNameWhenEqualsTwo());
        return numberInWords.toString();
    }

    private String convertNumberBetweenThreeAndNinetyNine(ThreeDigitsNumber number) {
        ThreeDigitsNumberDisassembler disassembler = new ThreeDigitsNumberDisassembler(number);
        if (number.getNumber() < 10)
            return convertOnes(disassembler.getOnes());
        else if (number.getNumber() > 10 && number.getNumber() < 20)
            return convertComposedNumber(disassembler.getComposedNumber());
        else
            return convertTensWithOnes(disassembler);
    }

    private String convertOnes(int ones) {
        return basicNumberConverter.convertOnes(ones) + " " + quantitiveNumberNames.getNameWhenBetweenThreeAndTen();
    }

    private String convertComposedNumber(int composedNumber) {
        return basicNumberConverter.convertComposedNumbers(composedNumber) + " " + quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine();
    }

    private String convertTensWithOnes(ThreeDigitsNumberDisassembler disassembler) {
        if (disassembler.getThreeDigitsNumber().getNumber() == 10)
            return convertTen();
        StringBuilder numberInWords = new StringBuilder();
        if (disassembler.getThreeDigitsNumber().containsOnes())
            numberInWords.append(basicNumberConverter.convertOnes(disassembler.getOnes())).append(" و").append(basicNumberConverter.convertTens(disassembler.getTens()));
        else
            numberInWords.append(basicNumberConverter.convertTens(disassembler.getTens()));
        return numberInWords.append(" ").append(quantitiveNumberNames.getNameWhenBetweenElevenAndNinetyNine()).toString();
    }

    private String convertTen() {
        return basicNumberConverter.convertTens(10) + " " + quantitiveNumberNames.getNameWhenBetweenThreeAndTen();
    }
}
