package variableArrangementAndLoop;

import java.util.Scanner;

public class code6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n���� �迭�� �����մϴ�. n�� �Է��ϼ���.");
		int n = sc.nextInt();
		int val[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println(n+"���� �迭�� ���� �Է��մϴ�. ���� �Է��ϼ���.");
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
