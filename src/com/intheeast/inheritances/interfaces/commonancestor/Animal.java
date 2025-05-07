package com.intheeast.inheritances.interfaces.commonancestor;

public interface Animal {
	
	// 가(추)상 메서드가 없음
	
	// 단지, 디폴트 메서드만 정의!!!
	default public String identifyMyself() {
        return "I am an animal.";
    }

}
