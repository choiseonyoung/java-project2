package com.example.javaproject2.baekjoon;

import java.io.*;
import java.util.Stack;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '(') stack.push(s.charAt(j));
                else {
                    if(stack.empty()) {
                        stack.push(s.charAt(j));
                        break;
                    } else stack.pop();
                }
            }

            bw.write(stack.empty() ? "YES" : "NO");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
