package com.intheeast.inheritances.interfaces.commonancestor;

public interface FlyCar {
	
	default public int startEngine() {
        return 0;
    }

}
