package com.example.javaproject2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class _1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk;
        int[][] arr = new int[20][20]; // 바둑판

        int n = Integer.parseInt(br.readLine()); // 흰 돌 개수

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(stk.nextToken())][Integer.parseInt(stk.nextToken())] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                bw.write(String.valueOf(arr[i][j])+" ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
