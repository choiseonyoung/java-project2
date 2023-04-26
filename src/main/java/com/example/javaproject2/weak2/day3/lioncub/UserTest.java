package com.example.javaproject2.weak2.day3.lioncub;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        //
//        User user = new User();
//
//        user.name = "아기사자";
//        user.age = 10;
//        user.printAge();
//        user.printName();

        Scanner sc = new Scanner(System.in);
        User user = new User();
        user.name = sc.nextLine();
        user.age = sc.nextInt();
        user.gender = sc.nextLine();

        System.out.println();
    }
}
