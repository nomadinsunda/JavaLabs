package com.intheeast.exceptions.trycatch;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class APIMisuseExample1 {
	
	public static void releaseResource() /*throws NullPointerException*/ {
//		PrintWriter pw = null;		
		Optional<PrintWriter> optWriter = null;
		
		try {
			// 만약 OutFile.txt가 존재하지 않는다면?
//			pw = new PrintWriter(new FileWriter("OutFile.txt"));
			
			optWriter = Optional.of(new PrintWriter(new FileWriter("OutFile.txt")));
			
//			PrintWriter pw = optWriter.get();
//			pw.flush();
//			pw.write("hello");
//			pw.format("hello : %d, %d", 1, 2);
			
//			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			
			
		} finally {
			if (!optWriter.isEmpty()) {
				PrintWriter gotPw = optWriter.get();
				gotPw.close();
			}
//			if (pw != null)
//				pw.close();
		}
	}
	
//	public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Apple");
//
//        // API 사용 잘못: 존재하지 않는 인덱스 접근
//        String value = list.get(5);  // IndexOutOfBoundsException 발생
//
//        System.out.println("value = " + value);
//    }
//	
	public static void main(String[] args) {
		
		releaseResource();		
		
        List<String> list = new ArrayList<>();
        list.add("Apple");        

        String value = null;
        try {
        	
        	// 정상적인 API 사용
//        	value = list.get(0);
        	// 잘못된 API 사용: 존재하지 않는 인덱스 접근
            value = list.get(5);  // IndexOutOfBoundsException 발생
        } catch (IndexOutOfBoundsException e) {
        	System.out.println(e.getMessage());
        } finally {
        	if (value != null)
        		System.out.println("value = " + value);
        	else {
        		System.out.println("value is null!!! ");
        	}
        }        
    }
}
