package com.intheeast.classes.lambda;

import java.util.function.Function;

public class Calculator {
	 // functional interface 
    interface IntegerMath {
        int operation(int a, int b);  // 추상 메서드가 오직 하나 
    }
  
    // IntegerMath addition = (a, b) -> a + b;
    // IntegerMath op : IntegerMath 인터페이스의 구현체에 대한 참조값을 값으로 가지는 참조 변수
    // IntegerMath op = (a, b) -> a + b
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
 
    public static void main(String... args) {
    
        Calculator myApp = new Calculator();
        
        IntegerMath oriAddition = new IntegerMath() {
        	public int operation(int a, int b) {
        		return a + b;
        	}
        };
        
        myApp.operateBinary(40, 2, oriAddition);
        
        IntegerMath addition = (a, b) -> a + b;
        myApp.operateBinary(40, 2, addition);
        
        IntegerMath subtraction = (a, b) -> a - b;
        
        IntegerMath muliply = (a, b) -> a * b;
        // Function<String, String> {
        //   String apply(String t);
        Function<String, String> toUpper = (String s) -> {
        	String ret = s.toUpperCase();
        	return ret;
        };
        
        
        
        //IntegerMath divider = (int a, int b) -> a / b;
        System.out.println(
        		"40 + 2 = " +
            myApp.operateBinary(40, 2, addition)            
        );
        
        System.out.println(
        		"40 + 2 = " +
//            myApp.operateBinary(40, 2, addition));
            myApp.operateBinary(40, 2, (a, b) -> a + b)
        );
        System.out.println(
        		"20 - 10 = " +
//            myApp.operateBinary(20, 10, subtraction)); 
        	myApp.operateBinary(20, 10, (a, b) -> a - b)
        );
        System.out.println(
        		"20 * 10 = " +
//                myApp.operateBinary(20, 10, muliply));
        	myApp.operateBinary(20, 10, (a, b) -> a * b)
        );
        // 람다식의 특징...
        System.out.println("20 / 10 = " +
                myApp.operateBinary(20, 10, (a, b) -> a / b));
    }
}