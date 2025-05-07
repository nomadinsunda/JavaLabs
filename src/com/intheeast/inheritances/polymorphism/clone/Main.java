package com.intheeast.inheritances.polymorphism.clone;

public class Main {
	
	public static void main(String ... args) throws CloneNotSupportedException {
		
		//Object obj;
		
		Address addr = new Address("Seoul");
	
		Person person = new Person(addr);
		
		// shallow clone
		Person personClone = (Person) person.clone();
		
		return ;
		
	}

}
