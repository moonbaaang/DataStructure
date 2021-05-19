package variableArrangementAndLoop;

import java.util.Scanner;

public class code6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n개의 배열을 생성합니다. n을 입력하세요.");
		int n = sc.nextInt();
		int val[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println(n+"개의 배열에 값을 입력합니다. 값을 입력하세요.");
			val[i] = sc.nextInt();
		}
		sc.close();

		int temp = val[n-1];	
		for(int i =n-2; i>=0 ;i--) {
			val[i+1] = val[i];
		}
		val[0] = temp;
		
		for(int i = 0; i<n ; i++) System.out.println("val["+i+"] = "+val[i]);
	}
	
}
