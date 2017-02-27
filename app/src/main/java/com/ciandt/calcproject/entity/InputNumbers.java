package com.ciandt.calcproject.entity;


public class InputNumbers {

    private double number1;
    private double number2;



    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void saveNumber(double number){
        if(number1 == 0.0)
            number1 = number;

        number2 = number;
    }
}
