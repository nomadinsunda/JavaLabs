package com.intheeast.collections.collectionoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CustomList<E> extends ArrayList<E> {
	
	static {
		List<String> list = 
				new ArrayList<String>();
		
		// Forward iterable...
		// Enhanced For loop
		// For-Each loop
		for (String str : list) {
			
		}
	}
	// Name clash: The method indexOf(E) of type CustomList<E> 
	// has the same erasure as indexOf(Object) of type ArrayList<E> 
	// but does not override it	CustomList.
	// java	/JavaLabs/src/com/intheeast/collections/collectionoperations	line 8	Java Problem

	// e가 Object인데, Object.equals하고 String.equals는 다름.
    public int indexOf(Object e) {
    	// Type mismatch: cannot convert from element type E to String
//    	for (String str:this) {
//    		
//    	}
    	
    	// 그래서, 어쩔 수 없이 위의 For-Each 루프 코드 대신에
    	// 아래의 iterable 인터페이스를 구현체의 메서드를 직접 호출해서 사용
    	// (raw한 방식...)
        for (ListIterator<E> it = listIterator(); it.hasNext(); ) {
        	// e.equals(e는 Object이기 때문에)에 문제가 발생하지 않을까 싶지만,
        	// 이 equals 메서드는 String의 equals 메서드가 호출됨.
            if (e == null ? it.next() == null : e.equals(it.next())) {
                return it.previousIndex();
            }
        }
        // Element not found
        return -1;
    }

    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        String banana = new String("banana");
        System.out.println("Index of 'banana': " + list.indexOf(banana)); // 출력: Index of 'banana': 1
        System.out.println("Index of 'cherry': " + list.indexOf("cherry")); // 출력: Index of 'cherry': 2
        System.out.println("Index of 'fig': " + list.indexOf("fig"));       // 출력: Index of 'fig': -1
    }
}