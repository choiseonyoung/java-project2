package com.example.javaproject2.weak1.day5;

public class UserTest {
    public static void main(String[] args) {
        User seonyoung = new User();
        seonyoung.name = "최선영";
        seonyoung.phoneNumber = "010-0000-1234";
        seonyoung.age = 27;

        System.out.printf("%s님은 성인입니까? %s\n", seonyoung.name, seonyoung.isAdult());
    }
}
