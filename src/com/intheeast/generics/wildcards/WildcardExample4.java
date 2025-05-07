package com.intheeast.generics.wildcards;

import java.util.List;

public class WildcardExample4 {
	
	// 절대 Unbounded Wildcard 배열을 쓰지 마세요!!!
	public static List<?>[] getWildcardArray() {
        List<?>[] arr = new List<?>[2];
        arr[0] = List.of("One", "Two");
        arr[1] = List.of(1, 2, 3);
        // ...
        // ...
        // ...
        
        
        return arr;
    }

	// 변수 : variable -> 다양한 값을 저장할 수 있다.
	// String ...args : variable argument...: 아규먼트 개수가 다양하다...
    public static void main(String[] args) {
        for (List<?> l : getWildcardArray()/*List<?>[]*/) {
            System.out.println(l);
        }
    }

}
