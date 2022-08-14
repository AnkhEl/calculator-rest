package com.enfint.calculatorrest.controller;


import com.enfint.calculatorrest.model.Calculator;
import com.enfint.calculatorrest.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("api/v1/calculator")
public class CalculatorController {


    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("sum")
    public double add(@RequestBody Calculator calculator){

        return this.calculatorService.add(calculator);
    }
    @GetMapping("subtraction")
    public double subtract(@RequestBody Calculator calculator){

        return this.calculatorService.subtract(calculator);
    }

    @GetMapping("division")
    public double divide(@RequestBody Calculator calculator){
        if(calculator.getSecondNum() != 0){
            return this.calculatorService.divide(calculator);
        }
        else{
            throw new RuntimeException("Division by zero is not legal");
        }

    }

    @GetMapping("multiplication")
    public double multiply(@RequestBody Calculator calculator){

        return this.calculatorService.multiply(calculator);
    }

}
