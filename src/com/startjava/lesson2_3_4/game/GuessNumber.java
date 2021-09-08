package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private final Player p1;
    private final Player p2;
    private int secretNum;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void play() {
        secretNum = (int) (Math.random() * 101);
        System.out.println("У каждого из игроков всего " + p1.getNumOfAttempts() + " попыток, чтобы угадать загаданное число!!!");
        System.out.println("Загаданное число - " + secretNum);
        System.out.println("Mortal Kombat is begin!!! FIGHT!!!");

        do {
            enterNum(p1);
            if (checkNum(p1)) {
                break;

            }

            enterNum(p2);
            if (checkNum(p2)) {
                break;
            }
        } while (tryesEnd());
        showEnteredNumbers(p1);
        showEnteredNumbers(p2);
        p1.clear();
        p2.clear();
    }

    private void enterNum(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.println(player.getName() + " введите число");
        player.setNum(scan.nextInt());
        player.setNumOfTry(player.getNumOfTry() + 1);
    }

    private boolean checkNum(Player player) {
        if(player.getLastNum() == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал загаданное число с " + (player.getNumOfTry()) + " попытки!");
            return true;
        } else if (player.getLastNum() < secretNum) {
            System.out.println(player.getName() + ", ваше число меньше.");
        } else if (player.getLastNum() > secretNum) {
            System.out.println(player.getName() + ", ваше число больше.");
        }
        return false;
    }

    private void showEnteredNumbers(Player player) {
        System.out.println("Ведённые игроком " + player.getName() + " числа");
        for (int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }

    private boolean tryesEnd() {
        if (p2.getNumOfTry() < p1.getNumOfAttempts()) {
            return true;
        } if (p2.getNumOfTry() == p1.getNumOfAttempts()) {
            System.out.println("У игроков закончились попытки!");
            System.out.println("Число, которое надо было угадать - " + secretNum);
        } return false;
    }
}