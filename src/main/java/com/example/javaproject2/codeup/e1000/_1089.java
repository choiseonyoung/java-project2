package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class _1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시작값
        int d = sc.nextInt(); // 등차의 값
        int n = sc.nextInt(); // 몇번째수인지

        for(int i=2; i<=n; i++) {
            a += d;
        }

        System.out.println(a);
    }
}
