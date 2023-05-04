package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.printf("[%c0000]\n",str.charAt(0));
        System.out.printf("[%c000]\n",str.charAt(1));
        System.out.printf("[%c00]\n",str.charAt(2));
        System.out.printf("[%c0]\n",str.charAt(3));
        System.out.printf("[%c]\n",str.charAt(4));
    }
}
