package com.intheeast.controlflowstatements;

public class WhileDemo {
	
	public static void main(String[] args){
        int loopingCount = 1; // for 구문에서 int i =1;
        
        // while(expression)의 조건식이 true이면
        // while 블럭의 statement(s)들을 수행한다.
        // 언제까지? while의 조건식이 true이면 계속해서 
        // while 블럭의 statement(s)들을 수행한다.
        while (/*true*/loopingCount < 11/*for 구문에서 i<11*/) {
        	
            System.out.println("Count is: " + loopingCount);
            
            loopingCount++; // for 구문에서 i++
//            if (loopingCount++ > 5)
//            	break;
        }
        
        // while 조건식의 값이 false가 되면,
        // while 블럭의 next 스테이트먼트로 실행 순서가 이루어진다.        
        System.out.println();
    }

}
