package variableArrangementAndLoop;

import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = null;
		String str = "Hello";

		System.out.println("Please type a string : ");

		input = keyboard.next();

		//if(str == input) >>>> String은 ==로 연산 불가능
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
		
		System.out.println("이름 나이 성별 입력 : ");
		
		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();
		
		if(gender.equals("male")) {
			System.out.println("이름은 " + name + ", 나이는 " + age +" 인 남자");
		}
		else if(gender.equals("female")) {
			System.out.println("이름은 " + name + ", 나이는 " + age +" 인 여자");
		}
		else {
			System.out.println("제대로 입력해라");
		}
		kb.close();
	}
	
}
