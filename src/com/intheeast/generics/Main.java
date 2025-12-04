package com.intheeast.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	
	static {
//		List list = new ArrayList();
		List<String> list = new ArrayList<String>();
		// public interface List<E> extends Collection<E>
//		List list = new ArrayList(); // 자바에서는 이렇게 사용하지 마라 : raw type
//		list.add("hello"); // 스트링을 엘리먼트로...
//		// ArrayList의 엘리먼트 하나임...
//		Integer intV = (Integer)list.get(0); // Type mismatch: 
//		                           // cannot convert from Object to Integer
//	
		Object obj = Integer.valueOf(0);// Integer(1);
		// 다음 statement중에 (String) 코드는 타입 캐스팅(형 변환)
//		String str = (String)obj;
	    // java.lang.ClassCastException
	}
	
	
	
	public static void checkUnBoxing() {
		Box<Integer> integerBox = new Box<>();
		integerBox.set(8); // AutoBoxing..
		int number = integerBox.get(); // UnBoxing...Integer 클래스 객체의 인스턴스 메서드인
		                               // intValue 메서드를 호출하는 코드가 컴파일러에 의해 삽입됨
	}
	
	public static void checkRawType() {
		Box<String> stringBox = new Box<>();
		Box rawBox = stringBox;
//		rawBox.set(Integer.valueOf(8)); // AutoBoxing
		rawBox.set(8);
		
		// UnBoxing...
		checkUnBoxing();
		
	}
	
	// 파라미터의 아규먼트로 사용될 수 있는 값은?
	// : - 기본 데이터 타입의 값
	// : - 참조 변수의 참조 값
	public static void getObjectOfBox(Box box) {
		String str = (String) box.get();
	}
	
	public static void setObjectOfBox(Box box) {
//		Integer intV = 10;
		Double doubleV = 10.0d;
		
		box.set(doubleV);
	}
	
	public static Box createBox(){
        return new Box(); // 레거시 코드 : Box가 제너릭 클래스인데, 타입 아큐먼트를 지정을 하지 않았기 때문...
    }
	
	@SuppressWarnings("unchecked")
	public static void main(String ... args) {
		// Type safety: The expression of type Box needs unchecked conversion to conform to Box<Integer>
		Box<Integer> bi = createBox();	// createBox가 리턴하는 데이터 타입이 그냥 Box..
		
//		checkRawType();
		
		// Box<Integer> rawBox = new Box<Integer>();
		// raw type : 타입 아규먼트를 생략한...
//		Box rawBox = new Box();
		
		// 다음 스테이트먼트의 <>안에 정의된 Integer를 타입 아규먼트라 함.
		// 제너릭 클래스 인스턴스를 생성(new 연산자)할 때 타입 아규먼트를 지정
		// 텅빈 꺽쇠(타입 아규먼트를 지정하지 않음)를 일명 다이아몬드 라고 함!
		// 타입 아규먼트 추론(Inference)
//		Box<Integer> box = new Box<Integer>();
//		Box<Integer> box = new Box<>();
//		
//		setObjectOfBox(box);
//		getObjectOfBox(box);
//		
//		Pair<String, Double> pair1 = 
//				new OrderedPair<>("Hello", 3.13d);
//		
//		Pair<Integer, Integer> pair2 =
//				new OrderedPair<>(1,1);
//		
//		
//		OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());
		//////////////////////////////////////////////////
		///
//		Box<String> box2 = new Box<>();		
		
		// Pair의 첫번째 타입 아규먼트는?
		// : 제너릭 Box 클래스의 타입 아규먼트
//		Pair<Box<String>, String> pair3 = 
//				new OrderedPair<Box<String>, String>(box2, "Hello");
		
			
	}

}
