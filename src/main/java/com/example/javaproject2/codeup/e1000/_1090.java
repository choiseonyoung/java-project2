package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class _1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); // 시작값
        long r = sc.nextLong(); // 등비
        long n = sc.nextLong(); // 몇번째수인지

        for(int i=2; i<=n; i++) {
            a *= r;
        }

        System.out.println(a);
    }
}
