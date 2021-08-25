package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
    int numOfTry = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        int[] copyOfNums = nums;
        return  copyOfNums;
    }

    void clear() {
        Arrays.fill(nums, 0, numOfTry, 0);
        numOfTry = 0;
    }
}