package com.intheeast.jdkproxy.greet;

public interface Greeting {
    default void sayHello() {
        System.out.println("🙋‍♂️ Hello from the default method!");
    }

    void sayBye();
}