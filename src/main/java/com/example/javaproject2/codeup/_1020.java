package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resNo = sc.nextLine();
        String resNo1 = resNo.substring(0,6);
        String resNo2 = resNo.substring(7);
        System.out.println(resNo1 + resNo2);
    }
}
