package VariableArrangementAndLoop;

import java.util.Scanner;

public class code5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n���� �迭�� �����մϴ�. n�� �Է��ϼ���.");
		int n = sc.nextInt();
		int val[] = new int[n];
		
		int total = 0;
		int max = val[0];
		for(int i=0;i<n;i++) {
			System.out.println(n+"���� �迭�� ���� �Է��մϴ�. ���� �Է��ϼ���.");
			val[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i =0; i<n ;i++) {
			total = total + val[i];
			if(max<val[i]) max=val[i];
		}
		
		System.out.println("total = "+total +", max = "+max);
		
		
	}
	
}
