package com.intheeast.inheritances.polymorphism.clone;

public class Person implements Cloneable {
	
	private int age;
	private Address address;
	
	public Person() {}
	
	public Person(Address address) {
		this.age = 10;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Person personClone = (Person)super.clone();
		
		Object obj = address.clone();/*person.getAddress()*/
		personClone.setAddress((Address)obj);
		
		return personClone;
		
	}
	
//	public Object copy() throws CloneNotSupportedException {
//		return this.clone();
//	}	

}
