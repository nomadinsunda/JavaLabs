package com.intheeast.generics.typeinference.sub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.intheeast.generics.typeinference.Converter;

public class Main {
	
	static {
		
		// List<String> listOne = EMPTY_LIST;
	}
	
	public static void processStringList(List<String> stringList) {
        // Process stringList
        System.out.println("Processing stringList: " + stringList);
    }
	
	public static List process(List list) {
		Object obj = "Hello";
		list.add(obj); // 
		
		return list;
	}	
	
//	public static <T> List<T> process(List<T> list) {
////		Object obj = "Hello";
////		list.add(obj); // 문제가 발생함...
//		// 
//		if(list.isEmpty()) {
//			System.out.println("Empty list...");
//		}
//
//		
//		return list;
//	}	
	public static void main(String[] args) {
		// ArrayList의 타입 아규먼트를 추론할 수 없음...
		// var는 기본 데이터 타입(int, double..)과 
		// 참조 타입(String, 즉 class 또는 인터페이스) 모두 사용할 수 있음
		var result = process(new ArrayList<>());
		
        // 일반적인 사용: T와 같은 타입 전달
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox);

        // 제너릭 클래스 Box를 인스턴스화하는 코드
        // T 파라미터의 아규먼트 : Integer
        // U 파라미터의 아규먼트 : String
        // T convert(U input);
        Box<Integer> intBox = 
        		new Box<>("123", Integer::parseInt);
        
        Box<Integer> intBox2 = 
        		new Box<>("456", Integer::parseInt);
        // 제너릭 생성자 U의 타입 아규먼트는? Integer
        //public <U> Box(U input, Converter<U, T> converter) {
        //   this.value = converter.convert(input);
        //}
        System.out.println(intBox);

        // 제너릭 생성자 사용: Double → String
        // Box, T : String
        // Con, U : Double
        // T convert(U input); 
        Box<String> doubleToStringBox = new Box<>(3.14, Object::toString);
        System.out.println(doubleToStringBox);
        
        // SE 7, 8 설치해서 테스트할 수는 있는데...
        // return (List<String>) EMPTY_LIST;
        // Java SE 7 and 8: Using target type inference
        List<String> listOne = Collections.emptyList();
        System.out.println("listOne: " + listOne);
        
        // // return (List<Integer>) EMPTY_LIST;
        List<Integer> listTwo = Collections.emptyList();
        
        List<Box<Integer>> listThree = 
        		Collections.emptyList();
        
//        listThree.add(intBox);
//        listThree.add(intBox2);
//
//        // Using type argument in Java SE 7 and 8
//        List<String> listTwo = Collections.<String>emptyList();
//        System.out.println("listTwo: " + listTwo);
//
//        // Java SE 7: Type argument is required
//        processStringList(Collections.<String>emptyList()); // This works in both Java SE 7 and 8
//
//        // Java SE 8: Target type inference allows omitting type argument
//        processStringList(Collections.emptyList()); // This works in Java SE 8
    }

}
