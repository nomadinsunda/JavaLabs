package com.intheeast.classes;

import java.awt.Point;

public class Progarm {

	public static void main(String[] args) {

		int startHeight = 1;
		int startCadence = 2;
        int startSpeed = 3; 
        int startGear = 4;
        
		MountainBike mountainBike = 
				new MountainBike(startHeight,
						startCadence,
						startSpeed,
						startGear);
		
		System.out.println(mountainBike);
		// com.intheeast.classes.MountainBike@1eb44e46
		
		//mountainBike.
		
		int[] ordinates;
		ordinates = new int[5];
		
		for (int i=0; i<ordinates.length; i++) {
			ordinates[i] = i;
		}	
		
		/////////////////////////////////////////
		// 다음 배열의 element는 Point 클래스 객체의 인스턴스를 참조하는 참조값!!!
		Point[] points = new Point[5]; // 제너릭...
		for (int i=0; i<points.length; i++) {
			points[i] = new Point();
			
			points[i].x = i;
			points[i].y = i;
		}
		
		PolygonExample polygonExample = 
				new PolygonExample();
		
		polygonExample.setPoint(ordinates);
		
		// 다음 메서드에게 points라는 배열을 아규먼트로 전달하고 있다.
		polygonExample.polygonFrom(points);
		
		int x = 3;
        
        // x를 인수로 전달하여 passMethod() 호출
		polygonExample.passMethod(x);
		
		Bicycle bicycle = new Bicycle();
		polygonExample.getBicycle(bicycle);
		
		
	}

}
