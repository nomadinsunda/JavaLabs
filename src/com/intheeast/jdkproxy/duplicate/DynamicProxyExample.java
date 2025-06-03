package com.intheeast.jdkproxy.duplicate;

import java.lang.reflect.Proxy;

public class DynamicProxyExample {
	
	public static void main(String[] args) {
        InterfaceA classA = new ClassA();
        InterfaceB classB = new ClassB();

        Object proxyInstance = Proxy.newProxyInstance(
                DynamicProxyExample.class.getClassLoader(),
                new Class<?>[]{InterfaceA.class, InterfaceB.class},
                new MyInvocationHandler(classA, classB)
        );

        ((InterfaceA) proxyInstance).duplicateMethod();  // ClassA: duplicateMethod 출력
        // 프록시 인스턴스에서 중복 메서드가 호출되면, 
        // 해당 메서드를 포함한 첫 번째 인터페이스(직접 포함하거나 슈퍼 인터페이스를 통해 상속받은)의 
        // Method 객체가 호출 핸들러의 invoke 메서드에 전달됩니다.
        ((InterfaceB) proxyInstance).duplicateMethod();  // ClassA: duplicateMethod 출력
    }

}
