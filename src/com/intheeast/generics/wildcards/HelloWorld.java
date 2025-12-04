package com.intheeast.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	
	public static void printList(List<?> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	    
	    list.add(null);
//	    list.add(10);
	}
	
	public static void main(String ...args) {
		List<Object> objList = new ArrayList<>();
		
		objList.add(new Object());
		objList.add(new Object());
		objList.add(new Object());
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		List<Double> doubleList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		printList(objList);
		printList(intList);
		printList(doubleList);
		
		List<?> wildcardList = new ArrayList<Integer>();
		
		 wildcardList.add(null);

	     // 다른 객체 삽입 시도 (컴파일 오류 발생)
	     // wildcardList.add("Hello");  // 컴파일 오류
//	     wildcardList.add(123);      // 컴파일 오류
	}

}
