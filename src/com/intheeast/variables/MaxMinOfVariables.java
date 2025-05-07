package com.intheeast.variables;

public class MaxMinOfVariables {

	public static void main(String[] args) {

		// Ob 다음에 오는 수는 이진수라는 의미
//		byte byteDataType = 0b0111_1111; // byte 데이터 타입의 최대 양수 값
		// 위 값 0b0111_1111(십진수:127)을 2의 보수로 음수(단, 이진수)로 나타낸다면?
		// ....0b1000_0001(십진수:-127)
		// Type mismatch: cannot convert from int to byte
		// type casting
		// +128의 2의 보수(-128)는 0x80임.
		byte byteDataType = -128; // byte 데이터 타입의 최소 음수 값
		System.out.printf("1. 0x%x \n", byteDataType);
		
		int maxOfIntDataType = 0x7FFF_FFFF; // 양수 최대값
		System.out.printf("2. 0x%x \n", maxOfIntDataType);
		
		// 32 비트로 가장 큰 양수는 +2147483647[십진수] : 0이 포함되었기 때문에....
		//                                       단, 하나의 0만 존재(+0)
		////////////////////////////////////////////////////////////
		// 32 비트로 가장 작은 음수는 -2147483648 [십진수]
		int minOfIntDataType = -2147483648;//0x8000_000; // 양수 최대값
		// 2147483648의 2의 보수 값[-2147483648:0x8000_000]이 minOfIntDataType에 저장
		System.out.printf("3. 0x%x \n", minOfIntDataType);
		// 0x80000000
		////////////////////////////////////////////////////////////
		
		float simpleFloatVariables = 3.143f; // 부동 소수점...
		double simpleDoubleVariables = 3.14234d;
		
		boolean isTrue = true; // 'true' 리터럴
		boolean isFalse = false;
		
		// 논리연산(OR)
		boolean isRet = isTrue || isFalse;
		
		char alphabet = 'A'; // 아스키코드가 아니라 유니코드
		
		String helloWorld = "Hello World";
		//String helloWorld = new String("Hello World");
		
		int nonDefaultSettingVariable;
		
		Class clazz;
		
		Class<String> stringClass = String.class; // 'String.class'라는 특별한 리터럴
				
		
		System.out.printf("0x%x", byteDataType);
	}

}
