package com.intheeast.generics.typeinference;

import java.util.function.Function;

public class MyClass<X> {	
			
	private X x;
	  
	// 타입 파라미터 상한 제한(Upper Bounded) 설정
    <T extends X> MyClass(T t) {    
    	System.out.println(t);
    	this.x = t;
    }
    
    public void setX(X x) {
    	this.x = x;
    }
    
    public X getX() {
    	return this.x;
    }
    
    public static void testMethodRef() {
    	// Function<T, R>
    	// -> R apply(T t);
//    	Function<String, Integer> f = (num) -> {
//    		// Integer.parseInt 메서드의 리턴값 데이터타입이 int임
//    		// 그런데, Function 인터페이스의 R 파라미터에 대한 아규먼트는 Integer로 선언
//    		// : 이게 가능한가?
//    		return Integer.parseInt(num);
//    	};
    	
    	// int parseInt(String) : static 메서드임
    	// Integer apply(String t)
    	Function<String, Integer> f = Integer::parseInt;    	
    	
    	int ret = f.apply("10");
    	
    	int a = ret;
    }
    
    public static void main(String ... args) {
    	int a = 3;
    	Integer aN = 3;
    	
    	testMethodRef();
    	
    	String number = "10";
    	int num = Integer.parseInt(number);
    	
//    	Integer intNumber = Integer.valueOf(3);
    	
    	MyClass<Number> myClass = 
    			new MyClass<>(3); // AutoBoxing...Integer 인스턴스
    	
    	String str = new String("Hello World");
    	MyClass<String> myClass2 = 
    			new MyClass<>("Hello World"); // AutoBoxing...Integer 인스턴스
    	
    	myClass.setX(1);
    	System.out.println(myClass.getX());
    }
}
