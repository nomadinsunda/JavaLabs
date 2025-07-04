package com.intheeast.reflection.members.methods;

import java.lang.reflect.*;
import java.util.function.*;
import static java.lang.System.out;

public class MethodParameterSpy {
	Level lv;
    
    private static final String  fmt = "%24s: %s%n";

    // for the morbidly curious
    <E extends RuntimeException> void genericThrow() throws E {
    	
    }
    
    public static void printClassConstructors(Class c) {
        Constructor[] allConstructors = c.getConstructors();
        out.format(fmt, "Number of constructors", allConstructors.length);
        for (Constructor currentConstructor : allConstructors) {
            printConstructor(currentConstructor);
        }  
        Constructor[] allDeclConst = c.getDeclaredConstructors();
        out.format(fmt, "Number of declared constructors",
            allDeclConst.length);
        for (Constructor currentDeclConst : allDeclConst) {
            printConstructor(currentDeclConst);
        }          
    }
    
    public static void printClassMethods(Class c) {
       Method[] allMethods = c.getDeclaredMethods();
        out.format(fmt, "Number of methods", allMethods.length);
        for (Method m : allMethods) {
            printMethod(m);
        }        
    }
    
    public static void printConstructor(Constructor c) {
        out.format("%s%n", c.toGenericString());
        Parameter[] params = c.getParameters();
        out.format(fmt, "Number of parameters", params.length);
        for (int i = 0; i < params.length; i++) {
            printParameter(params[i]);
        }
    }
    
    public static void printMethod(Method m) {
        out.format("%s%n", m.toGenericString());
        out.format(fmt, "Return type", m.getReturnType());
        out.format(fmt, "Generic return type", m.getGenericReturnType());
                
        Parameter[] params = m.getParameters();
        for (int i = 0; i < params.length; i++) {
            printParameter(params[i]);
        }
    }
    
    public static void printParameter(Parameter p) {
        out.format(fmt, "Parameter class", p.getType());
        out.format(fmt, "Parameter name", p.getName());
        out.format(fmt, "Modifiers", p.getModifiers());
        out.format(fmt, "Is implicit?", p.isImplicit());
        out.format(fmt, "Is name present?", p.isNamePresent());
        out.format(fmt, "Is synthetic?", p.isSynthetic());
    }
    
    public static void main(String... args) {
    	// 현재 코드상에서는 처음으로 특정 enum 상수가 필요함
    	// 이 때 모든 enum 상수가 만들어짐.
    	Level[] levels = Level.values();
    	Level level = Level.valueOf("BASIC"); 
    	Level silver = Level.valueOf(Level.class, "SILVER");    	
    	Level basic = Level.BASIC;
    	Level what = Level.valueOf(2); 

        try {
            printClassConstructors(Class.forName(args[0]));
            printClassMethods(Class.forName(args[0]));
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }
    }
}