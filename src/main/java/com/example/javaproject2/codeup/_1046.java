package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("%d\n", a+b+c);
        System.out.printf("%.1f", (float)(a+b+c)/3);
    }
}
