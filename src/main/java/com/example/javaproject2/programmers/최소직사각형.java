package com.example.javaproject2.programmers;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;

        // 가로, 세로 길이 중 더 긴 걸 가로로 옮기기
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int wMax = 0;
        int hMax = 0;

        // 가장 긴 가로,세로 길이 구하기
        for (int i = 0; i < sizes.length; i++) {
            if (wMax < sizes[i][0]) wMax = sizes[i][0];
            if (hMax < sizes[i][1]) hMax = sizes[i][1];
        }

        answer = wMax * hMax;

        return answer;
    }
}
