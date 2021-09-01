package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

import java.util.Scanner;

public class GuessNumber {
    private final Player p1;
    private final Player p2;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void play() {
        int secretNum = (int) (Math.random() * 101);
        System.out.println("Загаданное число - " + secretNum);

        while(true) {
            enterNum(p1.getName(), p1.getNums(), p1.numOfTry);
            checkNum(p1.getName(), p1.getNums(), p1.numOfTry, secretNum);
            p1.numOfTry++;
            enterNum(p2.getName(), p2.getNums(), p2.numOfTry);
            checkNum(p2.getName(), p2.getNums(), p2.numOfTry, secretNum);
            p2.numOfTry++;
        }
    }

    private void enterNum(String name, int[] nums, int numOfTry) {
        Scanner scan = new Scanner(System.in);
        System.out.println(name + " введите число");
        nums[numOfTry] = scan.nextInt();
    }

    private boolean checkNum(String name, int[] nums, int numOfTry, int secretNum) {
        boolean isRight = true;
        if(nums[numOfTry] == secretNum) {
            System.out.println("Игрок " + name + " угадал загаданное число с " + (numOfTry + 1) + " попытки!");
            showEnterNumbers(p1.getName(), p1.getNums(), p1.numOfTry);
            showEnterNumbers(p2.getName(), p2.getNums(), p2.numOfTry);
            p1.clear();
            p2.clear();
            return !isRight;
        } else if(nums[numOfTry] < secretNum) {
            System.out.println(name + ", ваше число меньше.");
        } else if (nums[numOfTry] > secretNum) {
            System.out.println(name + ", ваше число больше.");
        }
        return isRight;
    }

    private void showEnterNumbers(String name, int[] nums, int numOfTry) {
        int[] nums1 = Arrays.copyOfRange(nums, 0, numOfTry);
        for (int j : nums1) {
            System.out.print(j + " ");
        }
        System.out.println(" - введённые игроком " + name + " числа");
    }
}