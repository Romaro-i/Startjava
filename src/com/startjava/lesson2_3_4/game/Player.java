package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
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

    void clear() {
            Arrays.fill(nums, 0);
    }

    void tryEnd() {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(" - введённые числа игроком по имени " + getName());
    }
}