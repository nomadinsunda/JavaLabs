package com.intheeast.classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Class1 {
	
	String str;
	ArrayList al;
	LocalDateTime dt;
    protected InnerClass1 ic;

    // Outer class의 컨스트럭터에서
    // Inner class 인스턴스를 생성할 수 있다!!!
    public Class1() {
    	ic = new InnerClass1();
    }

    public void displayStrings() {
    	System.out.println(ic.getString() + ".");
    	System.out.println(ic.getAnotherString() + ".");
    }   

    protected class InnerClass1 {
		public String getString() {
		    return "InnerClass1: getString invoked";
		}
	
		public String getAnotherString() {
		    return "InnerClass1: getAnotherString invoked";
		}
    }
    
    static public void main(String[] args) {
        Class1 c1 = new Class1();
        c1.displayStrings();
    }
}