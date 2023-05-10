package com.example.javaproject2.week4.day3;

public class RightTriangleDraw {

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(2 * i - 1));
    }

    public void printShape() {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            System.out.printf(makeALine(h, i));
        }
    }

    public static void main(String[] args) {
        RightTriangleDraw rtd = new RightTriangleDraw(); // Instance 생성
        rtd.printShape(); // 호출
    }

}
