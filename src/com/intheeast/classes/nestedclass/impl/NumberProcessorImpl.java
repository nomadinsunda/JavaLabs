package com.intheeast.classes.nestedclass.impl;

import java.util.function.Function;

import com.intheeast.classes.nestedclass.interfaces.NumberProcessor;

public class NumberProcessorImpl {
	
	public static NumberProcessor[] makeNumberProcessorImplArray() {
		// Generic의 raw type을 아직 배우지 않았음
		// 함수형 인터페이스이지만, 사실 제너릭 함수형 인터페이스
		//Function<String, String>[] arrays = new Function[3];
		
		// processores 참조 변수는 'new NumberProcessor[3]'에 의해 생성된
		// 배열을 참조하는 값을 저장하는 참조 변수입니다.
		// NumberProcessor[3] 이 배열은,
		// 각 엘리먼트가 NumberProcessor 인터페이스를 구현하는 구현체의 인스턴스에 대한 참조값을
		// 값으로 가짐.
		NumberProcessor[] processores = new NumberProcessor[3];
		
		NumberProcessor processor1 = new NumberProcessor() {

			@Override
			public int process(int x) {
				int ret = x * 2;
				return ret;
			}
			
		};
		
		NumberProcessor processor2 = new NumberProcessor() {

			@Override
			public int process(int x) {
				int ret = x - 2;
				return ret;
			}
			
		};
		
		NumberProcessor processor3 = new NumberProcessor() {

			@Override
			public int process(int x) {
				int ret = x * 4;
				return ret;
			}
			
		};
		
		processores[0] = processor1;
		processores[1] = processor2;
		processores[2] = processor3;
		
		return processores;		
	}

	public static void main(String[] args) {

		NumberProcessor[] processores = makeNumberProcessorImplArray();
		
		System.out.println("배열[0] 결과:" + processores[0].process(4));
		System.out.println("배열[1] 결과:" + processores[1].process(4));
		System.out.println("배열[2] 결과:" + processores[2].process(4));
	}

}
