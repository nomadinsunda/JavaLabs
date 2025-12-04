package com.intheeast.classes.anonymous;

public class AnonymousClassExample {
	
	public static void main(String[] args) {
        
        // 'new ParentClass("Alice") { ... }' 부분이 익명 클래스 선언 및 생성입니다.
        // ("Alice")는 ParentClass의 생성자에게 전달되는 인수로 사용됩니다.
        ParentClass anonymousObject = new ParentClass("Alice") {
            
            // 익명 클래스 내부에서 상위 클래스의 메서드를 오버라이드할 수 있습니다.
            @Override
            public void sayHello() {
                // 상위 클래스의 필드(name)에 간접적으로 접근
                System.out.println("익명 클래스입니다! " + getName() + " 이름으로 초기화되었습니다.");
                goodBye();
            }
            
            public void goodBye() {
            	System.out.println("잘 가세요");
            }
        };

        // 익명 클래스 객체의 메서드를 호출합니다.
        anonymousObject.sayHello();
        //anonymousObject.goodBye(); 새로 추가된 메서드는 익명 클래스 외부에서 호출할 수 없음!
    }

}

class ParentClass {
    private String name;

    // 인수를 받는 생성자
    public ParentClass(String name) {
        this.name = name;
        System.out.println("ParentClass 생성자 호출됨. Name: " + this.name);
    }
    
    public String getName() { 
        return this.name;
    }

    public void sayHello() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
}
