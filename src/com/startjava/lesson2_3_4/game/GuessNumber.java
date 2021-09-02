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
        System.out.println("У каждого из игроков всего " + p1.getNums().length + " попыток, чтобы угадать загаданное число!!!");
        System.out.println("Загаданное число - " + secretNum);
        System.out.println("Mortal Kombat is begin!!! FIGHT!!!");

        while(true) {
            enterNum(p1);
            if (checkNum(p1, secretNum)) {
                break;
            }

            enterNum(p2);
            if (checkNum(p2, secretNum)) {
                break;
            }
            if (p1.getNumOfTry() == p1.getNums().length || p2.getNumOfTry() == p2.getNums().length) {
                tryesEnd(secretNum);
                break;
            }

        }
    }

    private void enterNum(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.println(player.getName() + " введите число");
        player.getNums()[player.getNumOfTry()] = scan.nextInt();
    }

    private boolean checkNum(Player player, int secretNum) {
        if(player.getNums()[player.getNumOfTry()] == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал загаданное число с " + (player.getNumOfTry() + 1) + " попытки!");
            showEnteredNumbers(p1);
            showEnteredNumbers(p2);
            p1.clear();
            p2.clear();
            return true;
        } else if(player.getNums()[player.getNumOfTry()] < secretNum) {
            System.out.println(player.getName() + ", ваше число меньше.");
        } else if (player.getNums()[player.getNumOfTry()] > secretNum) {
            System.out.println(player.getName() + ", ваше число больше.");
        }
        player.setNumOfTry(player.getNumOfTry() + 1);
        return false;
    }

    private void showEnteredNumbers(Player player) {
        System.out.println("Ведённые игроком " + player.getName() + " числа");
        int[] nums1 = Arrays.copyOfRange(player.getNums(), 0, player.getNumOfTry());
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }

    private void tryesEnd(int secretNum) {
        System.out.println("У игроков закончились попытки!");
        showEnteredNumbers(p1);
        showEnteredNumbers(p2);
        System.out.println("Число, которое надо было угадать - " + secretNum);
        p1.clear();
        p2.clear();
    }
}