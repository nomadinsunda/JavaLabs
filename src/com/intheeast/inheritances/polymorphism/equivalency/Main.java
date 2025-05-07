package com.intheeast.inheritances.polymorphism.equivalency;

import java.util.ArrayList;

public class Main {
	
	public static void equalAndHashCode() {
		// Person 객체 생성
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Jane", 30);

        // hashCode 메서드 사용 예제
//        System.out.println("HashCode of person1: " + person1.hashCode());
//        System.out.println("HashCode of person2: " + person2.hashCode());
//        System.out.println("HashCode of person3: " + person3.hashCode());

        // equals 메서드 사용 예제
        System.out.println("person1 equals person2: " + person1.equals(person2)); // true
        System.out.println("person1 equals person3: " + person1.equals(person3)); // false

        // Person 객체를 HashSet에 저장하여 중복 제거 예제
        java.util.HashSet<Person> personSet = new java.util.HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("Number of unique persons: " + personSet.size()); // 2 (person1과 person2는 동일한 객체로 간주)
    }
	
	// 동등성
	public static void checkEquivalency() {
		Book firstBook  = new Book("0201914670");
		Book secondBook = new Book("0201914670");
		// Book 클래스의 equals(Object 클래스의 equals을 오버라이드한 메서드) 메서드를
		// 호출함
		if (firstBook.equals(secondBook)) {
		    System.out.println("objects are equal");
		} else {
		    System.out.println("objects are not equal");
		}
	}
	
	// 동일성
	public static void checkEqual() {
		Book book = new Book();
		Book isSame = book;
		
		// Object 클래스의 equals 메서드를 호출하는 상황.
		// 즉, 아직 Book 클래스에 equals을 오버라이드하지 않았음.
		boolean ret = book.equals(isSame);
		
		return;
	}

	public static void main(String[] args) {

		//checkEqual();
		
//		checkEquivalency();
		
		equalAndHashCode();
	}

}
