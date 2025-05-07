package com.intheeast.classes.nestedclass;

import java.util.ArrayList;
import java.util.List;

import com.intheeast.classes.nestedclass.impl.NewImplCalculate;
import com.intheeast.classes.nestedclass.impl.OldImplCalculate;
import com.intheeast.classes.nestedclass.interfaces.Calculate;

public class ImplMain {	
	
//	public static void enhancedForLooping() {
//		// 배열을 for-each 흉내를 낸다...실제 iterator 인터페이스를 구현하지 않았기 때문에...
//		String[] arrays = new String[15];
//		
//		int i = 0;
//		for (String str : arrays) {
//			str = "hello world" + i++;
//		}
//	}
	
	public static void enhancedForLooping() {
		// 배열을 for-each 흉내를 낸다...실제 iterator 인터페이스를 구현하지 않았기 때문에...
		List<String> list = 
				new ArrayList<>();
		
		list.add("seoul");
		list.add("Busan");
		list.add("Deagu");
		list.add("Incheon");
		list.add("Ulsan");
		
		int i = 0;
		for (String str : list) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {

		ArrayList al;
		
		enhancedForLooping();
		
		// 추상화 개념을 사용하겠다.
		// 또한 느슨한 결합
		Calculate oldCalculate = 
				new OldImplCalculate();
		
		OldImplCalculate oldImplHelloWorld = 
				new OldImplCalculate();
		
		Calculate newCalculate = 
				new NewImplCalculate();
		
		ClientInterface clientImpl = 
				new ClientInterface();
		
		clientImpl.useCalInterface(oldCalculate);
	}

}
