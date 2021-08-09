package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String repeat = "y";

        while ("y".equalsIgnoreCase(repeat)) {
            System.out.println("Введите математическое выражение: ");
            String value = scan.nextLine();
            String[] nums = value.split(" ");


            Calculator calculator = new Calculator();
            calculator.calculate(nums);

            do {
                System.out.println("Вы хотите продолжить? [y/n]");
                repeat = scan.next();
            } while (!"y".equalsIgnoreCase(repeat) && !"n".equalsIgnoreCase(repeat));
        }
    }
}