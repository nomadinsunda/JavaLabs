package com.intheeast.generics.wildcards;

import java.util.List;

public class WildcardError {
	
	void foo(List<?> i) {  
		// ?get(int)
		// void set(int, E element)
		
		// i.get(0) -> Element : 알 수 없는 타입 : capture#1-of
		// i.set(0, capture#2-of)
//        i.set(0, i.get(0)); // The method set(int, capture#1-of ?) 
//                            // in the type List<capture#1-of ?> 
//                            // is not applicable for the arguments (int, capture#2-of ?)
//        
    }

}
