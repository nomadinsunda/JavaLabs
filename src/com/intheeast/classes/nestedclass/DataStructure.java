package com.intheeast.classes.nestedclass;

import java.util.NoSuchElementException;

public class DataStructure {
	
	// Create an array
	// 자바의 상수를 만드는 방법
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
        
        //SIZE = 0;
    }
    
    
    public void printEven() {
        
        // Print out values of even indices of the array
    	// EvenIterator 인스턴스를 생성하고 이 인스턴스 참조 변수를 사용해야 하는데,,,
    	// DataStructureIterator 인터페이스 참조 변수를 사용하고 있음.
    	DataStructureIterator iterator = this.new EvenIterator();
//    	EvenIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    /*
     * E 라는 것은 제너릭의 타입 파라미터라고 함
     public interface Iterator<E> {
    
         boolean hasNext();
    
         E next();         
    }
    */
    interface DataStructureIterator // Iterator<Integer>
                                    // Integer는 타입 아규먼트
    			extends java.util.Iterator<Integer> {
    	
    	// 가상 메서드라 함은, 메서드 선언만 존재하고 해당 선언된 메서드의 바디는 없음
    	/*boolean hasNext();
        
        Integer next();*/
    } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    // The type DataStructure.EvenIterator must implement 
    // the inherited abstract method Iterator<Integer>.next()
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {            
            // Check if the current even element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {            
            // Record a value of an index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }

}
