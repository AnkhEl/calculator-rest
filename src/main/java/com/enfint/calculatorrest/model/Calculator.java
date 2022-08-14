package com.enfint.calculatorrest.model;


import org.jetbrains.annotations.NotNull;
import org.springframework.lang.NonNull;

public class Calculator {
    @NonNull
    private double firstNum;
    @NonNull
    private double secondNum;

    public double getFirstNum(){
        return this.firstNum;
    }
    public void setFirstNum(double firstNum){
         this.firstNum = firstNum;
    }
    public double getSecondNum(){
        return this.secondNum;
    }
    public void setSecondNum(double secondNum){
        this.secondNum = secondNum;
    }

}
