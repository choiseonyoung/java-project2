package com.example.javaproject2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class _1097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;

        int[][] arr = new int[19][19]; // 바둑판

        for (int i = 0; i < arr.length; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        
        int n = Integer.parseInt(br.readLine()); // 십자 뒤집기 횟수
        
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken())-1; // x좌표
            int y = Integer.parseInt(stk.nextToken())-1; // y좌표
            for (int j = 0; j < arr.length; j++) {
                arr[x][j] = arr[x][j] == 0 ? 1 : 0;
                arr[j][y] = arr[j][y] == 0 ? 1 : 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                bw.write(String.valueOf(arr[i][j]+" "));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
