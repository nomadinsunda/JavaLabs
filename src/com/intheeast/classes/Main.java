package com.intheeast.classes;

public class Main {
	
	public static void checkSuperClass() {
		int cadence = 5;
		int gear = 4;
		int speed = 60;
		int seatHeight = 20;
		
		Bicycle bicycle = new Bicycle(cadence, gear, speed);
		
		MountainBike mountainBike = new MountainBike(cadence,
				gear,
				speed,
				seatHeight);
		
		mountainBike.setCadence(100);
		
	}

	public static void main(String... args) {
		Main.checkSuperClass();
		
		CheckSuperConstructor csc = 
				new CheckSuperConstructor();
		
		Main main = new Main();

		
		// console은 standardout[리눅스 용어] 이라고 함
		// 다음의 println 메서드는 문자열을 콘솔에 출력하는 메서드임
		// %d : d는 Decimal(십진수를 의미)
		// printf(String format, Object ... args)
		System.out.printf("My age is %d %s 0x%x PI:%f \n", 
				51, "bye", 255, Math.PI);
		
		
		System.out.printf("My age is 0x%x \r\n", 51);
		System.out.printf("원주율 %f \r\n", Math.PI);
		System.out.printf("Hello : %s \r\n", "World");
//		System.out.printf("Good-:%s \r\n", "Bye");

		System.out.println();
		
		System.out.println("Hello World");
		System.out.println("Good-Bye");
		
	}

}
