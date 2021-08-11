package com.startjava.lesson2_3_4.calculator;

public class Calculator {
    int result;

    public int calculate(String mathExpression) {
        String[] splitExpression = mathExpression.split(" ");
        int num1 = Integer.parseInt(splitExpression[0]);
        int num2 = Integer.parseInt(splitExpression[2]);
        char sign = splitExpression[1].charAt(0);
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return  num1 / num2;
            case '^':
                return (int) Math.pow(num1, num2);
        }
        return result;
    }
}