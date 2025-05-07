package com.intheeast.classes.lambda;

// 함수형 인터페이스 : Functional Interface
public interface OnlyOneAMethodInterface {
	
	// abstract class에서 추상 메서드를 선언...
	// abstract 클래스를 상속한 sub 클래스에서 추상 메서드의 바디를 구현...
	// 
	
	// JVM 입장에서는 이러한 인터페이스의 추상 메서드를 가상 메서드로 여긴다.
	// 가상 메서드, 공식 문서에는 추상 메서드
	// public abstract void check(); // 대부분 가상 메서드 선언시에, abstract를 생략함.
	// public String concate(String a, String b)  // 이 인터페이스에서 가상 메서드 선언 오로지 하나!!
	// OnlyOneAMethodInterface ooi = (a, b) -> a + b;
	
	public int add(int a, int b); /*{
		int temp = a + b;
		int ret = temp / 2;
		return ret;
	}*/
	// (a, b) -> (a + b) / 2;
	/* (a, b) -> {
		int temp = a + b;
		int ret = temp / 2;
        return ret;
	}; */
	
	public default void iamDefaultMethod() {
		System.out.println("iam default method");
	}
	
	public static void iamStaticMethod() {
		System.out.println("iam static method");
	}

}
