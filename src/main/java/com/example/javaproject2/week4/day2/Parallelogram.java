package com.example.javaproject2.week4.day2;

public class Parallelogram {

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(i), "*".repeat(h));
    }

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram();
        int h = 4;
        for (int i = 0; i < h; i++) {
            System.out.printf(parallelogram.makeALine(h, i));
        }
    }
}
