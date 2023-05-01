package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int ch = 12*Integer.parseInt(in.substring(1,2)) + Integer.parseInt(in.substring(3));
        System.out.printf("%d", ch);
    }
}
