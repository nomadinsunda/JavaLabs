package com.intheeast.exceptions.trycatch;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class APIMisuseExample3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");

        Iterator<String> iterator = list.iterator();

        // next() 호출 전에 hasNext()를 확인해야 함
        // 하지만 강제로 두 번 next()를 호출하여 IllegalStateException 유발
        System.out.println(iterator.next());
        System.out.println(iterator.next());  // NoSuchElementException 발생
    }
}
