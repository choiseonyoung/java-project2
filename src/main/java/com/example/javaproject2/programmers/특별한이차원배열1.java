package com.example.javaproject2.programmers;

public class 특별한이차원배열1 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int column = 0;

        for(int i=0; i<n; i++) {
                answer[i][column++] = 1;
        }

        return answer;
    }
}
