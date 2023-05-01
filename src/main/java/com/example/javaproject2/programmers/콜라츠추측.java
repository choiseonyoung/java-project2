package com.example.javaproject2.programmers;

public class 콜라츠추측 {

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int answer = 0;
        long lNum = num;

        if(lNum!=1) {
            for(answer=1; answer<=501; answer++) {
                if(answer==501) return -1;

                if(lNum%2==0) {
                    lNum /= 2;
                } else {
                    lNum = lNum*3+1;
                }

                if(lNum==1) break;
            }
        }

        return answer;
    }
}
