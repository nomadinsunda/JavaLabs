package com.intheeast.exceptions.trycatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    
//    public void writeList() {
//        PrintWriter out = null;
//
//        try {
//        	
//            System.out.println("Entering try statement");
//            // Project Root 디렉토리에 OutFile.txt를 두면,
//            // 다음과 같이 상대 경로를 사용할 수 있다.
//            out = new PrintWriter(new FileWriter("OutFile.txt"));
//        
//            for (int i = 0; i < SIZE; i++)
//                out.println("Value at: " + i + " = " + list.get(i));
//            
//        } catch (IndexOutOfBoundsException e) {
//        	
//            System.err.println("Caught IndexOutOfBoundsException: " +
//                                 e.getMessage());
//            
//        } catch (IOException e) {
//        	
//            System.err.println("Caught IOException: " + e.getMessage());
//            
//        } finally {
//            if (out != null) {
//                System.out.println("Closing PrintWriter");
//                out.close();
//            } else {
//                System.out.println("PrintWriter not open");
//            }
//        }
//    }
    
    public void writeList() throws IOException{
        PrintWriter out = null;

        System.out.println("Entering try statement");
        // Project Root 디렉토리에 OutFile.txt를 두면,
        // 다음과 같이 상대 경로를 사용할 수 있다.
        // FileWriter는 Checked Exception!!!
        out = new PrintWriter(new FileWriter("OutFile.txt"));
    
        for (int i = 0; i < SIZE; i++)
            out.println("Value at: " + i + " = " + list.get(i));
        
    }
    
    public void readList() {
        BufferedReader in = null;

        try {
            System.out.println("Entering readList method");
            in = new BufferedReader(new FileReader("OutFile.txt"));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("Read line: " + line);
            }
        } catch (IOException e) {
            System.err.println("Caught IOException while reading: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    System.out.println("Closing BufferedReader");
                    in.close();
                } catch (IOException e) {
                    System.err.println("Caught IOException while closing: " + e.getMessage());
                }
            } else {
                System.out.println("BufferedReader not open");
            }
        }
    }

    public static void main(String[] args) throws IOException {
    	ListOfNumbers listOfNumbers = 
    			new ListOfNumbers();
    	
    	listOfNumbers.writeList();
    	listOfNumbers.readList();
    	
    }
}