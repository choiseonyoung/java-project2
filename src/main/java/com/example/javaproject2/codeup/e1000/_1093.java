package com.example.javaproject2.codeup.e1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 출석 번호를 부른 횟수

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] count = new int[24];
        for(int i=0; i<num; i++) {
            count[Integer.parseInt(stk.nextToken())]++;
        }
        for(int i=1; i<count.length; i++) {
            System.out.printf("%d ", count[i]);
        }
    }
}
