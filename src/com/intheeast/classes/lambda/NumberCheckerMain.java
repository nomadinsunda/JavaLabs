package com.intheeast.classes.lambda;

public class NumberCheckerMain {
	
	public static void passLambdaExpression(
			Aaa aaa,
			Bbb bbb, 
			Ccc ccc) {
		
		String str1 = "Hello";
		String str2 = "World";
		String concatStr = aaa.concate(str1, str2);
		System.out.println(concatStr);
		
		int a = 100;
		int b = 120;
		bbb.printInteger(a, b);
		
		int Dividend = 10; // Divisor 
		int reminder = ccc.reminder(Dividend);
		System.out.println(reminder);
		
		return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NumberChecker checker = 
//				x -> (x % 2) == 0 ? true : false;
		
		// Ccc의 Divisor는 main 메서드의 로컬 변수를 사용한다.
		int Divisor = 5;
		
		//Aaa aaa = (a, b) -> a + b;
		Bbb bbb = (from, to) -> {
			for(int i=from; i<to; i++) {
				System.out.println(i);
			}
		};
		//Ccc ccc = (Dividend) -> Dividend % Divisor;
		
		passLambdaExpression(
				(a, b) -> a + b,
				bbb,
				/*(from, to) -> {
					for(int i=from; i<to; i++) {
						System.out.println(i);
					}
				},*/
				(Dividend) -> Dividend % Divisor);
	}

}

interface Aaa {
	public String concate(String a, String b);
};

interface Bbb {
	// from: 100, to: 120
	// 100 ~ 120 사이의 모든 정수값을 콘솔에 출력
	public void printInteger(int fromInclusive, int toExclusive);
};

interface Ccc {
	// 나머지 값을 구하는 메서드인데,
	// 전달받은 Dividend에 main 메서드의 로컬 변수(Divisor)로 나누었을 때, 나머지 값을 구하는..
	public int reminder(int Dividend);
};
