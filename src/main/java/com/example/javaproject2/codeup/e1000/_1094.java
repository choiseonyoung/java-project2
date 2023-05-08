package com.example.javaproject2.codeup.e1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); // 출석 번호를 부른 횟수

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = Integer.parseInt(stk.nextToken());
        }
        for(int i=count-1; i>=0; i--) {
            System.out.printf("%d ", num[i]);
        }

    }
}
