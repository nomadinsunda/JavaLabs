package com.intheeast.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    	System.out.println("MyInvocationHandler:: invoke : class: " + proxy.getClass());
    	
    	if (method.getDeclaringClass().equals(FirstInterface.class)) {
            System.out.println("Invoked method from FirstInterface: " + method.getName());
        } else if (method.getDeclaringClass().equals(SecondInterface.class)) {
            System.out.println("Invoked method from SecondInterface: " + method.getName());
        } else {
            System.out.println("Invoked method from unknown interface: " + method.getName());
        }
        return null;
    }
}