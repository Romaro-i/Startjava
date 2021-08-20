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

        int secretNum = (int) (Math.random() * 101);
        System.out.println("Загаданное число - " + secretNum);

        while(true) {
            p1.enterNum();
            if(p1.getNums()[p1.numOfTry] == secretNum) {
                System.out.println("Игрок " + p1.getName() + " угадал загаданное число - " + secretNum + " с " + (p1.numOfTry + 1) + " попытки!");
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
                break;
            } else if(p1.getNums()[p1.numOfTry] > secretNum ) {
                System.out.println(p1.getName() + ", ваше число больше.");
            } else if(p1.getNums()[p1.numOfTry] < secretNum) {
                System.out.println(p1.getName() + ", ваше число меньше.");
            }
            p1.numOfTry++;


            p2.enterNum();
            if(p2.getNums()[p2.numOfTry] == secretNum) {
                System.out.println("Игрок " + p2.getName() + " угадал загаданное число - " + secretNum + " с " + (p2.numOfTry + 1) + " попытки!");
                int[] nums1 = Arrays.copyOfRange(p1.getNums(), 0, p1.numOfTry);
                for (int k : nums1) {
                    System.out.print(k + " ");
                }
                System.out.println(" - введённые первым игроком числа");

                int[] nums2 = Arrays.copyOfRange(p2.getNums(), 0, p2.numOfTry);
                for (int j : nums2) {
                    System.out.print(j + " ");
                }
                System.out.println(" - введённые вторым игроком числа");
                p1.clear();
                p2.clear();
                break;
            } else if(p2.getNums()[p2.numOfTry] > secretNum) {
                System.out.println(p2.getName() + ", ваше число больше.");
            } else if(p2.getNums()[p2.numOfTry] < secretNum) {
                System.out.println(p2.getName() + ", ваше число меньше.");
            }
            p2.numOfTry++;

            if(p1.numOfTry == p1.getNums().length) {
                System.out.println("У игрока " + p1.getName() +" закончились попытки");
            } if(p2.numOfTry == p2.getNums().length) {
                System.out.println("У игрока " + p2.getName() +" закончились попытки");
                for(int i = 0; i < p1.getNums().length; i++) {
                    System.out.print(p1.getNums()[i] + " ");
                }
                System.out.println(" - введённые числа игроком по имени " + p1.getName());
                for(int i = 0; i < p2.getNums().length; i++) {
                    System.out.print(p2.getNums()[i] + " ");
                }
                System.out.println(" - введённые числа игроком по имени " + p2.getName());
                p1.clear();
                p2.clear();
                break;
            }
        }
    }
}