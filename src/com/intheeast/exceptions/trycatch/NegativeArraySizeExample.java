package com.intheeast.exceptions.trycatch;

public class NegativeArraySizeExample {
	
    public static void main(String[] args) {
        try {
            int size = -5;

            // 음수 크기로 배열을 생성 → NegativeArraySizeException 발생
            int[] numbers = new int[size];

            System.out.println("배열의 길이: " + numbers.length);
        } catch (NegativeArraySizeException e) {
            System.err.println("NegativeArraySizeException 발생: " + e.getMessage());
        }
    }
}