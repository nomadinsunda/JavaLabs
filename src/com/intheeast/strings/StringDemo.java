package com.intheeast.strings;

public class StringDemo {
	
	public static void main(String[] args) {
		
//		StringFormat stringFormat = new StringFormat();
		
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
//        for (int i = 0; i < len; i++) {
//            tempCharArray[i] = 
//                palindrome.charAt(i);
//        }
        
        palindrome.getChars(0, // 이 문자열의 0번째 인덱스인 문자부터
        		len, // 17개
        		tempCharArray, // tempCharArray 배열에 복사한다
        		0); // tempCharArray 배열의 0번째 인덱스인 char 변수부터...
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome =
            new String(charArray);
        System.out.println(reversePalindrome);
    }

}
