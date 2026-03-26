package com.intheeast.threadsample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
    	List<Thread> threads = new ArrayList<>();

//        FileAccount account = new FileAccount("balance.txt", 1000);
    	FileAccountSync account = new FileAccountSync("balance.txt", 1000);

        Runnable task = () -> {
            try {
                account.withdraw(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 5; i++) {
        	Thread thread = new Thread(task);
        	threads.add(thread);
        	thread.start();
        }
       
        for (Thread thread : threads) {
        	// Waits for this thread to die.
        	thread.join();
        }
           

        // 결국 최종 잔금은 500이 남아야 하는데...
        System.out.println("Final Balance: " + account.getBalance());
    }
}
