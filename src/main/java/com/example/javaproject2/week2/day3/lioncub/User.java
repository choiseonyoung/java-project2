package com.example.javaproject2.weak2.day3.lioncub;

public class User {
    String name;
    int age;
    String gender;
    
    public void printAge() {
        System.out.println(age);
    }

    public void printName() {
        System.out.println(name);
    }
    
    public void isAdult() {
        if(age >= 18) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
