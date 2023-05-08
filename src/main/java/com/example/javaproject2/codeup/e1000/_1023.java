package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class _1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("[.]");

        System.out.printf("%s\n%s", arr[0], arr[1]);
    }
}
