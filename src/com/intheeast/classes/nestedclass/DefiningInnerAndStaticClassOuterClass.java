package com.intheeast.classes.nestedclass;

public class DefiningInnerAndStaticClassOuterClass {
	
	/*private*/ String outerField = "Outer field";
	
	// 다음 필드는 static 제어자가 적용되어 있음...static field
    static String staticOuterField = "Static outer field";
    
//    public static void accessFieldOfOuterClass() {
////    	this.outerField = 0;
//    	staticOuterField = "hello";
//    }

    // StaticNestedClass 객체 참조 변수
    // static nested class인 StaticNestedClass 클래스 객체의 인스턴스에 대한 참조 변수
    StaticNestedClass staticNestedInstance;

    public DefiningInnerAndStaticClassOuterClass() {
        // StaticNestedClass 인스턴스를 생성하여 필드에 저장
        staticNestedInstance = new StaticNestedClass();
    }

    // non-static nested class
    class InnerClass {
        void accessMembers() {
        	// InnerClass의 인스턴스 메서드는 다음과 같이
        	// Outer class의 인스턴스 필드와 static 필드를 액세스할 수 있음.
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    // static nested class
    static class StaticNestedClass {
        // 외부 클래스의 필드는 오직 외부 클래스 객체 참조를 통해서만 사용할 수 있습니다
        void accessMembers(DefiningInnerAndStaticClassOuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            // field outerField
        	// Outer class의 인스턴스 필드를 액세스할 수 없음.
//          System.out.println(outerField);
        	// 이것이 왜 가능하지???...
            System.out.println(outer.outerField);
            
            // 단, Outer class의 static field는 액세스할 수 있음.
            System.out.println(staticOuterField);
        }
    }

    // StaticNestedClass의 메서드를 호출하는 메서드
    public void callStaticNestedMethod() {
        staticNestedInstance.accessMembers(this);
    }
}
