package com.intheeast.inheritances.polymorphism.equivalency;

public class Book extends Object{
	
	String ISBN;
    
    public Book() {}
    
    public Book(String isbn) {
    	ISBN = isbn;
    }
    
    public String getISBN() { 
        return ISBN;
    }
    
    // equals 메서드를 오버라이드함.
    // 이럴 경우,,, hashCode 메서드도 오버라이드해야함!
    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return ISBN.equals(((Book)obj).getISBN()); 
        else
            return false;
    }

}
