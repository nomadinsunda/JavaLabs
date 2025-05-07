package com.intheeast.generics;

// T를 타입 파라미터라고
public class Box<T> {
	
	private T t; // object를 타입 변수

    public void set(T object) { this.t = object; }
    public T get() { return t; }
    
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        // 타입 파라미터 상한 제한으로 컴파일 타임 때 강력한 타입 검사를 실시한 
        integerBox.inspect(Integer.valueOf(0)); // 에러: 여전히 String입니다!
    }

}
