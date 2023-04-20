package com.example.javaproject2.weak1.day4;

public class PrintEx {
    public void printf() {
        System.out.printf("%s", "Hello");
        // 엔터 치려면 뒤에 \n 붙이기
    }

    public static void main(String[] args) {
        PrintEx printEx = new PrintEx();
        printEx.printf();
    }
}
