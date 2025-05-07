package com.intheeast.numbers;


public class Main {
	
	// 
	public static void callByValueMethod(Integer argu) {
		argu = 3;  // IntegerCache 클래스에 의해 생성된 
					// 256개의 Integer 클래스 인스턴스들중에, 
					// value 필드의 값이
					// 3인 인스턴스의 참조값이 argu에 저장됨...
		            // 그런데, 이 argu 파라미터는 로컬 변수임...
		            // 이 로컬 변수는 callByValueMethod 메서드가 
					// 리턴하는 순간 소멸됨.
		int max = Integer.MAX_VALUE;
		return ;
	}
	
	static {
		// 다음 배열의 엘리먼트는 String 클래스 객체의 인스턴스에 대한 참조값을 저장!!!
		String[] strs = new String[10];
		
		// "" -> 문자열 리터럴? True
		// "0" -> 문자가 하나만 있으면 문자열 리터럴
		for (int i=0; i<strs.length; i++) {
			// 다음 '+'는 덧셈 연산기능을 가진 연산자가 아니라,
			// 문자를 연결하는 연산 기능을 하는 연산자 overloading 이라고 함.
			// 자바는 공식적으로 연산자 오버로딩을 지원하지 않지만,
			// 유일하게 문자열을 연결하는 연산자(+) 오버로딩을 허럭함!
			// 문자열 + 문자열...
			// 다음 i 변수는 정수 데이터 타입인데...어떻게 문자열 + 문자열 코드에 
			// 적용될 수 있나?
			String numberStr = String.valueOf(i);
			strs[i] = new String("") + numberStr;
			//strs[i] = new String("") + i;
		}
		
		// intValue : 참조 변수 -> 참조값을 값으로 가지는...
		//String str = "Hello";
		/*
		 static Integer valueOf(int i)        
		 */
		// 컴파일러가 컴파일러가 대입 연산자를 통해 3이라는 정수 리터럴을 대입하는
		// 코드를 Integer.valueOf 메서드 호출식으로 변경
		// :AutoBoxing이라고함
		Integer intV = Integer.valueOf(3);  // private final int value;
				
		Integer intV2 = Integer.valueOf(3);  // private final int value;
		int ret = intV.compareTo(intV2);
		intV.equals(intV2);
		
		Double doubleValue = 3.1234d; // private final double value;
		int doubleToInt = doubleValue.intValue();
		
		
		// UnBoxing
		int unboxingInteger = intV.intValue();// ; // intValue;
		
		double unboxingDouble = doubleValue;
		
		String numbers = "1234";
		Integer stringFigure = Integer.decode(numbers);
		
				
		int figure = Integer.parseInt(numbers);
				
		
		figure = Integer.parseInt("Kona", 27);
		
				
		String rec = stringFigure.toString();
		
		String figureString = Integer.toString(figure);
		
		int a = 0;
		
	}
	
	
	public static void main(String ...args) {
		
		Integer arg = 10; // Autboxing...
		// 현재 arg의 참조값은 
		// IntegerCache 클래스에 의해 생성된 
		// 256개의 Integer 클래스 인스턴스들중에, 
		// value 필드의 값이
		// 10인 인스턴스 참조값이다.
		callByValueMethod(arg);
		
		return ;
	}
	
	

}
