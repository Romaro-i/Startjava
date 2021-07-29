package com.startjava.lesson1.unicode;

public class Unicode {
    public static void main(String[] args) {
        int start = 33;
        int end = 126;
        char firstChar = (char)(start + '0');
        char lastChar = (char)(end + '0');

        for(char i = firstChar; i <= lastChar; i++)
            System.out.println(i);
    }
}