package bip.online.homeworke.controller;

import bip.online.homeworke.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorService service;

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1,  @RequestParam(required = false) Integer num2) {
        try {
            int result = service.plus(num1, num2);
            return num1 + " + " + num2 + " = " + result;
        } catch (RuntimeException e){
            return e.getMessage();
        }
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        try {
            int result = service.minus(num1, num2);
            return num1 + " - " + num2 + " = " + result;
        } catch (RuntimeException e){
            return e.getMessage();
        }
    }

    @GetMapping("/multiply")
    public String multiply(Integer num1, Integer num2) {
        try {
            int result = service.multiply(num1, num2);
            return num1 + " *" + num2 + " = " + result;
        } catch (RuntimeException e){
            return e.getMessage();
        }
    }

    @GetMapping("/divide")
    public String divide(Integer num1, Integer num2) {
        try {
            int result = service.divide(num1, num2);
            return num1 + " / " + num2 + " = " + result;
        } catch (RuntimeException e){
            return e.getMessage();
        }
    }
}
