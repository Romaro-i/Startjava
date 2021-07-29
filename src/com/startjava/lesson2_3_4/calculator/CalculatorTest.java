package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String repeat = "y";

         while("y".equalsIgnoreCase(repeat)) {
            System.out.println("Введите первое число: ");
            int num1 = scan.nextInt();

            System.out.println("Введите математическое выражение: ");
            char sign = scan.next().charAt(0);

            System.out.println("Введите второе число: ");
            int num2 = scan.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(num1, sign, num2);

            do {
                System.out.println("Вы хотите продолжить? [y/n]");
                repeat = scan.next();
            } while(!"y".equalsIgnoreCase(repeat) && !"n".equalsIgnoreCase(repeat));
        }
    }
}