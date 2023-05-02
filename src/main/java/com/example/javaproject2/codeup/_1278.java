package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num>0) {
            count++;
            num /= 10;
        }

        System.out.println(count);
    }
}
