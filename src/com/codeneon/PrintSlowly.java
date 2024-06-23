package com.codeneon;

public class PrintSlowly {

    public static void printSlowly(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(100); // 0.1초 간격으로 출력
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(); // 다음 줄로 넘어가기
    }
}