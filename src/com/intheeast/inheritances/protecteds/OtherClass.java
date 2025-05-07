package com.intheeast.inheritances.protecteds;

public class OtherClass {
	
	private ProtectedClass pc;
	
	public OtherClass() {
		pc = new ProtectedClass();
	}
	
	public void useHelloWorldMethodOfProtectedClass() {
		pc.helloWorld(); // protected
	}
	
	public void useGoodByeMethodOfProtectedClass() {
		pc.goodBye();  // public
	}
	
	

}
