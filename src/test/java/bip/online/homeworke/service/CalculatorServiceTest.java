package bip.online.homeworke.service;

import bip.online.homeworke.exception.ParamException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {
    private final Integer num1 = 5;
    private final Integer num2 = 2;
    private final Integer numNull = null;

    private final CalculatorService out = new CalculatorService();

    @Test
    void plus() {
        assertEquals(num1+num2, out.plus(num1, num2));
    }

    @Test
    void plusExceptionParam() {
        assertThrows(ParamException.class,()->out.plus(num1, numNull));
    }

    @Test
    void minus() {
        assertEquals(num1-num2, out.minus(num1, num2));
    }

    @Test
    void minusExceptionParam() {
        assertThrows(ParamException.class,()->out.minus(num1, numNull));
    }

    @Test
    void multiply() {
        assertEquals(num1*num2, out.multiply(num1, num2));
    }

    @Test
    void multiplyExceptionParam() {
        assertThrows(ParamException.class,()->out.multiply(num1, numNull));
    }

    @Test
    void divide() {
        assertEquals(num1/num2, out.divide(num1, num2));
    }

    @Test
    void divideExceptionParam() {
        assertThrows(ParamException.class,()->out.divide(num1, numNull));
    }

    @Test
    void plusExceptionDivByZero() {
        assertThrows(IllegalArgumentException.class,()->out.divide(num1, 0));
    }

}