package com.example.javaproject2.weak2.day3;

import java.util.Arrays;

public class TwoDimArrEx {

    public static void printArray(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("----------");
    }

    // 행 번호를 넣으면 그 행을 1로 값을 넣어주는 static method
    public static void fillARow(int[][] arr, int rowNum) {
        for(int i=0; i<arr.length; i++) {
            arr[rowNum][i] = 1;
        }
        printTwoDimArr(arr);
    }

    public static void printTwoDimArr(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArray(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;
        printArray(arr);

        arr[1][1] = 5;
        printArray(arr);

        fillARow(arr, 1);
    }
}