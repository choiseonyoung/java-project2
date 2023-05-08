package com.example.javaproject2.codeup;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1671 {
    public static String play(int user, int computer) {
        if((user==0 && computer==1) || (user==1 && computer==2) || (user==2 && computer==0)) {
           return "win";
        } else if (user==computer) {
            return "tie";
        } else return "lose";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer stk = new StringTokenizer(sc.nextLine());

        int user = Integer.parseInt(stk.nextToken());
        int computer = Integer.parseInt(stk.nextToken());

        System.out.printf(play(user,computer));

    }
}
