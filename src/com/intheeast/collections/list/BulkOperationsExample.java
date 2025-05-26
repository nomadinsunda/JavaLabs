package com.intheeast.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperationsExample {
	
	public static void main(String[] args) {
        // 기본 리스트 생성
        List<String> targetList = 
        		new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));

        // containsAll 예제
        List<String> listToCheck = Arrays.asList("apple", "banana");
        boolean containsAllResult = targetList.containsAll(listToCheck);
        System.out.println("containsAll result: " + containsAllResult); // true

        // addAll 예제
        // String bae = new String("bae");
        List<String> listToAdd = Arrays.asList("grape", "honeydew", "bae");
        targetList.addAll(listToAdd);
        System.out.println("After addAll: " + targetList); // [apple, banana, cherry, date, fig, grape, honeydew]

        //targetList.remove(0);
//        String bae = "bae";
        String bae = new String("bae");
        if (bae.equals(targetList.get(7))) 
        	System.out.println("값이 동등함");
        targetList.remove(bae);
        
        // removeAll 예제
        List<String> listToRemove = Arrays.asList("apple", "fig");
        targetList.removeAll(listToRemove);
        System.out.println("After removeAll: " + targetList); // [banana, cherry, date, grape, honeydew]

        // retainAll 예제
        List<String> listToRetain = Arrays.asList("banana", "date");
        targetList.retainAll(listToRetain);
        System.out.println("After retainAll: " + targetList); // [banana, date]

        // clear 예제
        targetList.clear();
        System.out.println("After clear: " + targetList); // []
    }

}
