package com.intheeast.generics.typeerases;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MyNode mn = new MyNode(5);
		Node n = mn;            // A raw type - compiler throws an unchecked warning
		n.setData(5);
//		n.setData("Hello");     // Causes a ClassCastException to be thrown.
//		Integer x = mn.data;
		
		String str = "hello";
		
		if (str instanceof String) {
			System.out.println("이 객체의 타입은 String입니다");
		} else {
			System.out.println("이 객체의 타입은 String이 아닙니다");
		}
		
		Object obj = new ArrayList<String>();		
//		Object obj = new String("hello");
		
		// Type Object cannot be safely cast to List<String>
//		if (obj instanceof List<String>) { } 

		// Type safety: Unchecked cast from Object to List<String>
		if ((List<String>)obj instanceof List<String>) { } 
		
		
		if (obj instanceof List) { } // OK (raw / reifiable)
		if (obj instanceof List<?>) { } // List<?> == List<? extends Object>
		
//		Class<String> clazz = String.class;
//		Class clazz = List<String>.class;
		
		// Cannot create a generic array of List<String>
//		List<String>[] arr = new List<String>[10];
		
		// List is a raw type. References to generic type List<E> should be parameterized
		List[] rawArr = new List[10];
		rawArr[0] = new ArrayList<String>();
		rawArr[1] = new ArrayList<Integer>();
		
		rawArr[0].add("Hello");
		
		List<Integer> gotArr = rawArr[0];
		Integer realy = (Integer) rawArr[0].get(0);
		
		// Type safety: The expression of type List[] needs unchecked conversion to conform to List<String>[]
		List<String>[] rawArr2 = new List[10]; // 이게 된다고?
		rawArr2[0] = new ArrayList<String>();
		
		
//		Object o = List.of("a");
//		if (o instanceof List<String>) {     // 컴파일 에러: 
//		    // ...
//		}
//		
//		List<String>[] arr = new List<String>[1];
//		
//		
//		Object o1 = new ArrayList<String>();
//		List<String> ls = (List<String>) o1; 
		

	}

}
