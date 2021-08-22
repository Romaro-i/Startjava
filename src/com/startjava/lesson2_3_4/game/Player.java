package com.startjava.lesson2_3_4.game;

import java.util.Scanner;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[5];
    int numOfTry = 0;
    Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return nums;
    }

    void clear() {
        Arrays.fill(nums, 0, numOfTry, 0);
        numOfTry = 0;
    }
}