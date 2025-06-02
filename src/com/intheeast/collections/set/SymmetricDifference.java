package com.intheeast.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	
	public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("apple");
        s1.add("banana");
        s1.add("cherry");

        Set<String> s2 = new HashSet<>();
        s2.add("banana");
        s2.add("date");
        s2.add("fig");

        // 대칭 차집합을 계산
        Set<String> symmetricDiff = new HashSet<>(s1);
        symmetricDiff.addAll(s2);
        Set<String> tmp = new HashSet<>(s1);
        tmp.retainAll(s2);
        symmetricDiff.removeAll(tmp);

        // 결과 출력
        System.out.println("대칭 차집합: " + symmetricDiff);
    }

}
