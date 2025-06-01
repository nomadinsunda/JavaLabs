package com.intheeast.reflection.classes.retrievingclassobjects;

public class ClassforName {
	
	java.util.concurrent.ConcurrentNavigableMap cnp;

	public static void main(String[] args) {
		Void voidClass;
		//String str = Void.TYPE;
		Class c = null;
		try {
			c = Class.forName("com.intheeast.reflection.classes.retrievingclassobjects.MyLocaleServiceProvider");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class cDoubleArray = null;
		try {
			cDoubleArray = Class.forName("[D");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class cStringArray = null;
		try {
			cStringArray = Class.forName("[[Ljava.lang.String;");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ;

	}

}
