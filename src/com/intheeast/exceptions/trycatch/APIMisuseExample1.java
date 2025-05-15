package com.intheeast.exceptions.trycatch;

import java.util.ArrayList;
import java.util.List;

public class APIMisuseExample1 {
	
	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");

        // API 사용 잘못: 존재하지 않는 인덱스 접근
        String value = list.get(5);  // IndexOutOfBoundsException 발생

        System.out.println("value = " + value);
    }
	
//	public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Apple");
//
//        String value = null;
//        try {
//        	// API 사용 잘못: 존재하지 않는 인덱스 접근
//            value = list.get(5);  // IndexOutOfBoundsException 발생
//        } catch (IndexOutOfBoundsException e) {
//        	System.out.println(e.getMessage());
//        } finally {
//        	if (value != null)
//        		System.out.println("value = " + value);
//        	else {
//        		System.out.println("value is null!!! ");
//        	}
//        }        
//    }

}
