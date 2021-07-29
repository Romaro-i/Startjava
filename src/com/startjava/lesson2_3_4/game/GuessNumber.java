package com.startjava.lesson2_3_4.game;

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
        System.out.println("Загаданное число - " + secretNum);

        while(true) {
            System.out.println(p1.getName() + " введите число.");
            p1.setNum(scan.nextInt());
            if(p1.getNum() == secretNum) {
                System.out.println(p1.getName() + " WINS!!! Flawless Victory! " + p2.getName() + ", your soul is MINE!!!!");
                break;
            } else if(p1.getNum() > secretNum) {
                System.out.println(p1.getName() + ", ваше число больше.");
            } else if(p1.getNum() < secretNum) {
                System.out.println(p1.getName() + ", ваше число меньше.");
            }

            System.out.println(p2.getName() + " введите число.");
            p2.setNum(scan.nextInt());
            if(p2.getNum() == secretNum) {
                System.out.println(p2.getName() + " WINS!!! Flawless Victory! " + p1.getName() + ", your soul is MINE!!!!");
                break;
            } else if(p2.getNum() > secretNum) {
                System.out.println(p2.getName() + ", ваше число больше.");
            } else if(p2.getNum() < secretNum) {
                System.out.println(p2.getName() + ", ваше число меньше.");
            }
        }
    }
}