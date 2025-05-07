package com.intheeast.strings;

public class CompareLiteralPoolNonPool {
	
	public static void main(String ...args) {
//		String str1 = "Python"; // literal[String constant] pool in heap area
//		String str2 = new String("Python"); // in heap area : 일반적인 인스턴스임.
//		// 결국 String 클래스의 equals 메서드는 
//		// 동일한 문자열을 각각의 String 인스턴스가 가지고 있는지를...
//		boolean isEqual = str1.equals(str2);
//		
		
		/*
		 리턴값: 문자열 객체의 표준 표현을 리턴합니다.
		초기에는 비어 있는 문자열 풀은 String 클래스에 의해 비공개적으로 유지됩니다.
		
		intern 메서드가 호출될 때 equals(Object) 메서드로 확인된 대로 
		이 문자열 객체와 동일한 문자열이,
		풀에 이미 있는 경우, 풀의 문자열이 리턴됩니다. 
		그렇지 않으면 이 문자열 객체가 풀에 추가되고 이 문자열 객체에 대한 참조가 반환됩니다.
		따라서 두 문자열 s와 t에 대해 s.intern() == t.intern()은 s.equals(t)가 참일 때만 참입니다.
		모든 리터럴 문자열과 문자열 값 상수 표현식은 인턴됩니다. 
		 */

		String str = "Javapoint";
		
		String str1 = new String("Javatpoint").intern();
		
		// 현재 리터럴 풀에는 Python 스트링이 없음.
		// 그런데도 리터럴 풀에 Python 스트링이 있으면 찾아서 달라고 함.
		// : 결국은 없음...그래서 Python 스트링 인스턴스를 생성한 후,
		//   이 인스턴스를 리터럴 풀에서 관리함.
		String str2 = new String("Python").intern();
		
		String str3 = new String("Python").intern();
		
//		String str2 = new String("Javapoint");
		
		
		return;
	}

}
