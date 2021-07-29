package com.startjava.lesson2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger marauderZeus = new Jaeger("Marauder Zeus", "Unknown", 12, 78, 9, 7);
        System.out.println(marauderZeus);
        marauderZeus.drift();
        marauderZeus.move();
        marauderZeus.attack();
        marauderZeus.run();
        marauderZeus.protect();

        System.out.println("");

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Russia", 6, 72, 8, 7);
        System.out.println(chernoAlpha);
        chernoAlpha.drift();
        chernoAlpha.move();
        chernoAlpha.attack();
        chernoAlpha.run();
        chernoAlpha.protect();

        System.out.println("");
    }
}