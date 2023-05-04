package com.example.javaproject2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class _1098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(stk.nextToken()); // 세로
        int w = Integer.parseInt(stk.nextToken()); // 가로

        stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken()); // 막대 개수

        int[][] arr = new int[h + 1][w + 1]; // 격자판
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(stk.nextToken()); // 막대 길이
            int d = Integer.parseInt(stk.nextToken()); // 방향 (가로0 세로1)
            int x = Integer.parseInt(stk.nextToken()); // x좌표
            int y = Integer.parseInt(stk.nextToken()); // y좌표

            for (int j = 0; j < l; j++) {
                if (d == 0) arr[x][y + j] = 1; // 가로 방향이라면
                else arr[x + j][y] = 1; // 세로 방향이라면
            }
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                bw.write(String.valueOf(arr[i][j] + " "));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
