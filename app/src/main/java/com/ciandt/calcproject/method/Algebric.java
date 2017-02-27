package com.ciandt.calcproject.method;

public class Algebric {

    private String operation;
    private double number1;
    private double number2;

    public double operationBetween2Numbers(){

        switch (operation){

            case "/": return number1 / number2;

            case "*": return number1 * number2;

            case "+": return  number1 + number2;

            case "-": return number1 - number2;
        }

        return 0;
    }

    public String expressionCalculation(String expresion){

            double result;
            number1 = Double.parseDouble(String.valueOf(expresion.charAt(0)));
            operation = String.valueOf(expresion.charAt(1));
            number2 = Double.parseDouble(String.valueOf(expresion.charAt(2)));

            result = operationBetween2Numbers();

        return String.valueOf(result);
    }

}
