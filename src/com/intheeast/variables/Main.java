package com.intheeast.variables;

import com.intheeast.OuterAClass;


public class Main {
	
	// static 메서드(클래스 메서드)
	public static void variablesIntroduces() {
		byte firstByte = 1;
		
		boolean valueOfTrue = true;
		boolean valueOfFalse = false;
		
		// 최상위 비트는 부호화 비트이기 때문에,
		// short 데이터타입으로 나타낼 수 있는 가장 큰 양의 정수는 15비트로 나타낼 수 있음
		short twoByteOfMaxShort = 0x7fff;  // fff 라고 값을 지정하고 이 값 접두사로 0x로 지정한 것으느
		                        // fff는 16진수
		                        // 0b111111111111111
		
		// 15비트로 나타낼 수 있는 가장 작은 수는 0b1000000000000000
		short twoByteOfMimShort = -32768;
		
		float valueOfFloat = 0.123435f;
		
		char valueOfChar = '가'; // 0xAC00
		
		System.out.println(valueOfChar);
		
		int bye = 0;
		
	}
	
	// 변수는 크게 두 가지 종류가 있음
	// - Local Variables
	// - Instance Field
	// : 위 두 변수의 디폴트 값!!!에 대해서
	public static void noDefaultValueOfLocalVariable() {
		int noValue;
		noValue = 0;
		
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		String name;
		
		Object obj;
		
//		Main.variablesIntroduces();
		
		Main.noDefaultValueOfLocalVariable();
		// TODO Auto-generated method stub
		OuterAClass outerA = new OuterAClass();
//		outerA.
//		outerA.set
		//FQCN : Fully Qualified Class Name
		// 즉 자바 가상머신은 자바 클래스 이름을 FQCN으로 운용합니다.
		com.intheeast.Main otherMain = 
				new com.intheeast.Main();
		
		int x = 2;
		int y = 10;
		int ret = y / x;
		
		Class<String> strClasses = String.class;
	} 

}
