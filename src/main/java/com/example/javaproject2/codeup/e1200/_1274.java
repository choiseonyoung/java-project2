package com.example.javaproject2.codeup.e1200;

import java.util.Scanner;

public class _1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = true;

        for(int i=2; i*i<=num; i++) {
            if(num%i==0) {
                System.out.println("not prime");
                prime = false;
                break;
            }
        }

        if(prime) {
            System.out.println("prime");
        }
    }
}
