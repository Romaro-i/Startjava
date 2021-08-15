package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int num;
    int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
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