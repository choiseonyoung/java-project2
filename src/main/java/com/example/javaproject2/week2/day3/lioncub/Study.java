package com.example.javaproject2.weak2.day3.lioncub;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
//        System.out.println("안뇽 " + "아기사자반" + "ㅎㅎ");
//        System.out.printf("%s\n, %s %s", "안뇽", "아기사자반", "ㅎㅎ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.printf("%.1f", (float)(num1+num2+num3)/3);
    }
}
