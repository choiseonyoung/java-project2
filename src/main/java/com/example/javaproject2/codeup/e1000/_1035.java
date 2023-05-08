package com.example.javaproject2.codeup.e1000;

import java.util.Scanner;

public class _1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sHex = sc.nextLine();
        int iDecimal = Integer.valueOf(sHex, 16);
        System.out.println(Integer.toOctalString(iDecimal));
    }
}
