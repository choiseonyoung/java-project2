package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class _1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sArr[] = str.split("[.]");

        System.out.printf("%04d", Integer.parseInt(sArr[0]));
        System.out.printf(".");
        System.out.printf("%02d", Integer.parseInt(sArr[1]));
        System.out.printf(".");
        System.out.printf("%02d", Integer.parseInt(sArr[2]));

    }
}
