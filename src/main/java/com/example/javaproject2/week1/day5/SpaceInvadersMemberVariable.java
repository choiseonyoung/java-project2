package com.example.javaproject2.weak1.day5;

public class SpaceInvadersMemberVariable {

    int location; // 지역 변수가 아닌 멤버 변수로 선언. 클래스의 멤버다.

    public void moveLeft() {
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }

    public void moveRight() {
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치 : %d\n", simv.location);
        simv.moveLeft();
        System.out.printf("최종 위치 : %d", simv.location);
    }
}
