package com.intheeast.collections.collectionoperations;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;

public class IterateBackwardSample {
    public static void main(String[] args) {
    	
    	// java.util.Arrays$ArrayList
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        
        // java.util.ArrayList
        List<String> lists = new ArrayList<>(list);

        // element를 역순으로 가져오기 위해서,
        // ListItr을 생성할 때, cursor 값을 리스트 사이즈(list.size())로 설정함
        // :Iterator에서 cursor는 elememt의 인덱스를 가리킴
        // hasNext/next가 hasPrevious와 previous를 사용함.
        for (ListIterator<String> it = 
        		list.listIterator(list.size()); it.hasPrevious(); ) {
            String t = it.previous();
            System.out.println(t);
        }
    }
}