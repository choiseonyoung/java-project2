package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sArr = str.split("[.]");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(sArr[2]), Integer.parseInt(sArr[1]), Integer.parseInt(sArr[0]));
    }
}
