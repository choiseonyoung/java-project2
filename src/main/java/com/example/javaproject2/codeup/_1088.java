package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if(i%3!=0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
