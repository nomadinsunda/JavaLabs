package com.intheeast.operators;

public class TernaryExample {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 0;
		
		// (a > b) : ()안에서 사용되는 expression은 true 또는 false 값을 만듦.
		
		// (expression) : expression 의 값이,
		//                1. true 이면(?),
		//                   -> ? X : Y ---> ':' 기준으로 왼쪽에 있는 X가 선택된다
		//                2. false 이면(?),
		//                   ->  ? X : Y ---> ':' 기준으로 오른쪽에 있는 Y가 선택된다.
		
		int ternary = (a > b) ? a : b;
		
		// 
		int ternary2 = (true) ? a : b;
		
        System.out.println("ternary: (a > b) ? a : b = " + ternary);

	}

}
