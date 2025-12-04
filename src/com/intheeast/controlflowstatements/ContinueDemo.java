package com.intheeast.controlflowstatements;

public class ContinueDemo {
	
	public static void main(String[] args) {

        String searchMe = "peter piper picked a " + 
        						"peck of pickled peppers";
        
        //searchMe = "peter piper picked a peck of pickled peppers";
        
        // length 메서드는
        // 위 문자열에 포함되어 있는 문자 개수를
        // 리턴함.
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // 'p' 문자에만 관심이 있습니다.
        	// charAt()
        	char at = searchMe.charAt(i);
            if ( at != 'p') {
                System.out.println("Found char:" + at + ", this is not p");
                continue; // if 블럭 다음의 스테이트먼트를 실행하지 않고
                          // for 구문의 i++과 i<max;를 수행함.
                          // : for 구문의 증감 expression을 수행하고 그 다음 종료 expression을 
                          //   수행한다.
            }

            // 'p' 문자 처리
            numPs++;
            System.out.println("Found p!, " + numPs + "번째 p");
        }
        
        System.out.println("Found " + numPs + " p's in the string.");
    }

}
