package com.example.javaproject2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class _1099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        int x = 1;
        int y = 1;

        while (x < 9 && y < 9) {
            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            } else arr[x][y] = 9;

            // 오른쪽이 막혔을 때 -> 아래로 이동
            if (arr[x][y + 1] == 1) {
                if (arr[x + 1][y] == 1) { // 아래도 막혔을 때
                    break;
                } else { // 아래로 이동 가능할 때
                    x++;
                }
            } else { // 오른쪽이 안 막혔을 때 -> 오른쪽으로 이동
                y++;
            }

            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }

            arr[x][y] = 9;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                bw.write(String.valueOf(arr[i][j] + " "));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
