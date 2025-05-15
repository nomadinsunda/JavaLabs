package com.intheeast.exceptions.trycatch;

public class StackTraceDeepExample {
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception cause) {
            StackTraceElement[] elements = cause.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {
                System.err.println(elements[i].getFileName()
                        + ":" + elements[i].getLineNumber()
                        + " >> "
                        + elements[i].getMethodName() + "()");
            }
        }
    }

    public static void level1() {
        level2();
    }

    public static void level2() {
        level3();
    }

    public static void level3() {
        level4();
    }

    public static void level4() {
        int result = 10 / 0;  // ArithmeticException 발생
    }
}