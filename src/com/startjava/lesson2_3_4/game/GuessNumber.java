package com.startjava.lesson2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 101);
        int numOfTry = 0;
        System.out.println("Загаданное число - " + secretNum);

        while(true) {
            System.out.println(p1.getName() + " введите число.");
            p1.setNum(scan.nextInt());

            if(p1.getNum() == secretNum) {
                System.out.println("Игрок " + p1.getName() + " угадал загаданное число - " + secretNum + " с " + (numOfTry + 1) + " попытки!");
                int[] nums1 = Arrays.copyOfRange(p1.nums, 0, numOfTry);
                for (int j : nums1) {
                    System.out.print(j + " ");
                }
                System.out.println(" - введённые первым игроком числа");

                int[] nums2 = Arrays.copyOfRange(p2.nums, 0, numOfTry);
                for (int j : nums2) {
                    System.out.print(j + " ");
                }
                System.out.println(" - введённые вторым игроком числа");
                p1.clear();
                p2.clear();
                break;
            } else if(p1.getNum() > secretNum ) {
                System.out.println(p1.getName() + ", ваше число больше.");
            } else if(p1.getNum() < secretNum) {
                System.out.println(p1.getName() + ", ваше число меньше.");
            }
            p1.nums[numOfTry] = p1.getNum();

            System.out.println(p2.getName() + " введите число.");
            p2.setNum(scan.nextInt());
            if(p2.getNum() == secretNum) {
                System.out.println("Игрок " + p2.getName() + " угадал загаданное число - " + secretNum + " с " + (numOfTry + 1) + " попытки!");
                int[] nums1 = Arrays.copyOfRange(p1.nums, 0, numOfTry);
                for (int k : nums1) {
                    System.out.print(k + " ");
                }
                System.out.println(" - введённые первым игроком числа");

                int[] nums2 = Arrays.copyOfRange(p2.nums, 0, numOfTry);
                for (int j : nums2) {
                    System.out.print(j + " ");
                }
                System.out.println(" - введённые вторым игроком числа");
                p1.clear();
                p2.clear();
                break;
            } else if(p2.getNum() > secretNum) {
                System.out.println(p2.getName() + ", ваше число больше.");
            } else if(p2.getNum() < secretNum) {
                System.out.println(p2.getName() + ", ваше число меньше.");
            }
            p2.nums[numOfTry] = p2.getNum();

            numOfTry++;

            if(numOfTry == p1.nums.length) {
                System.out.println("У игроков закончились попытки");
                p1.tryEnd();
                p2.tryEnd();
                break;
            }
        }
    }
}