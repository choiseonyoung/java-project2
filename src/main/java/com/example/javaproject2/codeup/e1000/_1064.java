package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class _1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(num1 < num2 ? num1 < num3 ? num1 : num3 : num2 > num3 ? num3 : num2);
    }
}
