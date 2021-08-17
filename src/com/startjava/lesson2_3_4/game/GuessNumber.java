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
        int p1NumOfTry = 0;
        int p2NumOfTry = 0;
        System.out.println("Загаданное число - " + secretNum);

        while(true) {
            System.out.println(p1.getName() + " введите число");
            p1.getNums()[p1NumOfTry] = scan.nextInt();
            if(p1.getNums()[p1NumOfTry] == secretNum) {
                System.out.println("Игрок " + p1.getName() + " угадал загаданное число - " + secretNum + " с " + (p1NumOfTry + 1) + " попытки!");
                int[] nums1 = Arrays.copyOfRange(p1.getNums(), 0, p1NumOfTry);
                for (int j : nums1) {
                    System.out.print(j + " ");
                }
                System.out.println(" - введённые первым игроком числа");

                int[] nums2 = Arrays.copyOfRange(p2.getNums(), 0, p2NumOfTry);
                for (int j : nums2) {
                    System.out.print(j + " ");
                }
                System.out.println(" - введённые вторым игроком числа");
                p1.clear();
                p2.clear();
                break;
            } else if(p1.getNums()[p1NumOfTry] > secretNum ) {
                System.out.println(p1.getName() + ", ваше число больше.");
            } else if(p1.getNums()[p1NumOfTry] < secretNum) {
                System.out.println(p1.getName() + ", ваше число меньше.");
            }
            p1NumOfTry++;


            System.out.println(p2.getName() + " введите число");
            p2.getNums()[p2NumOfTry] = scan.nextInt();
            if(p2.getNums()[p2NumOfTry] == secretNum) {
                System.out.println("Игрок " + p2.getName() + " угадал загаданное число - " + secretNum + " с " + (p2NumOfTry + 1) + " попытки!");
                int[] nums1 = Arrays.copyOfRange(p1.getNums(), 0, p1NumOfTry);
                for (int k : nums1) {
                    System.out.print(k + " ");
                }
                System.out.println(" - введённые первым игроком числа");

                int[] nums2 = Arrays.copyOfRange(p2.getNums(), 0, p2NumOfTry);
                for (int j : nums2) {
                    System.out.print(j + " ");
                }
                System.out.println(" - введённые вторым игроком числа");

                break;
            } else if(p2.getNums()[p2NumOfTry] > secretNum) {
                System.out.println(p2.getName() + ", ваше число больше.");
            } else if(p2.getNums()[p2NumOfTry] < secretNum) {
                System.out.println(p2.getName() + ", ваше число меньше.");
            }
            p2NumOfTry++;

            if(p1NumOfTry == p1.getNums().length) {
                System.out.println("У игрока" + p1.getName() +" закончились попытки");
            } if(p2NumOfTry == p2.getNums().length) {
                System.out.println("У игрока" + p2.getName() +" закончились попытки");
                p1.tryEnd();
                p2.tryEnd();
                break;
            }
        }
    }
}