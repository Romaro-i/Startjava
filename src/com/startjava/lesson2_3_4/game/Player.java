package com.startjava.lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] nums = new int[5];
    private int numOfTry;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        nums[numOfTry] = num;
    }

    public int[] getNums() {
        return  Arrays.copyOf(nums, numOfTry);
    }

    public void setNumOfTry(int numOfTry) {
        this.numOfTry = numOfTry;
    }

    public int getNumOfTry() {
        return numOfTry;
    }

    public int getLastNum() {
        return nums[numOfTry - 1];
    }

    void clear() {
        Arrays.fill(nums, 0, numOfTry, 0);
        numOfTry = 0;
    }
}