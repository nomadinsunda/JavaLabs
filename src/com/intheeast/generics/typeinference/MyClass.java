package com.intheeast.generics.typeinference;

public class MyClass<X> {	
			
	private X x;
	  
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
    
    public static void main(String ... args) {
    	int a = 3;
    	Integer aN = 3;
    	
    	MyClass<Number> myClass = 
    			new MyClass<>(3); // AutoBoxing...Integer 인스턴스
    	
    	myClass.setX(1);
    	System.out.println(myClass.getX());
    }
}
