package com.intheeast.classes.enums;

public class Problem {
	static String s;
	
	public String getS() {
		return Problem.s;
	}
	
	
	static class Inner {
		void testMethod() {
		   s = "Set from Inner";
		}
	}
}