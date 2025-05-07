package com.intheeast.inheritances.interfaces.commonancestor;

public class Dragon implements EggLayer, FireBreather {

	// FireBreather는 Dragon 디폴트 메서드를 제공
	// : 사실상, Animal 인터페이스의 identifyMyself 디폴트 메서드를 제공
	
	// EggLayer는 Dragon 디폴트 메서드를 제공
	// : EggLayer 또한 Animal 인터페이스를 상속함. 즉 identifyMyself 디폴트 메서드를 상속함
	//   그런데, EggLayer는 이 디폴트 메서드를 오버라이드함
	
	
	public static void main (String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}
