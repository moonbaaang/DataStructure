package VariableArrangementAndLoop;

import java.util.Scanner;

public class code1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int number = 123;
		
		System.out.println("Please enter an integer");
		
		int input = keyboard.nextInt();
		
		if(input == number) {
			System.out.println("Numbers match!");
		} else {
			System.out.println("Numbers do not match!");
		}
		
		keyboard.close(); //IOException prevention
	}
}
