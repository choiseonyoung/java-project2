package com.example.javaproject2.week4.day2;

public class Prymid2Constructor {
    private String spaceChar = "0";

    public Prymid2Constructor(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }
    public static void main(String[] args) {
        Prymid2Constructor pyramid = new Prymid2Constructor(" "); // argument " "를 넘겨서 초기화
        Prymid2Constructor pyramidSpaceZero = new Prymid2Constructor("0"); // argument "0"을 넘겨서 초기화
        pyramid.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);
    }

}
