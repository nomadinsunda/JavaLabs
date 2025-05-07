package com.intheeast.interfaces.sub1;

public interface SubPackageInterface {
	
	void helloWorld();
	
	private static void yyy() {
		
	}
	
	public default void xxx() {
		yyy();
	}
	
	public static final double e = 3.14;
	
	

}
