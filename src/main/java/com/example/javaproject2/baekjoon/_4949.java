package com.example.javaproject2.baekjoon;

import java.io.*;
import java.util.Stack;

public class _4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();

            if (s.equals(".")) break;
            else {
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == '(' || c == '[') {
                        stack.push(c);
                    } else if (c==')' || c==']') {
                        if (stack.empty()) {
                            stack.push(c);
                            break;
                        } else if ((stack.peek() == '(' && c == ']') || (stack.peek() == '[' && c == ')')) { // 이전 괄호와 매칭이 안 되는 경우
                            break;
                        } else { // 균형 맞으면
                            stack.pop();
                        }
                    }
                }

                bw.write(stack.empty() ? "yes" : "no");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
