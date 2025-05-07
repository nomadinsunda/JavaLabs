package com.intheeast.interfaces;

import java.awt.Point;

public class UsingRelatableInteface {
	
	private int width;
	private int height;
	private Point point;
	private Relatable obj;
	
	public UsingRelatableInteface() {
		point = new Point(0, 0);
		width = 100;
		height = 100;
		obj = new RectanglePlus(point, width, height);
	}
	
	public Object findLargest(Object obj) {
		   Relatable other = (Relatable)obj; // 형 변환(type casting)
		   if (this.obj.isLargerThan(other) > 0)
		      return this.obj;
		   else 
		      return other;
		}
	
	public Object findFSmallest(Object obj) {
	   Relatable other = (Relatable)obj;
	   if (this.obj.isLargerThan(other) < 0)
	      return this.obj;
	   else 
	      return other;
	}

	public boolean isFEqual(Object obj) {
	   Relatable other = (Relatable)obj;
	   if ( this.obj.isLargerThan(other) == 0)
	      return true;
	   else 
	      return false;
	}

	
	public static Object findLargest(Object object1, Object object2) {
	   Relatable obj1 = (Relatable)object1; // 참조 값 형 변환(type casting)
	   Relatable obj2 = (Relatable)object2; // 형 변환(type casting)
	   if (obj1.isLargerThan(obj2) > 0)
	      return object1;
	   else 
	      return object2;
	}
	
	
	
	public static Object findSmallest(Object object1, Object object2) {
	   Relatable obj1 = (Relatable)object1;
	   Relatable obj2 = (Relatable)object2;
	   if (obj1.isLargerThan(obj2) < 0)
	      return object1;
	   else 
	      return object2;
	}

	public static boolean isEqual(Object object1, Object object2) {
	   Relatable obj1 = (Relatable)object1;
	   Relatable obj2 = (Relatable)object2;
	   if ( (obj1).isLargerThan(obj2) == 0)
	      return true;
	   else 
	      return false;
	}


}
