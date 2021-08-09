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
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[2]);
            String s = nums[1];
            char sign = s.charAt(0);


            Calculator calculator = new Calculator();
            calculator.calculate(num1, sign, num2);

            do {
                System.out.println("Вы хотите продолжить? [y/n]");
                repeat = scan.next();
            } while (!"y".equalsIgnoreCase(repeat) && !"n".equalsIgnoreCase(repeat));
        }
    }
}