package variableArrangementAndLoop;

import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = null;
		String str = "Hello";

		System.out.println("Please type a string : ");

		input = keyboard.next();

		//if(str == input) >>>> String�� ==�� ���� �Ұ���
		if(str.equals(input)) {
			System.out.println("String match!");
		} else {		
			System.out.println("String do not match!");
		}

		keyboard.close(); //IOException prevention
		
		Scanner kb = new Scanner(System.in);
		String name = null;
		int age;
		String gender;
		
		System.out.println("�̸� ���� ���� �Է� : ");
		
		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();
		
		if(gender.equals("male")) {
			System.out.println("�̸��� " + name + ", ���̴� " + age +" �� ����");
		}
		else if(gender.equals("female")) {
			System.out.println("�̸��� " + name + ", ���̴� " + age +" �� ����");
		}
		else {
			System.out.println("����� �Է��ض�");
		}
		kb.close();
	}
	
}
