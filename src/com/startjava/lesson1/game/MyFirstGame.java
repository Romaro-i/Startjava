package com.startjava.lesson1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int playerNum = 8;
        int secretNumber = 10;

        for(int i = 0; i <= 100; i++) {
            if (playerNum < 0 || playerNum > 100) {
                System.out.println("Введено не коректное число!");
                break;
            } else if(playerNum > secretNumber) {
                System.out.println("Даное число больше, того что загадал компьютер.");
                playerNum--;
            } else if (playerNum < secretNumber) {
                System.out.println("Данное число меньше, того что загадал компьютер.");
                playerNum++;
            } else {
                System.out.println("Поздравляю число угадано!!! Это число " + secretNumber + "!");
                break;
            }
        }
    }
}