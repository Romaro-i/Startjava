package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private int[] nums = new int[5];
    private int numOfTry;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, numOfTry);
    }

    public void setNums(int nums[numOfTry]) {
        this.nums[numOfTry] = nums[numOfTry];
    }

    public void setNumOfTry(int numOfTry) {
        this.numOfTry = numOfTry;
    }

    public int getNumOfTry() {
        return numOfTry;
    }

    void clear() {
        Arrays.fill(nums, 0, numOfTry, 0);
        numOfTry = 0;
    }
}