package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iHaxVal = Integer.parseInt(sc.nextLine(), 16);

        for(int i = 1; i<=15; i++) {
            System.out.printf("%X*%X=%X\n", iHaxVal, i, iHaxVal*i);
        }
    }
}
