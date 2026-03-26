package com.intheeast.threadsample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAccountSync {
	
	private final Path path;

    public FileAccountSync(String fileName, int initialBalance) throws IOException {
        this.path = Path.of(fileName);

        // 파일 존재 여부 상관없이 항상 초기화
        Files.writeString(path, String.valueOf(initialBalance));
    }

    // synchronized로 임계영역 보호
    public synchronized void withdraw(int amount) throws IOException {

        String threadName = Thread.currentThread().getName();
        System.out.println("+[" + threadName + "]");


        // 1. 잔액 읽기
        int balance = Integer.parseInt(Files.readString(path).trim());
        System.out.println("[" + threadName + "] 읽은 잔액: " + balance);

        if (balance >= amount) {

            // 일부러 지연 넣어도 안전
            try { Thread.sleep(50); } catch (InterruptedException ignored) {}

            // 2. 차감
            balance -= amount;
            System.out.println("[" + threadName + "] 차감 후 잔액: " + balance);

            // 3. 다시 쓰기
            Files.writeString(path, String.valueOf(balance));
            System.out.println("[" + threadName + "] 파일에 저장 완료");
        } else {
            System.out.println("[" + threadName + "] 잔액 부족, 출금 불가");
        }
        
        System.out.println("-[" + threadName + "]");
    }

    public synchronized int getBalance() throws IOException {
        return Integer.parseInt(Files.readString(path).trim());
    }

}
