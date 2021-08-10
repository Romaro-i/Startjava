package com.startjava.lesson2_3_4.calculator;

public class Calculator {
    int result;
    public int calculate(String value) {

        String[] mathExpression = value.split(" ");
        int num1 = Integer.parseInt(mathExpression[0]);
        int num2 = Integer.parseInt(mathExpression[2]);
        char sign = mathExpression[1].charAt(0);
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = (int) Math.pow(num1, num2);
                break;
        }
        return result;
    }
}