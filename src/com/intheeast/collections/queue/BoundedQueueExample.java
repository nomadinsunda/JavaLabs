package com.intheeast.collections.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BoundedQueueExample {

    public static void main(String[] args) {
        // 용량이 5인 유한 큐 생성
        BlockingQueue<Integer> boundedQueue = new ArrayBlockingQueue<>(5);

        try {
            // 큐에 요소 추가
            for (int i = 1; i <= 5; i++) {
                boundedQueue.add(i);
                System.out.println("Added element: " + i);
            }

            // 큐가 가득 찼으므로 다음 추가 시도는 실패함
            boolean wasAdded = boundedQueue.offer(6);
            if (!wasAdded) {
                System.out.println("Failed to add element: 6 (Queue is full)");
            }

            // 큐에서 요소 제거
            while (!boundedQueue.isEmpty()) {
                int element = boundedQueue.poll();
                System.out.println("Removed element: " + element);
            }

        } catch (IllegalStateException e) {
            System.err.println("Error adding element to the queue: " + e.getMessage());
        }
    }
}