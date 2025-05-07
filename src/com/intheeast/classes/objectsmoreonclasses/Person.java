package com.intheeast.classes.objectsmoreonclasses;

public class Person {
	
	private String name = "unknown";
	private int age = 0;
	private String gender = "unknown";
	private String city = "unknown";
	private String phoneNumber = "unknown";
	
	// 자바의 상수(constant variable)
	public static final int HELLO = 1;
	
	public Person() {
		System.out.println("hello world");
		//this("unknown", 0, "unknown", "unknown", "unknown");
	}

	public Person(String name, int age, String gender, String city, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static void helloWorld() {
		System.out.println("Hello World");
	}

}
