package com.intheeast.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static List<?> getUnboundedList() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        return list;
    }

    public static void main(String[] args) {
        List<?> list = getUnboundedList();
        for (Object o : list) {
            System.out.println(o); // 출력: Hello
        }
    }
}
