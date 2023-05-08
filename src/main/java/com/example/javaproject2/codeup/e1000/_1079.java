package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class _1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i].equals("q")) break;
        }
    }
}
