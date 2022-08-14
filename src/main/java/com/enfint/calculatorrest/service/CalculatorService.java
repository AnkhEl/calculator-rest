package com.enfint.calculatorrest.service;

import com.enfint.calculatorrest.model.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(Calculator calculator){
        return calculator.getFirstNum()+calculator.getSecondNum();
    }
    public double subtract(Calculator calculator){
        return calculator.getFirstNum()-calculator.getSecondNum();
    }
    public double divide(Calculator calculator){
        return calculator.getFirstNum()/calculator.getSecondNum();
    }
    public double multiply(Calculator calculator){
        return calculator.getFirstNum()*calculator.getSecondNum();
    }
}
