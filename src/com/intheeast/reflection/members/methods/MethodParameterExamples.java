package com.intheeast.reflection.members.methods;

import java.lang.reflect.*;
import java.util.function.*;
import static java.lang.System.out;

public class MethodParameterExamples {
    
    public class InnerClass<T> {
    	
    	public Constructor<T> 
    		getConstructor(Class<?>... parameterTypes) {
    		return null;
    	
    	}
    	
//    	public Constructor<T> 
//			getConstructor(Class<?>[] parameterTypes) {
//    		return null;
//    	}
	
	
    	// 컴파일러가 다시 정의하는 디폴트 컨스트럭터에는
    	// 파라미터 this$0가 생성(Implicit)
    	public InnerClass() {
    		MethodParameterExamples outerClass = 
    				MethodParameterExamples.this;
    	}
    }
    
    enum Colors {
        RED, WHITE;
    	/* 컴파일러가 Colors를 다음과 같은 클래스로 컴파일 타임때 생성함!
    	 final class Colors extends java.lang.Enum<Colors> {
		    public final static Colors RED = new Colors("RED", 0);
		    public final static Colors BLUE = new Colors("BLUE", 1);
		 
		    private final static Colors[] values = new Colors[]{ RED, BLUE };
		 
		    // 다음 컨스트럭터는 implicit하게 컴파일러에 의해 생성되고
		    // 다음 컨스트럭터의 두 파라미터는 합성(synthetic) 파라미터라고 함
		    private Colors(String name, int ordinal) {
		        super(name, ordinal);
		    }
		 
		    public static Colors[] values(){
		        return values;
		    }
		 
		    public static Colors valueOf(String name){
		        return (Colors)java.lang.Enum.valueOf(Colors.class, name);
		    }
		}
    	 */
    }
    
    public static void main(String... args) {
    	String str;
    	Comparable cp;
        out.println("InnerClass:");
        MethodParameterSpy.printClassConstructors(InnerClass.class);
        
        out.println("enum Colors:");
        MethodParameterSpy.printClassConstructors(Colors.class);
        MethodParameterSpy.printClassMethods(Colors.class);
    }
}