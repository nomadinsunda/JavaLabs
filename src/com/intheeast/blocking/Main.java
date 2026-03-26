package com.intheeast.blocking;

public class Main {
	


	// main 메서드를 호출한 스레드[Thread[main]]가 있음!!!
	public static void main(String[] args) throws InterruptedException {
		
		// 
		
		// 
		
		// ..
		
		// 이 시점에 main 스레드 내가 얼마나 cpu를 사용할 시간이 남았는지 모르겠다.
		Thread.sleep(0); // 5초 동안 CPU를 사용하지 않겠다라는 의미!!!: 자바에서는 블록킹이라고 하는데...
		
		System.out.println("escaped");
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
	}

}
