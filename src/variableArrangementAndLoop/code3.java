package variableArrangementAndLoop;

import java.util.Scanner;

public class code3 {

	public static void main(String[] args) {
		
		int [] grades= new int[5];
		
		grades[0] = 90;
		grades[1] = 80;
		grades[2] = 60;
		grades[3] = 40;
		grades[4] = 10;
//		System.out.println(grades.length + "±Ê¿Ã");
		
		for(int i = 0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
	}
	
}
