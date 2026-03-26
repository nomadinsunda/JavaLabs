package com.intheeast.streams;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void streamCount() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		long count = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

		System.out.println(count); // 2 (2, 4)

	}
	
	public static void streamFindFirst() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		Optional<Integer> firstEven = 
				numbers.stream()
		               .filter(n -> n % 2 == 0)
		               .findFirst();

		firstEven.ifPresent(System.out::println); // 2
	}
	
	public static void streamReduce() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		int sum = numbers.stream()
                .reduce(0, Integer::sum);

		System.out.println(sum); // 15

	}
	
	public static void streamMax() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		Optional<Integer> max =
		        numbers.stream()
		               .reduce(Integer::max);

		System.out.println("max=" + max.orElseThrow()); // 5

	}
	
	public static void streamCollect() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		List<Integer> evenNumbers =
		        numbers.stream()
		               .filter(n -> n % 2 == 0)
		               .collect(Collectors.toList());
		
//		Set<Integer> numberSet =
//		        numbers.stream()
//		               .collect(Collectors.toSet());


		System.out.println("collect:" + evenNumbers); // [2, 4]

	}
	
	

	public static void main(String[] args) {
		streamCollect();
		
		streamMax();
		
		streamReduce();
		
		streamCount();
		
		List<Integer> list = List.of(1, 2, 3, 4);
		Stream<Integer> stream = list.stream(); // 데이터 저장 X

//		for (int i : list) {
//		    System.out.println(i);
//		}
//		
		System.out.println("#######################################");

//		stream.forEach(System.out::println);
		
		Stream<Integer> streams = stream.filter(x -> x > 2)
										.map(x -> x * 2);
		
		List<Integer> subList = streams.toList();
		
		for (Integer obj : subList) {
			System.out.println(obj);
		}
		
		int x = 0;
	}

}
