package com.intheeast.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeRemoveOccurrenceExample {

	// FIFO, LIFO 지원
    public static void main(String[] args) {
        // Deque 인스턴스 생성
        Deque<String> deque = new ArrayDeque<>();

        // 요소 추가
        deque.add("A"); // 57th : elements 배열의 인덱스
        deque.add("B");
        deque.add("C");
        deque.add("D");
        deque.add("E");
        deque.add("F");
        deque.add("G");
        deque.add("H");
        deque.add("I");
        deque.add("J");
        deque.add("K");
        deque.add("L");
        deque.add("M");
        deque.add("N");
        deque.add("O");
        deque.add("P");
        deque.add("Q"); // 17
        
        deque.add("A"); // 0th
        deque.add("S"); // 19
        deque.add("T");
        deque.add("1");
        deque.add("2");
        deque.add("3");
        deque.add("4");
        deque.add("5");
        deque.add("6");
        deque.add("7");
        deque.add("8");
        deque.add("A");
        deque.add("10");
        deque.add("11");
        deque.add("12");
        deque.add("13");
        deque.add("14");
        deque.add("15");
        deque.add("16");
        deque.add("17");
        deque.add("18");
        deque.add("19");
        
        deque.add("20");

        // 초기 Deque 상태 출력
        System.out.println("Initial Deque: " + deque);
        
        for (String str : deque) {
        	System.out.println(str);
        	if (str.equals("19")) {
        		int a = 0;
        	}
        }
        
//        Iterator<String> iter = deque.iterator();
//        while (iter.hasNext()) {
//        	deque.remove();
//        }
        
        for (String str : deque) {
        	deque.remove();
        }

        // removeFirstOccurrence 메서드로 첫 번째 "A" 제거
        //String aStr = new String("A");
        boolean removedFirst = deque.removeFirstOccurrence("A");
        System.out.println("After removeFirstOccurrence(\"A\"): " + deque + " (removed: " + removedFirst + ")");

        // removeLastOccurrence 메서드로 마지막 "A" 제거
        boolean removedLast = deque.removeLastOccurrence("A");
        System.out.println("After removeLastOccurrence(\"A\"): " + deque + " (removed: " + removedLast + ")");

        // 존재하지 않는 엘리먼트 제거 시도
        boolean removedNonExistent = deque.removeFirstOccurrence("Z");
        System.out.println("After removeFirstOccurrence(\"Z\"): " + deque + " (removed: " + removedNonExistent + ")");

        // 최종 Deque 상태 출력
        System.out.println("Final Deque: " + deque);
    }
}