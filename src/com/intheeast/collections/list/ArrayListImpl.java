package com.intheeast.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListImpl {
	
	static {
		Set<String> c = new HashSet<>();
		c.add("1");
		c.add("2");
		c.add("1");
		/*
		 // wildcard upper bounding : Type Argument 제한...
		 public ArrayList(Collection<? extends E> c) {
	        Object[] a = c.toArray();
	        if ((size = a.length) != 0) {
	            if (c.getClass() == ArrayList.class) {
	                elementData = a;
	            } else {
	                elementData = Arrays.copyOf(a, size, Object[].class);
	            }
	        } else {
	            // replace with empty array.
	            elementData = EMPTY_ELEMENTDATA;
	        }
	    }
		 */
		List<String> list = new ArrayList<>(c);
		
		
		
	}
	
	public static void main(String[] args) {
		/*
		 public ArrayList() {
	        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	    }
		 */
		// 엘리먼트가 하나도 없는 배열[ElementData] 생성
		List<String> strList = new ArrayList<>();
		
		// 새로운 배열을 만든다:엘리먼트가 10개인 배열
		strList.add("1");
		strList.add("2");
		strList.add("3");
		strList.add("4");
		strList.add("5");
		strList.add("6");
		strList.add("7");
		strList.add("8");
		strList.add("9");
		strList.add("10");
		
		strList.add("11");

	}

}
