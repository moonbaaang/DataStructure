package VariableArrangementAndLoop;

import java.util.Scanner;

public class code4 {

	public static void main(String[] args) {
		
		int [] grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 90;
		grades[2] = 80;
		grades[3] = 70;
		grades[4] = 60;
		
		for(int grade : grades) {
			System.out.println("(for)Grade : " + grade);
		}
		
		int start = 0;
		while(start < grades.length) {
			System.out.println("(while)Grade : " + grades[start]);
			start++;
		}
		
	}
	
}
