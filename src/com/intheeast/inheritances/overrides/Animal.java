package com.intheeast.inheritances.overrides;


public class Animal {
	
	public Animal speak() {
        System.out.println("Animal makes a sound");
        return this;
    }
	
	// static 메서드는 사실, Animal 클래스 별개다.
	public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
	
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}
