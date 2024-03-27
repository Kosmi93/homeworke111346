package bip.online.homeworke.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceParametrizedTest {
    private final static Integer num1 = 5;
    private final static Integer num2 = 2;

    private final CalculatorService out = new CalculatorService();

    public static Stream<Arguments> calculatorParamsForTestPlus(){
        return Stream.of(Arguments.of(num1,num2));

    }

    @ParameterizedTest
    @MethodSource("calculatorParamsForTestPlus")
    void plus(Integer num1,Integer num2) {
        assertEquals(num1+num2, out.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("calculatorParamsForTestPlus")
    void minus(Integer num1,Integer num2) {
        assertEquals(num1-num2, out.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("calculatorParamsForTestPlus")
    void multiply(Integer num1,Integer num2) {
        assertEquals(num1*num2, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("calculatorParamsForTestPlus")
    void divide(Integer num1,Integer num2) {
        assertEquals(num1/num2, out.divide(num1, num2));
    }

    @Test
    void plusExceptionDivByZero() {
        assertThrows(IllegalArgumentException.class,()->out.divide(num1, 0));
    }

}
