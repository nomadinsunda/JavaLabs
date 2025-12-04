package com.intheeast.generics.wildcards.captures;

import java.util.ArrayList;
import java.util.List;

public class Main {
	// 자기 참조적 연산 지원 (Self-Referential Operations)
	/*
	void foo(List<?> i) {
		// para인 List<?> i -> List<capture#1-of ?>
		
		
		// List<capture#1-of ?> set(int index, List<capture#1-of ?> element);
		// E get(int index);
		
		// The method set(int, capture#1-of ?) in the type List<capture#1-of ?> 
		// is not applicable for the arguments (int, capture#2-of ?)
		// i.get(0)이 리턴하는 값의 데이터 타입은 ?
		// i.get(0)의 리턴값 -> capture#2-of ?
		// 첫번째 엘리먼트를 첫번째 엘리먼트로 설정
        i.set(0, i.get(1)); // The method set(int, capture#1-of ?) 
                            // in the type List<capture#1-of ?> 
                            // is not applicable for the arguments (int, capture#2-of ?)        
    }
    
    void foo(List<?> i) {
    	i.set(0, i.get(1));
    }
    */
	
	void foo(List<?> i) {
		// List<?> i -> List<capture#1-of ?> : 임시 또는 일시적인 새로운 타입을 만듦(컴파일러에 의해서)
		// List<capture#1-of ?> -> T(타입 파라미터의 타입 아규먼트로 사용됨)
        fooHelper(i);
    }

    // Helper method created so that the wildcard can be captured
    // through type inference.
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(1)); // 테스트를 위해 0번째 엘리먼트를 1번째 엘리먼트로 set하는 코드로 변경함
    }
	
	
	
	
	
	static void reverse(List<?> list) {
        reverseImpl(list);   // ✔ 캡처 변환 적용됨
    }

    private static <T> void reverseImpl(List<T> list) { }
    
	
	public static void notCastingToCaptureVariable() {
		List<?> list = List.of("a", "b");
		// List<?> list -> List<capture#1-of ?>
		
		// Type safety: Unchecked cast from List<capture#1-of ?> to List<String>
        List<String> s = (List<String>) list;   
	}
	
	// List<? extends Number> -> List<capture#1-of> to List<T> from
	// List<? super Number> -> List<capture#2-of ? super Number> to List<T> to
	//public static <T> void copy(List<? extends Number> src, List<? super Number> dst) {
	public static <T> void copy(List<T> src, List<T> dst) {

		// 
	}

	public static void main(String[] args) {
		List<? extends Number> src = new ArrayList<Integer>();
		List<? super Number> dst = new ArrayList<Number>();
		// The method copy(List<T>, List<T>) in the type Main 
		// is not applicable 
		// for the arguments (List<capture#1-of ? extends Number>, List<capture#2-of ? super Number>)
//		copy(src, dst);

	}

}
