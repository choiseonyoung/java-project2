package com.example.javaproject2.codeup.e1200;

import java.util.Scanner;

public class _1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 9 ; i++) {
            for (int j = 0; j < n*i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
