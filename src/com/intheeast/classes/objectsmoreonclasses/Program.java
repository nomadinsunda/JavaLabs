package com.intheeast.classes.objectsmoreonclasses;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int y = 200;
		
		Point originOne = new Point(x, y);
		
		int width = 600;
		int height = 400;
		Rectangle rec = new Rectangle(originOne, width, height);
		
		Point gotOriginOne = rec.getOrigin();
		
		System.out.println("good bye");
		
	}

}
