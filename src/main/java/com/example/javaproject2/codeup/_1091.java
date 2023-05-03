package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); // 시작값
        long m = sc.nextLong(); // 곱할값
        long d = sc.nextLong(); // 더할값
        long n = sc.nextLong(); // 몇번째수인지

        for(int i=2; i<=n; i++) {
            a = a*m+d;
        }

        System.out.println(a);
    }
}
