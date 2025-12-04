package com.intheeast.exceptions.puttingitalltogether;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    // 생성자에서 리스트 초기화
    public ListOfNumbers() {
        list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    // 주어진 writeList 메서드
    @SuppressWarnings("unused")
	public void writeList() /*throws IOException, IndexOutOfBoundsException*/ {
    	String fileName = "OutFile.txt";
        PrintWriter out = null;        
        System.out.println("Entering try statement");
        int i = 0;
        
        FileNotFoundException ffe;
        
        try {
        	out = new PrintWriter(new FileWriter(fileName));
        
            for (; i < SIZE; i++) {
        		Integer elem = 0;        	
        		elem = list.get(i);        	
        		out.println("Value at: " + i + " = " + elem);
        	}
       
        	if (out != null) {
        		System.out.println("Closing PrintWriter");
        		out.close();
        	} else {
        		System.out.println("PrintWriter not open");
        	}        
        } catch(IOException e) {
    		System.out.println(fileName + " is WRONG File Name " + e.getMessage());        	
        } catch(NullPointerException e) {
        
        } catch(IndexOutOfBoundsException e) {
    		System.out.println(i + " is WRONG index " + e.getMessage());        	
        } finally {
        	// ...
        }
        
    }

//    public static void main(String[] args) {
//        ListOfNumbers lon = new ListOfNumbers();
//        try {
//			lon.writeList();
//		} catch (IndexOutOfBoundsException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//        System.out.println("main return...");
//    }
    
    public static void main(String[] args) /*throws IndexOutOfBoundsException, IOException*/ {
        ListOfNumbers lon = new ListOfNumbers();        
        
        lon.writeList();		

        System.out.println("main return...");
    }
}
//public class ListOfNumbers {
//    private List<Integer> list;
//    private static final int SIZE = 10;
//
//    // 생성자에서 리스트 초기화
//    public ListOfNumbers() {
//        list = new ArrayList<>();
//        for (int i = 0; i < SIZE; i++) {
//            list.add(i);
//        }
//    }
//
//    // 주어진 writeList 메서드
//    public void writeList() {
//        PrintWriter out = null;
//
//        try {
//            System.out.println("Entering try statement");
//
//            // FileWriter는 존재하지 않는 파일명이 전달하면,
//            // 만든다!
//      // C:\development\Workspace\codes\java_proj\JavaLabs\OutFile.txt
////            out = new PrintWriter(new FileWriter("/OutFile.txt"));
//            out = new PrintWriter(new FileWriter("OutFile.txt"));
//            
//            for (int i = 0; i < SIZE; i++) {
//                out.println("Value at: " + i + " = " + list.get(i));
//            }
//            
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println("Caught IndexOutOfBoundsException: " 
//            			+ e.getMessage());
//        } catch (IOException e) {
//            System.err.println("Caught IOException: " + e.getMessage());
//        } finally {
//            if (out != null) {
//                System.out.println("Closing PrintWriter");
//                out.close();
//            } else {
//                System.out.println("PrintWriter not open");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ListOfNumbers lon = new ListOfNumbers();
//        lon.writeList();
//
//        System.out.println("main return...");
//    }
//}