package com.startjava.lesson2_3_4.person;

public class Person {
    String name = "Roman";
    char gender = 'm';
    byte age = 37;
    float height = 2.05f;
    float weight = 100.0f;

    void move() {
        System.out.println("Ваш персонаж пошёл.");
    }

    void sitDown() {
        System.out.println("Ваш персонаж сел.");
    }

    void run() {
        System.out.println("Ваш персонаж побежал.");
    }

    void talk() {
        System.out.println("Ваш персонаж что-то говорит.");
    }

    void learnJava() {
        System.out.println("Ваш персонаж изучает Java.");
    }
}