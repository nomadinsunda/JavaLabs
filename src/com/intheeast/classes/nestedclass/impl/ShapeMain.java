package com.intheeast.classes.nestedclass.impl;

import com.intheeast.classes.nestedclass.interfaces.Shape;

public class ShapeMain {
	
	public static Shape makeTriangle() {
		Point[] vertices = new Point[3];
		
		vertices[0] = new Point(5, 10); // new 연산자는 내부적으로 VM에게 해당 클래스 인스턴스를
		                                // 생성해 달라고 요청!!!
		                                // VM 이 인스턴스의 참조 값을 리턴합니다...
		                                // :new Point(5, 10) expression 값으로...
		vertices[1] = new Point(2, 2);
		vertices[2] = new Point(7, 2);
		
		Shape triangle = new Triangle(vertices);
		return triangle;
	}

	public static void main(String[] args) {
		
        final String message = "Hello";


		Shape triangle = makeTriangle();
		double triangleArea = triangle.calculateArea();
		Point[] triangleVertices = triangle.getVertices();
		triangle.printName();
		
		return ;
	}

}
