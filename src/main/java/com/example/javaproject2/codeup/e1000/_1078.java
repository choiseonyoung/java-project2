package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class _1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= in; i++) {
            if(i%2==0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
