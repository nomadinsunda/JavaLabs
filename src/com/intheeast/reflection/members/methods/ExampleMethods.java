package com.intheeast.reflection.members.methods;

import java.util.Collection;
import java.util.List;

public class ExampleMethods<T> {
	
	void test() {
	    int y = 42;
	    Runnable r = () -> System.out.println(y);
	    r.run();
	}
	   
    public boolean simpleMethod(String stringParam, int intParam) {
        System.out.println("String: " + stringParam + ", integer: " + intParam); 
	    return true;
    }
    
    public int varArgsMethod(String... manyStrings) {
        return manyStrings.length;
    }
    
    public boolean methodWithList(List<String> listParam) {
        return listParam.isEmpty();
    }
    
    public <T> void genericMethod(T[] a, Collection<T> c) {
        System.out.println("Length of array: " + a.length);
        System.out.println("Size of collection: " + c.size()); 
    }
    
}