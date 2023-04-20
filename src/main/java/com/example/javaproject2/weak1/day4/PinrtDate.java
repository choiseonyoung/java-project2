package com.example.javaproject2.weak1.day4;

public class PinrtDate {
    public static void main(String[] args) {
        System.out.printf("%d\n", 4);
        System.out.printf("%02d\n", 4); // 02 붙여줌 => 04 출력 (한 자리수 일때 0 붙여준다.)
        System.out.printf("%02d\n", 11);
        // 2023-04-20
        System.out.printf("%d-%02d-%02d", 2023, 4, 20);
    }
}
