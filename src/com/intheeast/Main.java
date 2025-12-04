package com.intheeast;

// Top Level Access(접속) Modifier(제어자) : public, package-private
// public : Top Level Access(접속) Modifier(제어자)
//          이러한 단어를 자바의 예약된 키워드라고 함
public class Main { // Package-Private
	
	// Member Level Access Modifier : public, private, protected, package-private
	// Field : 객체의 상태	
	private int a;
	
	// Method(일명 멤버함수) : 객체의 행동(클래스의 Member) 
	// 자바 가상머신이 이 main 메서드를 호출합니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		
		int y = 2;
		float z = 0.5f;
		int argu = x + y;
		int ret = yfunction(argu);
//		int ret = yfunction(3); // 3은 literal..literal이란 코드로 작성한 값!!!
		
		System.out.println("프로그램이 종료됩니다");
		
		// OuterAClass 클래스의 객체를 만드는 방법
		// OuterAClass() : 클래스의 객체 생성자(컨스트럭터)
		OuterAClass outerA = new OuterAClass(1,2);
//		outerA.objNumbers = 1; //outerA.hello = 1;
		
		OuterAClass outerB = new OuterAClass(2,3);

		OuterAClass outerC = new OuterAClass(3,4);
		
		int age = outerA.getAge();
		
		// OuterAClass 클래스의 객체를 생성하지 않고도 OuterAClass 클래스의
		// static 메서드인 getObjNumbers를 사용할 수 있음
		// 이런 static 메서드는 타 클래스들에게 Helper 또는 Utility 목적으로 사용된다.
		int objNumbers = OuterAClass.getObjNumbers();
		
		outerA.iamPack();
		
		OuterAClass.objNumbers = 7;	
		
		// outerAClass 변수는 값으로 참조(객체에 대한 참조)를 가집니다
		
	}  // 호출자인 가상머신으로 main 메서드가 리턴함...
	
	// y = x + b, 단 b는 3이다
	// int x : yfunction 메서드의 파라미터 변수
	public static int yfunction(int x) { // x = 3;
		// 변수 선언과 초기화라고 함.
		// 변수를 선언할 때 데이터 타입을 지정 : int
		// 변수는 고유한 이름을 가집니다 : b,,, 그런데 고유하다라는 의미는
		//                       이 메서드내에서 고유하다라는 의미!
		// 변수는 다양한 값을 가질 수 있습니다 : 3,,, 단, 정수 값만!!!
		int b; // yfunction 메서드의 지역(local) 변수
		b = 3;	
	
		return x + b; // x나 b나 소속은 yfunction 메서드입니다.
	}

}
