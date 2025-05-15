package com.intheeast.exceptions.trycatch;

public class APIMisuseExample2 {
    public static void main(String[] args) {
        printSubstring("Hello", -1, 3);  // 잘못된 인덱스 전달
    }

    public static void printSubstring(String str, int start, int end) {
        // substring 메서드는 시작 인덱스가 음수면 StringIndexOutOfBoundsException 발생
        String sub = str.substring(start, end);
        System.out.println("substring: " + sub);
    }
}