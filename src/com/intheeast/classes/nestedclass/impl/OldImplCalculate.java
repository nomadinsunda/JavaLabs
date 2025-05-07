package com.intheeast.classes.nestedclass.impl;

import com.intheeast.classes.nestedclass.interfaces.Calculate;

// interface를 contact[계약]라고 부르기도 합니다.
public class OldImplCalculate implements Calculate{

	//@Override : C++ 개념인데...
	public int add(int a, int b) {		
		return a + b;
	}

	//@Override
	public int subtract(int a, int b) {
		
		return a - b;
	}

	//@Override
	public int multiply(int a, int b) {
		return a * b;
	}
	
}
