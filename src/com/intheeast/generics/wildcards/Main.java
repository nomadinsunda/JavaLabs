package com.intheeast.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import com.intheeast.generics.typeinference.sub.Box;

public class Main {	
	
	static {
		List<Box<Integer>> listThree = 
        		Collections.emptyList();
		
		List<? extends Number> lists = 
				new ArrayList<Integer>();

	}
	
	public static double sumOfList(List<? extends Number> list) {
	    Double d;
		double s = 0.0;
	    for (Number n : list)
	    	// 다음 doubleValue는 추상 메서드이므로,
	    	// Number 클래스를 상속한 하위 클래스들이 구현함
	        s += n.doubleValue();
	    return s;
	}
	
	public void processNumbers(List<? extends Number> numbers) {
	    for (Number number : numbers) {
	        System.out.println(number);
	    }
	}
	
	public static void process(List<? extends Foo> list) {
        for (Foo elem : list) {
            System.out.println("Processing: " + elem.getName());
        }
    }

    public static void main(String[] args) {
    	// <> : 다이아몬드..타입 아큐먼트를 지정해야 하는 곳인데,,,
    	//      컴파일러가 코드 문맥을 보고 타입 아규먼트를 추론(Inference)...
        List<Bar> barList = new ArrayList<>();
        
        barList.add(new Bar("Bar1"));
        barList.add(new Bar("Bar2"));
        barList.add(new Bar("Bar3"));

        process(barList); // Using the process method with a List of Bar
        
        List<String> strList = new ArrayList<>();
        strList.add("korea");
        strList.add("usa");
        strList.add("japan");
        
//        process(strList);
        
        Main main = new Main();
        
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2);        
        
        // 다음의 두 statement에서 호출하는 processNumbers 메서드에 대한
        // 아규먼트 데이터 타입에 대한 타입 검사가 수행되었고, 타입 검사에서
        // 컴파일 에러가 발생하지 않았다
        main.processNumbers(intList);
        main.processNumbers(doubleList);
        
        // 하지만 다음 호출식에서는 컴파일러가 이 메서드의 파라미터 선언에서
        // 와일드 카드 상한 제한에 맞지 않으므로
        // 컴파일 에러를 발생시켰음
//        main.processNumbers(strList);
        
        // package java.util.ArrayList
        List<Integer> li = 
        		new ArrayList<>();
        //public static <T> List<T> asList(T... a)
        // Variable Argument와 파라미터 배열은 등가임
        /*
         ArrayList(E[] array) {
            a = Objects.requireNonNull(array);
        }
         */
        // java.util.Arrays$ArrayList
//        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        
        sumOfList(doubleList);
        
        System.out.println("hello");
    }

}
