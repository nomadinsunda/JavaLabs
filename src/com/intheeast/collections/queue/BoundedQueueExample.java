package com.intheeast.collections.queue;

import java.sql.Time;
import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BoundedQueueExample {
	
	public static void launchThread(BlockingQueue<Integer> boundedQueue) throws InterruptedException {
				
		Runnable run = () -> {
			try {
				Thread.sleep(5000);
				boundedQueue.add(0);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("2nd thread exit");	
		};
		
		// [main] 스레드가 다음 스레드를 생성
		Thread thread = new Thread(run);
		// the Java Virtual Machine calls the run method of this thread. 
		thread.start(); // [main] 넌블럭킹
		
		// [main] 스레드가 run 메서드의 실행이 완료될 때까지 블럭킹 됨
		// 왜? [main] 스레드가 다음 스레드의 run 메서드를 호출했기 때문에...
		//thread.run(); // launchThread 메서드가 생성한 스레드가 정상 종료될 때까지 
		              // main 스레드가 기다렸다[블럭킹]가 리턴함
		
		System.out.println("launchThread method return");			

	}

	// [main] 스레드가 main 메서드를 실행시킴.
    public static void main(String[] args) {
        // 용량이 5인 유한 큐 생성
        BlockingQueue<Integer> boundedQueue = new ArrayBlockingQueue<>(5);
        
        // Retrieves and removes the head of this queue, 
        // waiting up to the specified wait time 
        // if necessary for an element to become available.
        // BlockingQueue.poll(long timeout, TimeUnit unit) throws InterruptedException
        try {
        	//TimeUnit timeOut;
        	
        	LocalDate prvTime = LocalDate.now(); 
        	// System이 booting한 이후 경과된 시간,
        	// 1970년 1월 1일 자정부터 경과된 시간
        	launchThread(boundedQueue);
        	
        	//long prvNano = System.nanoTime();
        	long prvNano = System.currentTimeMillis();
        	// 블럭킹을 5초...
			Integer element = boundedQueue.poll(10000, TimeUnit.MILLISECONDS);
			LocalDate afterTime = LocalDate.now();
//			long afterNano = System.nanoTime();
			long afterNano = System.currentTimeMillis();
			
			long elapsed = afterNano - prvNano;
			
			long elapsedSeconds = elapsed / 1000000000L;
			
			System.out.println("elapsedSeconds = " + elapsedSeconds);			
			
//			Period period = Period.between(prvTime, afterTime);
						
			if (element == null) {
				System.out.println("element is null");
			} else {
				System.out.println("element = " + element);
			}
        
        } catch (InterruptedException e) {
			
			// lock...acquire...
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
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