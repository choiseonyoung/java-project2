package com.example.javaproject2.codeup.e1000;

import java.io.*;
import java.util.StringTokenizer;

public class _1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        long w = Integer.parseInt(stk.nextToken()); // 가로 해상도
        long h = Integer.parseInt(stk.nextToken()); // 세로 해상도
        long b = Integer.parseInt(stk.nextToken());

        System.out.printf("%.2f MB", (((w*h*b)/8.0)/1024.0)/1024.0);

        bw.flush();
        bw.close();
    }
}
