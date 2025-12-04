package com.intheeast.classes.lambda;

import java.util.function.Function;

public class MethodRefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> func1 = (String s) -> s.toUpperCase();		
		
		// R apply(T t);
		// T : String
		// R : String
		// String apply(String t);
		Function<String, String> func2 = 
				// "String toUpperCase()" --> Empty Parameter
				String::toUpperCase; // 인스턴스 메서드
		
		// apply의 파라미터가 toUpperCase 인스턴스 메서드의 인스턴스가 됨
		String upperStr1 = func1.apply("hello");
		
		String upperStr2 = func2.apply("world");
		
		String concat = upperStr1 + upperStr2;

	}

}
