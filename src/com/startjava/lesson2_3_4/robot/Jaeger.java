package com.startjava.lesson2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String origin;
    private int kaijuKilled;
    private int height;
    private int armor;
    private int strenght;

    public Jaeger(String modelName, String origin, int kaijuKilled, int height, int armor, int strenght) {
        this.modelName = modelName;
        this.origin = origin;
        this.kaijuKilled = kaijuKilled;
        this.height = height;
        this.armor = armor;
        this.strenght = strenght;
    }

    public void drift() {
        System.out.println("Дрифт выполнен!");
    }

    public void move() {
        System.out.println("Jaeger начал движение!");
    }

    public void attack() {
        System.out.println("Jaeger пошёл в атаку!");
    }

    public void run() {
        System.out.println("Jaeger ускорился!");
    }

    public void protect() {
        System.out.println("Jaeger находится в режиме обороны!");
    }

    public String toString() {
        return "modelName = " + modelName +"; origin = " + origin + "; kaijuKilled = " + kaijuKilled + "; height = " + height + "; armor = " + armor + " strenght = " + strenght;
    }
}