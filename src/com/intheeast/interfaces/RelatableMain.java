package com.intheeast.interfaces;

import java.awt.Point;

public class RelatableMain {
	
	public static void premitiveTypeCast() {
		
		int a = 10;
		double b = (double)a;
		
		double c = 3.14f;
		int d = (int)c;
		
		// 다음 코드는 C++에서는 되지만,
		// 자바에서는 되지 않음!
//		int e = 1;
//		boolean f = (boolean)e;
		
		//unsigned int x;
		
		int value = -1;
		// -1 값을 구하려면,
		// 정수 1에 2의 보수를 취하면 그것이 -1임.
		// 1의 보수 : 0b11111111_11111111_11111111_11111110
		// 2의 보수 : 0b11111111_11111111_11111111_11111111
		long unsigned = Integer.toUnsignedLong(value);
		
		return ;
		
	}
	
	public static void main(String ...args) {
		
		premitiveTypeCast();
		
		Point aPoint = new Point(50, 50);
		// Relatable relatableA 의 의미는
		// Relatable 인터페이스를 구현한 구현체[클래스]의 객체의 인스턴스에 대한 참조값을 저장함
		Relatable relatableA = new RectanglePlus(aPoint, 200, 100);
		Relatable relatableAT = new TrianglePlus(aPoint, 200, 100);
		
		Point bPoint = new Point(50, 50);
		Relatable relatableB = new RectanglePlus(bPoint, 300, 200);
		Relatable relatableBT = new TrianglePlus(bPoint, 300, 200);
		
		Point cPoint = new Point(100, 100);
		Relatable relatableC = new RectanglePlus(cPoint, 400, 400);
		Relatable relatableCT = new TrianglePlus(cPoint, 400, 400);
		
		Point dPoint = new Point(200, 200);
		Relatable relatableD = new RectanglePlus(dPoint, 400, 400);
		Relatable relatableDT = new TrianglePlus(dPoint, 400, 400);
		
		// Object 클래스는 자바의 클래스 계층 구조의 최상위 클래스임
		// 자바의 모든 클래스는 Object 클래스를 부모 클래스로 가지고 있음.
		Object largestObject = 
				// findLargest(Object object1, Object object2)
				ClientRelatbleInterface.findLargest(relatableA, relatableB);
		
		Object smallestObject = 
		ClientRelatbleInterface.findSmallest(relatableA, relatableB);
		
		if(ClientRelatbleInterface.isEqual(relatableC, relatableD))
			System.out.println("relatableC is more Bigger");
		else 
			System.out.println("relatableD is more Bigger");
		
		Object largestObjectT = 
				// findLargest(Object object1, Object object2)
				ClientRelatbleInterface.findLargest(relatableAT, relatableBT);
		
		Object smallestObjectT = 
		ClientRelatbleInterface.findSmallest(relatableAT, relatableBT);
		
		if(ClientRelatbleInterface.isEqual(relatableCT, relatableDT))
			System.out.println("relatableCT is more Bigger");
		else 
			System.out.println("relatableDT is more Bigger");
		
		////////////////////////////////////////////////////////////////////////
		///		
		UsingRelatableInteface usingRelatableInteface = 
				new UsingRelatableInteface();
		
		usingRelatableInteface.findLargest(relatableA, relatableB);
		usingRelatableInteface.findSmallest(relatableA, relatableB);
		if(usingRelatableInteface.isEqual(relatableC, relatableD))
			System.out.println("relatableC is more Bigger");
		else 
			System.out.println("relatableD is more Bigger");
		
		return ;
	}

}
