package com.example.javaproject2.week4.day4;

import java.io.*;

public class ReadFileEx {
    // FileReader (X)
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(".\\hospital.csv"));
    }
}
