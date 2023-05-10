package com.example.javaproject2.week4.day2;

public class Prymid2 {
    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", "0".repeat(height-i-1), "*".repeat(2*i+1));
        }
    }

    public static void main(String[] args) {
        Prymid2 prymid2 = new Prymid2();
        int height = 4;
        prymid2.printPyramid(height);
    }
}
