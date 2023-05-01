package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int answer = 0;
        int sum = 0;
        while(sum < in) {
            answer++;
            sum += answer;
        }
        System.out.println(answer);
    }
}
