package com.intheeast.generics;

import java.util.function.Consumer;

// 신택스 에러는 아님!!
public class NaturalNumber<T extends Integer> {

	
    private T n;

    public NaturalNumber(T n)  { 
    	this.n = n; 
    }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

    // ...
    
    public static void main(String[] args) {
    	NaturalNumber<Integer> intG = new NaturalNumber<>(0);
    	
    }
}