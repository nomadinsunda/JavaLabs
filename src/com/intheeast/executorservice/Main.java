package com.intheeast.executorservice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
	
	public static void executeExecutorService() {
		// 스레드 5개 고정 풀 생성
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // 서로 다른 5개의 태스크 제출
        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            executor.execute(() -> {
                System.out.println(
                        "Task " + taskId +
                        " 시작 | 실행 스레드: " +
                        Thread.currentThread().getName()
                );

                try {
                    // 각 태스크가 3초 동안 작업한다고 가정
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(
                        "Task " + taskId +
                        " 완료 | 실행 스레드: " +
                        Thread.currentThread().getName()
                );
            });
        }

        // 더 이상 작업을 받지 않음
        executor.shutdown();

        try {
            // 모든 작업이 끝날 때까지 대기
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("모든 작업 종료");
	}
	
	public static void useSubmit() {
		ExecutorService executor = Executors.newFixedThreadPool(5);

        // 결과를 저장할 Future 리스트
        List<Future<String>> futures = new ArrayList<>();

        // 5개의 서로 다른 태스크 제출
        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            // submit : 리턴값이 있는 작업(Callable)을 실행해 달라고 요청
            //          1st para가 Callable 임.
            // Futer : 나중에 받을 수 있도록 해줌.
            Future<String> future = executor.submit(() -> {

//            	LocalDateTime now = LocalDateTime.now();
//                System.out.println("현재 시간: " + now);
                
                System.out.println(
                        "Task " + taskId +
                        " 시작 | 실행 스레드: " +
                        Thread.currentThread().getName() +
                        "시간: " + LocalDateTime.now()
                );

                Thread.sleep(3000);

//                System.out.println(
//                        "Task " + taskId +
//                        " 완료 | 실행 스레드: " +
//                        Thread.currentThread().getName() +
//                        "시간: " + LocalDateTime.now()
//                );

                return "Task " + taskId + " 결과:" + LocalDateTime.now() + "\n";
            });

            futures.add(future);
        }
        
        System.out.println("결과 수신 loop: " + LocalDateTime.now());

        // ExecutorService를 사용한 스레드가 결과를 확인하기 위해서는 블로킹이 발생할 수 있음
        for (Future<String> future : futures) {
            try {
            	System.out.println("get 메서드 호출 시간:" + LocalDateTime.now());
                String result = future.get();  // 여기서 결과 대기 : blocking이 발생할 수 있음.
                System.out.println("시간:" + LocalDateTime.now() + 
                		"결과 수신: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        System.out.println("모든 작업 종료");
	}
	
	public static void executorCompletableFuture() {
		ExecutorService executor = Executors.newFixedThreadPool(5);

        CompletableFuture<?>[] futures = new CompletableFuture[5];

        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            futures[i - 1] = CompletableFuture
		                    .supplyAsync(() -> {
		
		                        System.out.println(
		                                "Task " + taskId +
		                                " 시작 | 실행 스레드: " +
		                                Thread.currentThread().getName()
		                        );
		
		                        try {
		                            Thread.sleep(3000);
		                        } catch (InterruptedException e) {
		                            Thread.currentThread().interrupt();
		                        }
		
		                        return "Task " + taskId + " 결과";
		                    }, executor)   // 🔥 우리가 만든 executor 사용
		                    // ExecutorService를 사용한 스레드가 아닌 별도의 스레드에서 결과를 확인할 수 있음
		                    .thenAccept(result -> {
		                        System.out.println(
		                                "결과 처리: " + result +
		                                " | 실행 스레드: " +
		                                Thread.currentThread().getName()
		                        );
		                    });
        }

        // 모든 작업 완료 대기
        CompletableFuture.allOf(futures).join();

        executor.shutdown();
        System.out.println("모든 작업 종료");
	}

    public static void main(String[] args) {
    	
    	useSubmit();
        
    }
}
