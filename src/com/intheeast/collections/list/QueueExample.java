package com.intheeast.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
	{
		// Array와 비교해서 어떤 장점을?
				// : Offset!!! : 배열의 첫번째 엘리먼트의
				//               주소만 알면 됨.
				//               엘리먼트의 동일한 데이터 타입
				//               연속적인 메모리 공간에 엘리먼트가 저장됨
				// 장점: Element의 Insert/Delete 자유로움
				// 단점: 연속적인 메모리 공간에
				//     엘리먼트가 저장되지 않음.
				//     -> 어딘가에 엘리먼트의 저장 위치 정보가 관리.
//				List<String> list = 
//						new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = 
				new LinkedList<>();

        // 큐에 엘리먼트 추가
		// First In(Push)
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // 큐에서 엘리먼트 제거 및 출력
        // First Out(Pop)
        System.out.println("Removed with remove(): " + queue.remove()); // 1
        System.out.println("Removed with poll(): " + queue.poll());     // 2
        System.out.println("Removed with remove(): " + queue.remove()); // 3

        // 큐가 비어 있는 경우 remove() 메서드 사용 시 예외 발생
        try {
            System.out.println("Attempt to remove with remove(): " + queue.remove());
        } catch (NoSuchElementException e) {
        	// NoSuchElementException : Checked Exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        // 큐가 비어 있는 경우 poll() 메서드 사용 시 null 반환
        System.out.println("Attempt to remove with poll(): " + queue.poll()); // null
    }	

}
