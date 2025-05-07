package com.intheeast.inheritances.polymorphism.clone;

public class Address implements Cloneable {
	
	private String value;
	
	public Address() {}
	
	public Address(String add) {
		value = add;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
