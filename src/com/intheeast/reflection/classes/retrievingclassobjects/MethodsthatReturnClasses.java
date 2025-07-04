package com.intheeast.reflection.classes.retrievingclassobjects;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MethodsthatReturnClasses {
	
	public interface hello {
		public void helloWorld();
	}
	
	public static void main(String[] args) {
		// 주어진 클래스의 슈퍼 클래스를 리턴.
//		Class clazz = java.lang.String.class;
//		Class clazz2 = clazz.getSuperclass();
		
		Class c1 = java.lang.String.class.getSuperclass();
		
		Class<?>[] cs = Character.class.getClasses();
		for (Class clazz : cs)
		    System.out.println(clazz.getTypeName());
		
		Class<?>[] cs2 = Character.class.getDeclaredClasses();
		for (Class clazz : cs2)
		    System.out.println(clazz.getTypeName());
		
		try {
			//Modifier.PUBLIC;
			Field f = System.class.getField("out");
			Class c = f.getDeclaringClass();
			int a = 0;
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(MyClass.c);
		
		Class c = Thread.State.class.getEnclosingClass();
		
		
		return ;
	}

}

class MyClass {
    static Object o = new Object() {
        public void m() {} 
    };
    
    static Class<?> c = o.getClass().getEnclosingClass();
}
