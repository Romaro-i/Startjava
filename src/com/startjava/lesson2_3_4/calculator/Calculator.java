package com.startjava.lesson2_3_4.calculator;

public class Calculator {
    public void calculate(String value) {

        String[] mathExpression = value.split(" ");
        int num1 = Integer.parseInt(mathExpression[0]);
        int num2 = Integer.parseInt(mathExpression[2]);
        char sign = mathExpression[1].charAt(0);
        switch (sign) {
            case '+':
                System.out.println("Результат сложения: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Результат вычитания: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Результат умножения: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Результат деления: " + (num1 / num2));
                break;
            case '^':
                double result = Math.pow(num1, num2);
                System.out.println("Результат возведения в степень: " + result);
                break;
        }
    }
}