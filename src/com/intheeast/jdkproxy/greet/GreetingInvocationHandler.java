package com.intheeast.jdkproxy.greet;

import java.lang.reflect.*;

public class GreetingInvocationHandler implements InvocationHandler {
	
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.isDefault()) {
            // Java 15+에서 디폴트 메서드를 호출할 수 있는 정식 API
            return InvocationHandler.invokeDefault(proxy, method, args);
        }

        // 사용자 정의 로직
        System.out.println("👋 Custom logic for: " + method.getName());
        return null;
    }
}