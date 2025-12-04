package com.intheeast.generics;

// Box 클래스를 제너릭 클래스
// T를 제너릭 '타입 파라미터'라고
// 타입 파라미터는 알파벳 대문자 하나로 정의
// T, E, S...
// Box<String> box = new Box<String>();
// Box<Person> box = new Box<Person>();
public class Box<T> { // T의 타입 파라미터의 타입 아규먼트로 String 클래스로 지정하면,
	                  // 클래스 내부의 타입 변수 T는 "컴파일 타임"때만 String으로 대체됨
	
	private T t; // object를 타입 변수

    public void set(T object) { this.t = object; }
    public T get() { return t; }
    
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    
    
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
    
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        // 타입 파라미터 상한 제한으로 컴파일 타임 때 강력한 타입 검사를 실시한 
        integerBox.inspect(Integer.valueOf(0)); // 에러: 여전히 String입니다!
    }

}
