package com.example.javaproject2.programmers;

import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {
    public int[] solution(int n) {

        // n을 나눌 수 있는 가장 작은 수를 구하고,
        // 그 수로 n을 나누고 그 몫이 n이 된다
        // while 그 수로 나눌 수 있을 때까지
        // i를 List에 추가한다.
        // answer new int[list사이즈]
        // for answer = list.get

        List<Integer> list = new ArrayList<>();
       for(int i=2; i<=n; i++) {
            if(n%i==0) {
                while(n%i==0) {
                    n /= i;
                }
                list.add(i);
            }
        }
       int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
