package com.startjava.lesson2_3_4.calculator;

public class Calculator {
    public int calculate(int num1, char sign, int num2) {
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
                int result = 1;
                for(int i = 0; i < num2; i++) {
                    result *= num1;
                }
                System.out.println("Результат возведения в степень: " + result);
                break;
        }
        return 0;
    }
}