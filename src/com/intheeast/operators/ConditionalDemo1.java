package com.intheeast.operators;

public class ConditionalDemo1 {
	
	public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        
        boolean isTrue; // true 또는 false
        
        // && 연산자 : 논리 AND 연산
        // TRUE AND TRUE = TRUE
        // TRUE AND FALSE = FALSE
        // FALSE AND FALSE = FALSE
        if((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }
        
        // || 연산자 : 논리 OR 연산
        // TRUE OR TRUE = TRUE
        // TRUE OR FALSE = TRUE
        // FALSE OR FALSE = FALSE
        if((value1 == 1) || (value2 == 1)) {
            System.out.println("value1 is 1 OR value2 is 1");
        }
    }

}
