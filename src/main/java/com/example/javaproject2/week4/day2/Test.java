package com.example.javaproject2.week4.day2;

public class Test {
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(i), "*".repeat(2 * (h - i) - 1));
    }

    public static void main(String[] args) {
        Test test = new Test();
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.print(test.makeALine(h, i));
        }
    }
}
