package com.intheeast.inheritances.interfaces.commonancestor;

public class Main {
	
	public void noInheritanceStaticMethodOfInterface() {
		SuperInterface.helloWorld();
		
		// 인터페이스의 정적 메서드는 상속되지 않습니다
		// :SuperInterface의 helloWorld 메서드는
		//  SubInterface에게 상속되지 않았음
		SubInterface.goodBye();
	}
	
	public void iamInstanceMethod() {
		// 다음과 같이 해당 인터페이스의 디폴트 메서드는
		// 구현체 외부에서는 사용할 수 없음
		//FlyCar.super.startEngine();
        //OperateCar.super.startEngine();
	}

	public static void main(String[] args) {

		FlyingCar fc = new FlyingCar();
		fc.startEngine();
		
		// 다음과 같이 해당 인터페이스의 디폴트 메서드는
		// 구현체 외부에서는 사용할 수 없음
		//FlyCar.super.startEngine();
        //OperateCar.super.startEngine();
	}

}
