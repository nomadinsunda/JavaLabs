package com.intheeast.collections.set;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class TreeSetExample {
	
	public static void findDups(String[] args) {
			
//		List<String> list = Arrays.asList(args);
//		Stream<String> stream = list.stream();
//		Set<String> distinctWords = stream.collect(Collectors.toSet());
		
		 Set<String> distinctWords = 
				 Arrays.asList(args) // -> List<String> list
				 	   .stream() // -> Stream<String> stream
				       .collect(Collectors.toSet()); 
		 
		 System.out.println(distinctWords.size()+ 
			                           " distinct words: " + 
			                           distinctWords);
	}
	
	public static <E> Set<E> removeDups(Collection<E> c) {
	    return new LinkedHashSet<E>(c);
	}
	
	
    public static void main(String[] args) {
        // 사람들의 Collection 생성
        List<Person> people = Arrays.asList(
            new Person("John"),
            new Person("Alice"),
            new Person("Bob"),
            new Person("Alice"),
            new Person("Eve"),
            new Person("Charlie")
        );
        
        Set<Person> persons = new LinkedHashSet<>(people);
        
        // TreeSet::new -> new TreeSet()
        // aggregate operations를 사용하여 TreeSet으로 수집
        // 선언형 프로그래밍
        Set<String> set = people.stream() // 리턴 값 : Stream<Person>
                                .map(Person::getName) // 리턴 값: Stream<String>
                                .collect(Collectors.toCollection(TreeSet::new));

        // TreeSet의 내용 출력 (중복 요소는 제거되며, 정렬됨)
        set.forEach(System.out::println);
    }
}