package com.intheeast.collections.collectionoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ReplaceSequenceExample {
	
	static {
		List<String> list = 
				new ArrayList<>();
		
		list.add("banana");
		list.add("apple");
		list.add("grape");
		list.add("melon");
		
		for (String str : list) {
			// modCount하고 expectedModCount 값이 동기화가 안됨...
			// 그래서 for each 구문에서 다음과 같이 remove를 할 수 없음
			//list.remove(str);
			list.set(0, "xxx");
		}
		
		list.remove(0);
		list.remove("melon");
		list.set(0, "banana");
		list.set(list.size() - 1, "melon");
	}
    public static <E> void replace(List<E> list, E val, List<? extends E> newVals) {
        for (ListIterator<E> it = list.listIterator(); it.hasNext(); ) {
            if (val == null ? it.next() == null : val.equals(it.next())) {
                it.remove();
                for (E e : newVals)
                    it.add(e);
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "banana", "date"));

        System.out.println("Before replace: " + list);

        // "banana"를 {"kiwi", "lime"} 시퀀스로 교체
        List<String> newVals = Arrays.asList("kiwi", "lime");
        replace(list, "banana", newVals);

        System.out.println("After replace: " + list);

        // null 값을 테스트하기 위해 null 값을 추가
        list.add(null);
        System.out.println("Before replace null: " + list);

        // null을 {"grape", "melon"} 시퀀스로 교체
        List<String> nullNewVals = Arrays.asList("grape", "melon");
        replace(list, null, nullNewVals);

        System.out.println("After replace null: " + list);
    }
}