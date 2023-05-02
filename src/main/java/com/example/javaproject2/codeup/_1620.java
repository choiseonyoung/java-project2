package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        if(num<10) sum = num;

        while(num>=10) {
            sum = 0;
            while(num>0) {
                sum += num%10;
                num /= 10;
            }
            num = sum;
        }
        System.out.println(sum);
    }
}
