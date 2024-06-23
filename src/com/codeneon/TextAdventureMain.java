package com.codeneon;

import java.util.Scanner;
import static com.codeneon.PrintSlowly.*;

public class TextAdventureMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AsciiCode.printCastle();

        //시작 멘트
        printSlowly(".......");
        printSlowly("100년만인가...");
        printSlowly("감히 마왕성의 문을 두드리다니...");
        printSlowly("용기를 가상하게 여겨 이름은 알아두도록 하지");

        System.out.print("너의 이름은?: ");
        String name = sc.nextLine();
        printSlowly("용사 " + name + "인가?! 하하 어디 성문은 열 수 있는지 볼까?");

        AsciiCode.printStart();

        Adventure adventure = new Adventure();

        // 성문 열기
        int weapon = adventure.EnterCastle();
        // weapon == 1 : 장비 있음
        // weapon == 0 : 장비 없음

        // 문제풀기
        adventure.solveProblems();

        // 몬스터 전투
        adventure.monsterBattle();



    }
}
