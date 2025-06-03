package com.intheeast.jdkproxy.timeproxy.proxy;

import java.lang.reflect.*;

public class ProxyFactory {
	
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
            interfaceType.getClassLoader(),
            new Class<?>[]{interfaceType},
            new TimeLoggingHandler(target)
        );
    }
}