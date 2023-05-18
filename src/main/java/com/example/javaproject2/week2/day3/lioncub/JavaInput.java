package com.example.javaproject2.weak2.day3.lioncub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void read() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println(br.readLine());
    }

}
