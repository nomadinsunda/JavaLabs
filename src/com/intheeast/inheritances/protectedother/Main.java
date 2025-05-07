package com.intheeast.inheritances.protectedother;

public class Main {

	public static void main(String[] args) {

		SubClassInOtherPackage sciop = 
				new SubClassInOtherPackage();
		
		// 다음과 같이 타패키지의 특정 클래스를 상속한 클래스의 인스턴스로
		// protected 액세스 제어자가 적용된 메서드를 사용할 수 없음.
		//sciop.helloWorld();
	}

}
