package com.example.javaproject2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class _1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        long h = Integer.parseInt(stk.nextToken()); // 1초동안 마이크로 소리강약을 체크하는 수
        long b = Integer.parseInt(stk.nextToken()); // 한번 체크한 결과를 저장하는 비트
        long c = Integer.parseInt(stk.nextToken()); // 좌우 등 소리를 저장할 트랙 개수인 채널
        long s = Integer.parseInt(stk.nextToken()); // 녹음할 시간

        System.out.printf("%.1f MB", (((h * b * c * s)/8.0)/1024.0)/1024.0);
    }
}
