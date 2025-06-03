package com.intheeast.jdkproxy;

public interface Greeting {
    default void sayHello() {
        System.out.println("🙋‍♂️ Hello from the default method!");
    }

    void sayBye();
}