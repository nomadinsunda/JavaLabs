package com.intheeast.inheritances;

public class MultipleInheritanceDemo {
	
	public static void main(String[] args) {
        SubClassAnother sub = new SubClassAnother();
        sub.printState();
    }

}

class SuperClassA {
    int state = 1;

    SuperClassA() {
        state = 2; // 생성자에서 state 값을 2로 설정
    }

    void printState() {
        System.out.println("State from SuperClassA: " + state);
    }
}

class SuperClassB {
    int state = 3;

    SuperClassB() {
        state = 4; // 생성자에서 state 값을 4로 설정
    }

    void printState() {
        System.out.println("State from SuperClassB: " + state);
    }
}

// 다중 상속이 가능하다고 가정하고 두 슈퍼클래스를 상속받는 서브클래스를 정의합니다.
class SubClassAnother extends SuperClassA /*, SuperClassB*/ {
    // 다중 상속이 허용되지 않기 때문에 두 번째 슈퍼클래스를 주석 처리했습니다.

    // 메서드를 오버라이드하여 상태를 출력합니다.
    @Override
    void printState() {
        // 만약 다중 상속이 가능하다면, 어떤 state를 출력해야 할지 애매해집니다.
        super.printState(); // SuperClassA의 state 출력
        // SuperClassB의 state도 출력해야 한다면?
        // super.printState(); // SuperClassB의 state 출력 (애매해짐)
    }
}