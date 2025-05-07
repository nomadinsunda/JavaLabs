package com.intheeast.inheritances.interfaces;

public class Pegasus extends Horse implements Flyer, Mythical {
	
	// 우선순위 
	/* Horse class
	 public String identifyMyself() {
        return "I am a horse.";
     }
	 */
	
	/* Flyer interface
	 default public String identifyMyself() {
        return "I am able to fly.";
    }
	 */
	
	/* Mythical interface
	 default public String identifyMyself() {
        return "I am a mythical creature.";
    }
	 */
	
	public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        String str1 = myApp.identifyMyself();
//        String str2 = myApp.identifyMyselfF();
//        System.out.println(str);
    }

}
