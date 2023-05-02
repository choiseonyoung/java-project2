package com.example.javaproject2.weak3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1; // 0으로 하면 안 된다.
        for(int i = 1; i <= n; i++){
            answer *= i;
        }
        System.out.println(answer);
    }
}
