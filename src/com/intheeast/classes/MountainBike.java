package com.intheeast.classes;

import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;

// Implicit super constructor Bicycle() is undefined 
// for default constructor. 
// Must define an explicit constructor.
public class MountainBike extends Bicycle {	
	
	ArrayList al;
	// MountainBike 하위 클래스는 하나의 필드를 가집니다.
    private int seatHeight;
    
    //Point point;
    Polygon polygon;
    
    // 자바 컴파일러가 디폴트 컨스트럭터를 바이트 코드로 만들것임.
    /*
     MountainBike() {
     	디폴트 컨스트럭터는 우리가 작성하는 소스 코드에는 전혀 보이지 않지만,
     	바이트 코드상에서는 
     	부모 클래스의 디폴트 컨스트럭터를 호출한다!!!
     }
     */
    
    public MountainBike() {}
    
    public MountainBike(int cadence,
    		int gear,
    		int speed,
    		int seatHeight) {
    	
    	super(cadence, gear, speed);
    	
    	this.seatHeight = seatHeight;    	
    }	

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
    
//    public MountainBike() {}
//
//    // MountainBike 하위 클래스는 하나의 생성자를 가집니다.
//    public MountainBike(int startHeight, int startCadence,
//                        int startSpeed, int startGear) {
//    	// 자식 클래스가 부모 클래스의 생성자(컨스트럭터)를 상속받지 않습니다.
//        // 하지만 자식 클래스의 생성자에서 명시적으로 부모 클래스의 생성자를 호출할 수 있습니다
//    	/////////////////////////////////////////////////
////        super(startCadence, startSpeed, startGear);
//        ////////////////////////////////////////////////
//        seatHeight = startHeight;
//    }   
        
    // MountainBike 하위 클래스는 하나의 메서드를 가집니다.
//    public void setHeight(int newValue) {
//        seatHeight = newValue;
//    }   
    
//    //@Override
//    public void helloWorld() {
//    	System.out.println("MountainBike HelloWorld Method!!!");
//    }
    
    
    
    
}
