package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sOctal = sc.nextLine();
        int iDecimal = Integer.valueOf(sOctal, 8);
        System.out.println(iDecimal);
    }
}
