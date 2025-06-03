package com.intheeast.jdkproxy.duplicate;

class ClassB implements InterfaceB {
    @Override
    public void duplicateMethod() {
        System.out.println("ClassB: duplicateMethod");
    }
}