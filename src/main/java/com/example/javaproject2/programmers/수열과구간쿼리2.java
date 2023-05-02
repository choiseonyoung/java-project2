package com.example.javaproject2.programmers;

public class 수열과구간쿼리2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int min = -1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    if (min == -1) min = arr[j];
                    else {
                        if(arr[j] < min) min = arr[j];
                    }
                }
            }
            answer[i] = min;
        }
        return answer;
    }
}
