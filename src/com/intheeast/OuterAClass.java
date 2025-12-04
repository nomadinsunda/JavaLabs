package com.intheeast;

public class OuterAClass {
	// member level access modifier : public, private, protected, package-private
	private int id; // int -> 기본 데이터 타입
	private int age;
	private OuterBClass outerB = null;	
	
	static int objNumbers = 0;
	
	// 클래스 (디폴트) 생성자(컨스트럭터)
	public OuterAClass() {
		objNumbers = objNumbers + 1;
		
		this.outerB = new OuterBClass();
	}	
	
	public OuterAClass(int id, int age) {
		this();
		this.id = id;
		this.age = age;		
	}
	
	// static method!!!
	public static int getObjNumbers() {
		
		return OuterAClass.objNumbers;
	}
	
	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void iamPack() {
		System.out.println("iamPack Method");
	}	
}

class AnotherClass {
	
}


