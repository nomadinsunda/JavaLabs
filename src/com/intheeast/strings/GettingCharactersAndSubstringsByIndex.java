package com.intheeast.strings;

public class GettingCharactersAndSubstringsByIndex {
	
	public static void getCharAt() {
		// 자바의 유니코드 인코딩 방식 : UTF-16,,, 2바이트 아니면, 4바이트...
		//                      BMP(0x0 ~ 0xFFFF)
		// char[] : char는 2바이트 -> 문자열이 라틴어일 때
		//          압축함...char -> byte
		String anotherPalindrome = new String("안녕 헬로우 월드!!!"); 
		
		char aChar = anotherPalindrome.charAt(9);
		
		return;
	}
	
	public static void main(String ... args) {
		getCharAt();
	}

}
