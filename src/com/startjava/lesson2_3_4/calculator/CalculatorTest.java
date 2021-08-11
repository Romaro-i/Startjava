package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String repeat = "y";
        while ("y".equalsIgnoreCase(repeat)) {
            System.out.println("Введите математическое выражение: ");

            Calculator calculator = new Calculator();
            int result = calculator.calculate(scan.nextLine());
            System.out.println(result);

            do {
                System.out.println("Вы хотите продолжить? [y/n]");
                repeat = scan.nextLine();
            } while (!"y".equalsIgnoreCase(repeat) && !"n".equalsIgnoreCase(repeat));
        }
    }
}