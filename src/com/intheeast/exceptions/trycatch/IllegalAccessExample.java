package com.intheeast.exceptions.trycatch;

import java.lang.reflect.Field;

public class IllegalAccessExample {
	
    public static void main(String[] args) {
        try {
        	
        	Object obj;
            Person person = new Person("John Doe", 30);

            // private 필드인 'name' 에 접근 시도
            // Person.class 는 Person 클래스에 대한 메타 데이터를 필드로 저장함.
            Field field = Person.class.getDeclaredField("name");

            field.setAccessible(true); //를 호출하지 않았기 때문에
            // 아래 get() 호출 시 IllegalAccessException 발생
            // : JDK 16/17에서는 "동일한 모듈 내부" 리플렉션 접근은 허용되는 방향으로 동작.
            // name 필드에는 현재 "John Doe" 문자열에 대한 참조값이...
            // private이지만, 리플렉션으로 값을 가지고 옴.
            // 이 name 필드에 대한 getter가 없음!
            Object value = field.get(person);

            System.out.println("name = " + value);
        } catch (NoSuchFieldException e) {
            System.err.println("필드를 찾을 수 없습니다: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.err.println("불법 접근 시도: " + e.getMessage());
        }
    }

    // Inner class with private field
//    static class Person {
//        private String name;
//        private int age;
//
//        public Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//    }
}