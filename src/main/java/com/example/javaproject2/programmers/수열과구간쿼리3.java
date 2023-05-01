package com.example.javaproject2.programmers;

import java.util.Arrays;

public class 수열과구간쿼리3 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,3}, {1,2}, {1,4}};
        int[] answer = solution(arr, queries);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }
}
