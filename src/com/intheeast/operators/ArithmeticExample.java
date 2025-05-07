package com.intheeast.operators;

public class ArithmeticExample {

	public static void main(String[] args) {

		int a = 5, b = 10, c = 0;
        boolean x = true, y = false;
        
        // multiplicative
        int mul = a * b;
        int div = b / a; // 나눗셈 연산자 : 몫
        int mod = b % a; // 나머지 연산자 : 나머지
        System.out.println("multiplicative: * = " + mul + ","
        		+ " / = " + div + ", % = " + mod);

        // additive
        int add = a + b;
        int sub = b - a;
        System.out.println("additive: + = " + add + ", - = " + sub);
	}

}
