package com.intheeast.reflection.members.fields;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FieldSpy<T> {
    public boolean[][] b = {{ false, false }, { true, true } };
    public String name  = "Alice";
    public List<Integer> list;
    public T val;
    Object obj;
    ArrayList lis;
    java.lang.reflect.Modifier x;

    public static void main(String... args) {
		try {
		
		    Class<?> c = Class.forName(args[0]);
		    Field f = c.getField(args[1]);
		    System.out.format("Type: %s%n", f.getType());
		    // If the declared type of the field is a parameterized type,
		    // the Type object returned must accurately reflect the actual type arguments 
		    // used in the source code. 
		    System.out.format("GenericType: %s%n", f.getGenericType());
	
	        // production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
		    x.printStackTrace();
		} catch (NoSuchFieldException x) {
		    x.printStackTrace();
		}
    }
}