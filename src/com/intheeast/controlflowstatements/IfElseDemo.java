package com.intheeast.controlflowstatements;

public class IfElseDemo {
	
	public static void covertSwithBlock() {
		int testscore = 86;
        char grade;

        switch(testscore/10) {
        case 10:
        	grade ='A';
        	break;
        case 9:
        	grade = 'A';
        	break;
        case 8:
        	grade ='B';
        	break;
        case 7:
        	grade = 'C';
        	break;
        case 6:
        	grade ='D';
        	break;
        case 5:
        	grade = 'E';
        	break;
        case 4:
        	grade ='F';
        	break;
        case 3:
        	grade = 'G';
        	break;
        case 2:
        	grade ='H';
        	break;
        case 1:
        	grade = 'I';
        	break;
        default :
        	grade = 'J';
        	break;
        }
       
        System.out.println("Grade = " + grade);    
	}
	
	// IfElseDemo.main(...)
	public static void main(String[] args) {

        int testscore = 50;
        char grade;

        if (testscore >= 90) {
        	int a = 0;
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else if (testscore >= 50) {
            grade = 'E';
        } else if (testscore >= 40) {
            grade = 'F';
        } else if (testscore >= 30) {
            grade = 'G';
        } else if (testscore >= 20) {
            grade = 'H';
        } else if (testscore >= 10) {
            grade = 'I';
        } else {
            grade = 'F';
        }        
        //a = 1;
        
        System.out.println("Grade = " + grade);
    }

}
