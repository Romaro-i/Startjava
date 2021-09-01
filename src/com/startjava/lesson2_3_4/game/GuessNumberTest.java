package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Приветствую Вас в игре - \"Угадай число от 0 до 100!\"");

        Player p1 = createPlayer(1);
        Player p2 = createPlayer(2);

        System.out.println("Mortal Kombat is begin!!! FIGHT!!!");
        System.out.println("У каждого из игроков всего " + p1.getNums().length +" попыток, чтобы угадать загаданное число!!!");

        String playerAnswer = "yes";
        while("yes".equals(playerAnswer)) {
            GuessNumber game = new GuessNumber(p1, p2);
            game.play();

            do {
                System.out.print("Хотите продолжить игру 'Угадай число'? [yes/no]: ");
                playerAnswer = scan.next();
            } while (!"yes".equalsIgnoreCase(playerAnswer) && !"no".equalsIgnoreCase(playerAnswer));
        }
    }

    private static Player createPlayer(int numOfPlayer) {
        System.out.println(numOfPlayer + "-й игрок, введите имя:");
        return new Player(scan.nextLine());
    }
}