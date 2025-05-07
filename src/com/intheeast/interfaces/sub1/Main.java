package com.intheeast.interfaces.sub1;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	
	public static void compareArea() {
		
		List<String> list =
				new ArrayList<>();
		
		Collection<String> collection = (Collection<String>)list;
		
		Iterable<String> iterable = (Iterable<String>) collection;
				
		
		Point pi = new Point(40, 40);
		Point pi2 = new Point(40, 40);
		
		Relatable rectangleRel = new RectanglePlus(
				pi, 
				40, 40);
		
		Relatable circleRel = new CirclePlus(pi, 20);
		/////////////////////////////////////////////////
		Relatable.findSmallest(rectangleRel, circleRel);
		///////////////////////////////////////////////////
		
		
		RectanglePlus rectanglePlus = new RectanglePlus(
				pi, 
				40, 40);
		CirclePlus circlePlus = new CirclePlus(pi, 20);
		///////////////////////////////////////////////////
		Relatable.findSmallest(rectanglePlus, circlePlus);		
		////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////////////
		Relatable.findSmallest((Object)rectanglePlus, (Object)circlePlus);	
		//////////////////////////////////////////////////////////////////
	}

	public static void main(String[] args) {

		compareArea();
	}

}
