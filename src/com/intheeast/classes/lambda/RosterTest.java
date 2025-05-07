package com.intheeast.classes.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.intheeast.classes.lambda.Person.Sex;

import java.lang.Iterable;
import java.time.chrono.IsoChronology;



public class RosterTest {

	// 체크하고자 하는 검색 조건들을 상황에 따라 만들자...
	// test 메서드의 바디에서....
	// 사실은 Predicate 함수형 인터페이스를 소개하기 위한,
	// 포석을 까는 것.....
    interface CheckPerson {
    	// 검색 조건에 따라 test의 바디를 각각 구현하면 됨..
        boolean test(Person p);
    }
    
    interface CheckState {
    	boolean checkAddress(String address);
    }

    // Approach 1: Create Methods that Search for Persons that Match One
    // Characteristic
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    // Approach 2: Create More Generalized Search Methods
    public static void printPersonsWithinAgeRange(
        List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
    
    public static void printPersonsWithinAgeRangeAndGender(
            List<Person> roster, 
            int low, int high,
            Sex gender) {
            for (Person p : roster) {
                if (low <= p.getAge() && 
                		p.getAge() < high &&
                		gender == Sex.MALE) {
                    p.printPerson();
                }
            }
        }
    
    public static void printPersonsWithMinnesota(
            List<Person> roster, 
            int low, int high,
            Sex gender) {
            for (Person p : roster) {
                if (p.getState().equals("Minnesota")) {
                    p.printPerson();
                }
            }
        }
    
    // ...
    
    ///////////////////////////////////////////////////

    // Approach 3: Specify Search Criteria Code in a Local Class
    // Approach 4: Specify Search Criteria Code in an Anonymous Class
    // Approach 5: Specify Search Criteria Code with a Lambda Expression
    // CheckPersonEligibleForSelectiveService --> CheckPerson을 구현함!!!
    public static void printPersons(
        List<Person> roster, 
        // CheckPersonEligibleForSelectiveService 인스턴스 참조값이라면서,,,
        // CheckPerson 인터페이스를 구현한 구현체의 인스턴스를 참조값을 저장하는 파라미터
        CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    // Approach 6: Use Standard Functional Interfaces with Lambda Expressions

    public static void printPersonsWithPredicate(
        List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    // Approach 7: Use Lambda Expressions Throughout Your Application

    // CheckPersonEligibleForSelectiveService
    public static void processPersons(
        List<Person> roster,
        Predicate<Person> tester,
        Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    // Approach 7, second example

    public static void processPersonsWithFunction(
        List<Person> roster,
        Predicate<Person> tester,
        Function<Person, String> mapper,
        Consumer<String> block) {
    	
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
        
    }
    
    // Approach 8: Use Generics More Extensively

    public static <X, Y> void processElements(
        Iterable<X> source,
        Predicate<X> tester,
        Function<X, Y> mapper,
        Consumer<Y> block) {
    	// source가 Iterable 인터페이스를 구현한 구체이여야 함.
            for (X p : source) {
                if (tester.test(p)) {
                    Y data = mapper.apply(p);
                    block.accept(data);
                }
            }
    }

    public static void main(String... args) {

    	Runnable ra;
    	
    	var x = 3; // int x = 3;
    	var xx = 'X'; // char xx = 'X';
    	var xxx = "Hello"; // String xxx = "Hello";
    	
    	
    	System.out.println("Running!");
    	// createRoster에서 ArrayList를 생성
    	// ArrayList는 결과적으로 Iterable 인터페이스를 구현함!!!
        List<Person> roster = Person.createRoster();

        for (Person p : roster) {
            p.printPerson();
        }

        // Approach 1: Create Methods that Search for Persons that Match One
        // Characteristic

        System.out.println("Persons older than 20:");
        printPersonsOlderThan(roster, 20);
        System.out.println();

        // Approach 2: Create More Generalized Search Methods

        System.out.println("Persons between the ages of 14 and 30:");
        printPersonsWithinAgeRange(roster, 14, 30);
        System.out.println();

        // Approach 3: Specify Search Criteria Code in a Local Class

        System.out.println("Persons who are eligible for Selective Service:");

        // main 메서드의 로컬 클래스 정의
        // 오로지 메서드내에서만 사용하려고!!!
        // 1.메서드내에서 클래스를 정의하고
        // 2.메서드내에서만, 이 클래스의 인스턴스를 만듭니다!!!
        class CheckPersonEligibleForSelectiveService 
        						implements CheckPerson {
        	//...field, instance method...
        	
           public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE
                    && p.getAge() >= 18
                    && p.getAge() <= 25;
            }
        }

        // printPersons 메서드의 두번째 파라미터의 아규먼트로,
        // new CheckPersonEligibleForSelectiveService() 라는 expression을 
        // 사용할 수 있나요?
        // new CheckPersonEligibleForSelectiveService()
        // : JVM이 내부적으로 CheckPersonEligibleForSelectiveService 인스턴스를 만들고
        //   이 인스턴스의 참조`값`을 만들어서 제공...
        printPersons(
            roster, new CheckPersonEligibleForSelectiveService());


        System.out.println();

        // Approach 4: Specify Search Criteria Code in an Anonymous Class

        System.out.println("Persons who are eligible for Selective Service " +
            "(anonymous class):");

        printPersons(
            roster,
            // CheckPerson tester...
            new CheckPerson() {
                public boolean test(Person p) {
                    return p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25;
                }
            }
        );
        
        printPersons(
            roster,
            new CheckPerson() {
                public boolean test(Person p) {
                    return p.state.equals("Minnesota");
                }
            }
        );

        System.out.println();

        // Approach 5: Specify Search Criteria Code with a Lambda Expression

        System.out.println("Persons who are eligible for Selective Service " +
            "(lambda expression):");

        ///////////////////////////////////////////////////
        //////////////////////////////////////////////////
        ///
        // CheckPerson 인터페이스를 구현하고 있는 구현체
        // 그냥, test 가상 메서드를 구현하고 있다고 말함.
        // 람다식이 적용되는 인터페이스는 단 하나의 가상 메서드만 선언되어 있기 때문에...
        // boolean test(Person p);
        printPersons(
            roster,
            // 람다식을 아규먼트를 전달.
            // 문법
            // 1. (Person p)는 구현해야할 가상 메서드의 파라미터 정의
            // 2. '->' : 이 expression이 람다식을 나타내는 지시자.
            // 3. expression 또는 statement(s)
            //    expression일 경우, 만약 가상 메서드 선언에 리턴 타입이 설정되어 있으면
            //    return 키워드 생략할 수 있음!
            /*
             * (Person p) -> {
            		return p.getGender() == Person.Sex.MALE
            				&& p.getAge() >= 18
            				&& p.getAge() <= 25;
                } 
             */ // 자바 람다식에서 expression이 만든 값은 자동으로 리턴되기 때문에
            // return 키워드를 생략할 수 있음.
            (Person p) -> p.getGender() == Person.Sex.MALE
            			&& p.getAge() >= 18
            			&& p.getAge() <= 25
            /* 자바 컴파일러의 람다식의 파라미터 데이터 타입 유추(inference) 기능
             (p) -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25
             */
            /*
              p -> p.getGender() == Person.Sex.MALE
                   && p.getAge() >= 18
                   && p.getAge() <= 25
            */
        );
        ////////////////////////////////////////////////////
        ////////////////////////////////////////////////////

        System.out.println();

        // Approach 6: Use Standard Functional Interfaces with Lambda
        // Expressions

        System.out.println("Persons who are eligible for Selective Service " +
            "(with Predicate parameter):");

        printPersonsWithPredicate(
            roster,
            p -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25
        );

        System.out.println();

        // Approach 7: Use Lamba Expressions Throughout Your Application

        System.out.println("Persons who are eligible for Selective Service " +
            "(with Predicate and Consumer parameters):");

        processPersons(
            roster,
            p -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25,
            p -> p.printPerson()
        );

        System.out.println();

        // Approach 7, second example

        System.out.println("Persons who are eligible for Selective Service " +
            "(with Predicate, Function, and Consumer parameters):");

        processPersonsWithFunction(
            roster,
            // test 가상 메서드
            p -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25,
            // apply 가상 메서드
            p -> p.getEmailAddress(),
            // accept 가상 메서드
            email -> System.out.println(email)
        );

        System.out.println();

        // Approach 8: Use Generics More Extensively

        System.out.println("Persons who are eligible for Selective Service " +
            "(generic version):");

        processElements(
            roster,
            p -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25,
            p -> p.getEmailAddress(),
            email -> System.out.println(email)
        );

        System.out.println();

        // Approach 9: Use Bulk Data Operations That Accept Lambda Expressions
        // as Parameters

        System.out.println("Persons who are eligible for Selective Service " +
            "(with bulk data operations):");

        roster
            .stream()
            .filter(
                p -> p.getGender() == Person.Sex.MALE
                    && p.getAge() >= 18
                    && p.getAge() <= 25)
            .map(p -> p.getEmailAddress())
            .forEach(email -> System.out.println(email));
        
        // boolean checkAddress(String address)
        CheckState checkState = 
        		(String a) -> { 
        			boolean ret = false;        		
        			if (a.equals("Minesota")) 
        				ret = true;	
        			return ret;
        		};
        		
        // System.out::println -> System.out.println
        Consumer<String> printer = System.out::println; // 메서드 참조...
        // void accept(String t) {
        //    System.out.println(t);
        // }
        
        	
        // R apply(T t);
        // String apply(String t);
		Function<String, String> process = (String input) -> {
            String trimmed = input.trim();
            String upper = trimmed.toUpperCase();
            System.out.println("변환된 문자열: " + upper);
            return upper;
        };
        
        // raw type : 일반적으로 raw type은 권장되지 않지만,
        //            JPA 구현체인 Hibernate에서는 raw type에 제너릭을 사용함.
        Predicate<String>[] arr = new Predicate[2];
        
        // { s -> s.contains("a"), s -> s.contains("b") };
        arr[0] = s -> s.contains("a");
        arr[1] = s -> s.contains("b");
        
        List<String> list = List.of("a", "bb", "ccc"); 
        list.removeIf(s -> s.length() == 2);
        
        // 타입 아규먼트를 String, Person 클래스...
        // Supplier<String> : 인터페이스...타입 아규먼트로 인터페이스도 정의될 수 있음.
        Function<Integer, Supplier<String>> makeMessage = i -> () -> "Value: " + i;
        
    } 
     
}