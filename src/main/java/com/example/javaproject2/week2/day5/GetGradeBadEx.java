package com.example.javaproject2.weak2.day5;

public class GetGradeBadEx {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 70) { // false
            System.out.println("C");
        } else if (score >= 80) { // false
            System.out.println("B");
        } else if (score >= 90) { // true
            System.out.println("A");
        } else {
            System.out.println("F");
        }
    }
}
