package com.intheeast.comparetojs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int iamVirtualMethod(int a, int b);
		
		OnlyOneMethod oom = (a, b) -> a + b;
		
		
		int ret = oom.iamVirtualMethod(5, 6);
		
		int a = 0;

	}

}
