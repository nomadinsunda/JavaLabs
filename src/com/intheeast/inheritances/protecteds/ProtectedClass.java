package com.intheeast.inheritances.protecteds;

public class ProtectedClass {

	public enum GENDER {
		MALE, FEMALE
	}
	
	private int age;
	private String name;
	private GENDER gender;
	
	public ProtectedClass() {
		
	}
	
	public ProtectedClass(int age, String name) {
		super();
		
		this.age = age;
		this.name = name;
	}
	
	protected String helloWorld() {
		return "Hello World";
	}
	
	public String goodBye() {
		return "Good Bye";
	}
	
	protected static String helloWorldStatic() {
		return "Static Hello World";
	}
	
}
