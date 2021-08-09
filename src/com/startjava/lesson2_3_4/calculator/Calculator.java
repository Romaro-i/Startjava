package com.startjava.lesson2_3_4.calculator;

public class Calculator {
    public int calculate(String[] nums) {
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[2]);
        String s = nums[1];
        char sign = s.charAt(0);
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
        return 0;
    }
}