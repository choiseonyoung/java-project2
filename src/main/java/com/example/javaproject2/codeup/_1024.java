package com.example.javaproject2.codeup;

import java.util.Scanner;

public class _1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++) {
            System.out.printf("'%c'\n", str.charAt(i));
        }
    }
}
