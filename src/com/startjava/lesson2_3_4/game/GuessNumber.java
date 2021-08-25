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
            checkNum(p1.getName(), p1.getNums(), p1.numOfTry, secretNum);
            checkNum(p2.getName(), p2.getNums(), p2.numOfTry, secretNum);
            }
    }


    private int enterNum(String name) {
        Scanner scan = new Scanner(System.in);
        System.out.println(name + " введите число");
        return scan.nextInt();
    }

    private int checkNum(String name, int[] nums, int numOfTry, int secretNum) {
        nums[numOfTry] = enterNum(name);
        if(nums[numOfTry] == secretNum) {
            System.out.println("Игрок " + name + " угадал загаданное число с " + (numOfTry + 1) + " попытки!");
            int[] nums1 = Arrays.copyOfRange(p1.getNums(), 0, p1.numOfTry);
            for (int j : nums1) {
                System.out.print(j + " ");
            }
            System.out.println(" - введённые первым игроком числа");
            int[] nums2 = Arrays.copyOfRange(p2.getNums(), 0, p2.numOfTry);
            for (int j : nums2) {
                System.out.print(j + " ");
            }
            System.out.println(" - введённые вторым игроком числа");
            p1.clear();
            p2.clear();
            return nums[numOfTry];
        } else if(nums[numOfTry] < secretNum) {
            System.out.println(name + ", ваше число меньше.");
        } else if (nums[numOfTry] > secretNum) {
            System.out.println(name + ", ваше число больше.");
        }
        numOfTry++;

        if(nums[numOfTry] == nums.length) {
            System.out.println("У игрока " + name +" закончились попытки");
            for(int i = 0; i < p1.getNums().length; i++) {
                System.out.print(p1.getNums()[i] + " ");
            }
            System.out.println(" - введённые игроком " + name + "числа");
        }
        return nums[numOfTry];
    }
}