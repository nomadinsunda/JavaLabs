package com.intheeast.exceptions.trycatch;

public class ExceptionPropagationExample {

    public static void main(String[] args) {
        System.out.println("Program started in main");

        methodWithExceptionHandler();       

        System.out.println("Program ended in main");
    }

    // 예외 핸들러가 있는 메서드
    public static void methodWithExceptionHandler() {
    	String nullStr = null;
    	nullStr.charAt(0); // NullPointerException
    	
    	int[] arrays = new int[10];
    	arrays[10] = 0; // indexOutOfBoundsException
    	
        System.out.println("In methodWithExceptionHandler");

        try {
        	// ArithmeticException가 발생할 거 같아...
        	methodWithoutHandler();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main: " + e.getMessage());
        }

        System.out.println("Exiting methodWithExceptionHandler");
    }

    // 예외 핸들러가 없는 메서드 (예외를 그냥 전파)
    public static void methodWithoutHandler() {
        System.out.println("In methodWithoutHandler");

        methodWhereErrorOccurs();

        System.out.println("Exiting methodWithoutHandler");
    }

    // 예외가 발생하는 메서드
    public static void methodWhereErrorOccurs() {
        System.out.println("In methodWhereErrorOccurs");

        // 고의로 발생..
        int result = 10 / 0;  // ArithmeticException 발생

        System.out.println("This line will not execute: " + result);
    }
}
