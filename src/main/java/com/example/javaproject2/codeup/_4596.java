package com.example.javaproject2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class _4596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;

        int max = 0; // 최대값
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(stk.nextToken());
                if(max<num) {
                    max = num;
                    x = i+1;
                    y = j+1;
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(x+" "+y));
        
        bw.flush();
        bw.close();
    }
}
