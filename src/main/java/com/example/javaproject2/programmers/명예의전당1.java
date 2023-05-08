package com.example.javaproject2.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의전당1 {
    class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length]; // 매일 발표된 명예의 전당의 최하위 점수

            List<Integer> kList = new ArrayList<>(); // 명예의 전당

            for (int i = 0; i < score.length; i++) {
                if(kList.size() < k) {
                    kList.add(score[i]);
                    Collections.sort(kList);
                    answer[i] = kList.get(0);
                    continue;
                } else if(kList.size() == k) {
                    int min = kList.get(0);

                    if(min < score[i]) {
                        kList.remove(0);
                        kList.add(score[i]);
                        Collections.sort(kList);
                    }
                    answer[i] = kList.get(0);
                }
            }

            return answer;
        }
    }
}
