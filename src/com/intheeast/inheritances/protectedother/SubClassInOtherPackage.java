package com.intheeast.inheritances.protectedother;

import com.intheeast.inheritances.protecteds.ProtectedClass;

public class SubClassInOtherPackage extends ProtectedClass {
	
	public SubClassInOtherPackage() {
		
	}
	
	// 상속한 클래스의 메서드에서만 사용 가능함!!!
	public void useProtctedMethod() {
		helloWorld(); // 타 패키지에서 특정 클래스의 
		              // protected 멤버를 사용하기 위해서는 해당 클래스를 상속을 해야함
		
		ProtectedClass.helloWorldStatic();
	}

}
