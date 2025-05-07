package com.intheeast.classes.nestedclass.interfaces;

// 인터페이스도 클래스처럼 슈퍼 인터페이스를 상속할 수 있습니다.
public interface Calculate {
	public static final String HELLO = "Hello";

	// 가상 메서드 : 메서드 선언만!!! 즉, 바디가 없다!!!
	// -> 인터페이스 메서드라고도 부른다...
	public int add(int a, int b); 
	
	public int subtract(int a, int b);
	
	public int multiply(int a, int b);
	
	// 디폴트 메서드 : 메서드 정의
	public default void helloWorld3() {
		System.out.println("hello World");
	}
	
	// static 메서드 : 메서드 정의
	public static void helloWorld4() {
		System.out.println("Hello World");
	}	
}
