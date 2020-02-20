package com.xinchenh.junit;

public class Calculator {
    CalculatorService service;

    public Calculator(CalculatorService service){
        this.service = service;
    }

    public int perform(int i, int j){ //(i + j) * 2
        return service.add(i, j) * 2;
    }

    public int hardCodedPerform(int i, int j) {
        return (i + j) * 2;
    }
}
