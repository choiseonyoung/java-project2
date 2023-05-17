package com.example.javaproject2.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int num = 1; // 1~n

        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(br.readLine());

            if (num <= in) {
                while (num <= in) {
                    stack.push(num++);
                    sb.append("+\n");
                }
            } else if (stack.peek() != in) {
                sb.setLength(0);
                sb.append("NO");
                break;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb.toString());
    }
}
