package com.example.javaproject2.programmers;

public class 배열만들기2 {
    public int[] solution(int l, int r) {
        int[] answer;
        int count = 0;

        for(int i=l; i<=r; i++) {
            if(isZeroFive(i)) count++;
        }

        if(count>0) {
            answer = new int[count];
            int count2 = 0;

            for (int i = l; i <= r; i++) {
                if(isZeroFive(i)){
                    answer[count2++] = i;
                }
            }
        } else {
            answer = new int[] {-1};
        }

        return answer;
    }

    public boolean isZeroFive(int num) {
        while(num>0) {
            if(num%5 != 0) {
                return false;
            } else {
                num /= 10;
            }
        }

        return true;
    }
}