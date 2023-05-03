package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); // 출석 번호를 부른 횟수

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] num = new int[count];
        int min = 23;
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(stk.nextToken());
            num[i] = number;
            if(number<min) min = number;
        }

        System.out.println(min);
    }
}
