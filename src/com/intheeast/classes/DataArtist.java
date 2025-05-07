package com.intheeast.classes;

public class DataArtist {
	
	
	// draw 메서드에 대한 Overloading 이라고 함
	// 자바는 "서로 다른 메서드 시그니처를 가진 메서드만 구별"
	public void draw(String s) {
    }
	
//	public int draw(String s) {
//    }
	
    public void draw(int i) {
    }
    
    public void draw(double f) {
    }
    
    public void draw(int i, double f) {
    }

}
