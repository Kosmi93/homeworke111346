package bip.online.homeworke.service;

import bip.online.homeworke.exception.ParamException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(Integer num1, Integer num2) {
        extracted(num1, num2);
        return num1 + num2;
    }

    public int minus(Integer num1, Integer num2) {
        extracted(num1, num2);
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) {
        extracted(num1, num2);
        return num1 * num2;
    }

    public int divide(Integer num1, Integer num2) {
        extracted(num1, num2);
        if(num2 == 0)
            throw new IllegalArgumentException("Деление на ноль запрещено");
        return num1 / num2;
    }

    private void extracted(Integer num1, Integer num2) {
        if(num1 ==null || num2 == null)
            throw new ParamException("Необходимо указать два параметра num1 и mum2.");
    }


}
