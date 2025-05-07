package com.intheeast.inheritances;

public class SubClass extends SuperClass {
	
	public Inner inner;
	
	public void useInner() {
        this.inner = new Inner();
        inner.showSecret();  //
        
        String hello = inner.getHello();
    }

}
