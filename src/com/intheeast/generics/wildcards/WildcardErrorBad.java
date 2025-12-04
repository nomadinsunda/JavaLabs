package com.intheeast.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class WildcardErrorBad {
	
	public static void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
		Integer num;
		// 1st para: List<? extends Number> l1 -> List<Capture#1-of ? extends Number> l1
		// 2nd para: List<? extends Number> l2 -> List<Capture#2-of ? extends Number> l2
		
	    Number temp = l1.get(0); 
	    
	    // l1.set(int, capture#2-of ? extends Number)
	    // 2nd para의 아규먼트로 전달되는 l2.get의 리턴 값 데이터 타입은 capture#3-of ? extends Number임
	    // 그래서 파라미터 정의와 해당 파라미터의 아규먼트의 타입 불일치로 컴파일러 에러
//	    l1.set(0, l2.get(0));
	    
	    // l2.set(int, capture#4-of ? extends Number) 임
	    // 2nd para의 아규먼트로 전달되는 temp의 데이터 타입은 Number임
	    // 그래서 파라미터 정의와 해당 파라미터의 아규먼트의 타입 불일치로 컴파일러 에러.
//	    l2.set(0, temp);
	                            
	}
	
	// List<Integer>는 List<? extends Number>를 계층 구조
	public static void main(String[] args) {
		double d = 3.14d;
		int i = (int) d;		
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<Double>  ld = Arrays.asList(10.10, 20.20, 30.30);
		swapFirst(li, ld);
		
		li.equals(ld);
	}

}
