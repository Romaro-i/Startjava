package com.startjava.lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;
        char sign = '^';

        if(sign == '+') {
            System.out.println(num1 + num2);
        } else if(sign == '-') {
            System.out.println(num1 - num2);
        } else if(sign == '*') {
            System.out.println(num1 * num2);
        } else if(sign == '/') {
            System.out.println(num1 / num2);
        } else if(sign == '%') {
            System.out.println(num1 % num2);
        } else if (sign == '^') {
            int result = 1;
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        }
    }
}