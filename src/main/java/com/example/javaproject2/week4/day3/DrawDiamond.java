package com.example.javaproject2.week4.day3;

public class DrawDiamond {

    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static void main(String[] args) {
        int h = 5;
        int pivot = h/2;

        for (int i = 0; i < h; i++) {
            if(i <= pivot) {
                // 피라미드 로직
                System.out.printf("%s%s\n", getRepeatedSymbol("0", pivot-i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                // 역피라미드 로직
                System.out.printf("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}
