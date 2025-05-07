package com.intheeast.strings;

public class StringFormat {
	
	static {
		// 
		Integer intVar = 20; /*Integer.valueOf(1);*/ // AutoBoxing
		// deprecated..낙후된 : 써도 되는데 사용하지 마시오!! 언젠가 차후 자바 버전에서 이 컨스트럭터는 private이 될것!
		Float floatVar = 3.0f;//Float.valueOf(3.0f);//new Float(3.0f);//3.0f;/*new Float(3.0f);*/ // AutoBoxing
		String stringVar = "Hello"; // ...
		
		Float.valueOf(3.0f);
		
		String valueString = "10";
		Integer what = Integer.valueOf(valueString);
		
//		
//		System.out.printf("The value of the float " + 
//				"variable is %f, while " + 
//				"the value of the " + 
//				"integer variable is %d, " + 
//				"and the string is %s", 
//				3.0f,/*floatVar*/ // Float 클래스 기본 데이터 타입이 float인 value 필드의 값을 전달 
//				1,/*intVar*/   // Integer 클래스의 value 필드의 기본 데이터 타입은 int
//				stringVar);
		
		String fs;
		fs = String.format("0x%x, %d",
				intVar, intVar);
		
		System.out.println(fs);
	}
	
	public static void main(String ... args) {
		
	}

}
