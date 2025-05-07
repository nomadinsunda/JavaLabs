package com.intheeast.inheritances;

import java.util.List;

public class BicycleMain extends SuperClass {

	public static void main(String[] args) {
		SuperClass sc1 = new SuperClass();
		// clone이 절대 아니다!!!
		SuperClass copy = sc1;

		// "is a" 다음 statement는 성립
		Object obj = new MountainBike();
		obj.equals(obj);
		
		MountainBike mb = null;
		// 하지만 다음과 같은 statement는 성립하지 않는다,
//		MountainBike mb = obj;
		
//		SuperClass sc = new SuperClass();
//		obj = sc;
		
		// 정말 나쁜 코드...
//		MountainBike mb = (MountainBike)obj;
//		mb.applyBrake(0);
		
		// 하지만, 안전 장치를 장착[obj instanceof MountainBike]하면,,,
		if (obj instanceof MountainBike) { // obj가 MountainBike 인스턴스인지 아닌지를 판별해줌.
			mb = (MountainBike)obj;
			
		} else {
			System.out.println(obj);
		}
	}

}
