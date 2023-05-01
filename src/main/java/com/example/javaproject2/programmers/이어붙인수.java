package com.example.javaproject2.programmers;

public class 이어붙인수 {
    public static void main(String[] args) {
    }

    public int solution(int[] num_list) {
        int answer = 0;
        String oddString = "";
        String evenString = "";

        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] %2 == 0) {
                evenString += num_list[i];
            } else {
                oddString += num_list[i];
            }
        }
        int oddSum = Integer.parseInt(oddString);
        int evenSum = Integer.parseInt(evenString);
        answer = oddSum+evenSum;
        return answer;
    }
}
