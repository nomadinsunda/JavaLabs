package com.intheeast.generics.typeinference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static <T> T pick(T a1, T a2) { 
		return a2; 
	}


	public static void main(String[] args) {

//		String str;
		
		// pick를 호출하는 시점에,
		// 컴파일러가 타입 파라미터의 아규먼트 추론을 시작합니다.
		// : 타입 아규먼트 지정[Main.<Serializable>pick()]을 생략했기 때문에...
		Serializable s = Main.pick("d", new ArrayList<String>());
		
		
		List<String> list = new ArrayList<>();
		list.add("korea");
		list.add("usa");
		list.add("england");
		list.add("japan");
		String[] strs = new String[list.size()];
		// strs 상태는? 
//		<T> T[] toArray(T[] a); // 제너릭 메서드,,
//		<String> String[] toArray(String[] a);
		list.toArray(strs);
		// list.<String>toArray(strs);

		return;
	}

}
