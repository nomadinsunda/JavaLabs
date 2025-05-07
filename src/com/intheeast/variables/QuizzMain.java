package com.intheeast.variables;

public class QuizzMain {

	public static void main(String... args) {

		int[] X; // 배열을 참조하는 변수를 선언 
		X = new int[10];
		
		Quizz quizz = new Quizz();
		
		System.out.println(quizz);
		
		System.out.println("Quizz의 초기화되지 않은 필드 값:" + 
				quizz.getQuizz());
	}

}
