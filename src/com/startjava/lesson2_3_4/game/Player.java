package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
    int numOfTry = 0;
    Scanner scan = new Scanner(System.in);

    public Player() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNums() {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    public String enterName() {
        System.out.println("Введите имя игрока: ");
        name = scan.nextLine();
        return  getName();
    }

    public int enterNum() {
        System.out.println(getName() + " введите число");
        getNums()[numOfTry] = scan.nextInt();
        return numOfTry;
    }

    void clear() {
        Arrays.fill(nums, 0, numOfTry, 0);
        numOfTry = 0;
    }
}