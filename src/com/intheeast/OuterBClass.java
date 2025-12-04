package com.intheeast;

public class OuterBClass {
	
	// 필드의 데이터 타입은 int...
	// 두 개의 필드를 선언하시고
	// 각 필드이 getters, setters를 만드세요
	private int phoneNumber;
	private int address;
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		// Variable Shadowing Problem
		this.phoneNumber = phoneNumber;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
}
