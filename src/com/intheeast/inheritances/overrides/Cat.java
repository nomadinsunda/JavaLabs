package com.intheeast.inheritances.overrides;

public class Cat extends Animal {
	
//	@Override
    public Cat speak() {
		super.speak(); // Animal 클래스의 speak 메서드를 호출함.
		
        System.out.println("Cat meows");
        return this;
    }	
	
	
//	public static void testClassMethod() {
//		// 상속받은 static 메서드에서는
//		// super 키워드를 사용할 수 없다.
//		//super.testClassMethod();
//        System.out.println("The static method in Cat");
//    }
	
//	@Override
    public void testInstanceMethod() {
    	super.testInstanceMethod();
        System.out.println("The instance method in Cat");
    }
    
    public static void main(String[] args) {
        //Object obj = new MountainBike();
    	
    	Cat myCat = new Cat();
        Animal myAnimal = myCat;
        
        Animal.testClassMethod();
        Cat.testClassMethod();
        
        
        /////////////////////////////
        myAnimal.testInstanceMethod();
    }

}
