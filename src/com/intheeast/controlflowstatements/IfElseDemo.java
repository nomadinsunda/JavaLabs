package com.intheeast.controlflowstatements;

public class IfElseDemo {
	
	public static void main(String[] args) {

        int testscore = 86;
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
        } else {
            grade = 'F';
        }
        
        //a = 1;
        
        System.out.println("Grade = " + grade);
    }

}
