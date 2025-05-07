package com.intheeast.operators;


// VM은 main 메서드를 호출하기 전에,
// main 메서드내에서 문자열 리터럴(ex, "This is") 존재를 확인
// 이 문자열을 구성하는 각 캐릭터(문자)를 저장/관리하는 String 클래스 객체의 인스턴스를 생성
// 이 String 클래스 객체의 인스턴스의 value(byte[]) 배열 필드에,
// 위 각 캐릭터('T', 'h', 'i', 's', ' ', 'i', 's')를 엘리먼트로 저장함
// 그리고 마지막으로 String literal Pool에서 이 String 클래스 객체 인스턴스를 관리함
public class ConcatDemo {

	public static void main(String[] args) {
		
		// firstString 참조 변수는 String 클래스 객체의 인스턴스에 대한 참조를 값을 가지는 변수.
		// String firstString = new String("This is");
		// 자바에서 String 클래스는 귀한 대접을 받는다...
		int primitiveIntDT = 1;
//		String firstString = "This is"; // 문자열 리터럴..
		
		 String firstString = new String("That is");
		 String secondString = new String("This is");
		
		// String secondString = new String(" a concatenated string.");
        String thirdString = " a concatenated string.";
        
        // String 클래스와
        // Number 클래스 계통의 클래스를 제외한 그 어떤 클래스에게도 + 연산(연산자 오버로딩)을 지원하지 않음
        String fourthString = firstString + thirdString;
        
        System.out.println(thirdString);

	}

}
