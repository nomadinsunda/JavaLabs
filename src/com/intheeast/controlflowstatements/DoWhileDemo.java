package com.intheeast.controlflowstatements;

public class DoWhileDemo {
	
	public static void main(String[] args){
        int count = 11;
        int a = 0;
        
        do {
        	
        	//int a = 1;
        	int doVariable = 0;
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11); // 첫번째 반복시에 while 조건식 값이 
                              // false 이더라도
                              // 한번은,,, do..while 블럭의 스테이트먼가 수행됨
        
        //doVariable = 10;
        
        System.out.println();
    }

}
