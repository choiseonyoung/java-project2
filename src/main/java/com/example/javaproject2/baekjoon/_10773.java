package com.example.javaproject2.baekjoon;

import java.io.*;
import java.util.Stack;

public class _10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) stack.pop();
            else stack.push(num);
        }

        // 합
        int sum = 0;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            sum += stack.pop();
        }

        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }
}
