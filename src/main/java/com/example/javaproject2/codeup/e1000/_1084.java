package com.example.javaproject2.codeup.e1000;

import java.io.*;
import java.util.Scanner;

public class _1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    bw.write(String.valueOf(i+ " "+j+" "+k));
                    bw.newLine();
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
