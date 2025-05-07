package com.intheeast.inheritances.protectedother;

import com.intheeast.inheritances.protecteds.ProtectedClass;

public class ClassInOtherPackage {
	
	private ProtectedClass pc;
	
	public ClassInOtherPackage() {
		pc = new ProtectedClass();
	}
	
	public void useGoodByeOfProtectedClass() {
		pc.goodBye();
	}
	
	public void useHelloWorldOfProtectedClass() {
		//pc.helloWorld(); // 현재 ClassInOtherPackage 클래스 입장에서는
		                   // helloWorld 메서드의 액세스 제어자는 마치 Package-Private으로
		                   // 선언된 것 같다...하지만,,,
		
	}
	
	

}
