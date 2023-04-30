package com.example.javaproject2.weak2.day5;

import java.util.Scanner;

public class Promotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt(); // 연차
        int projectCnt = sc.nextInt(); // 프로젝트 횟수

        if(years > 5 || projectCnt > 10) { // 연차 5년 초과 or 프로젝트 횟수 10회 이상이면
            System.out.println("팀장 승진 대상입니다.");
        } else { // 아니면
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
        
    }
}
