package VariableArrangementAndLoop;

import java.util.Scanner;

public class code5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n개의 배열을 생성합니다. n을 입력하세요.");
		int n = sc.nextInt();
		int val[] = new int[n];
		
		int total = 0;
		int max = val[0];
		for(int i=0;i<n;i++) {
			System.out.println(n+"개의 배열에 값을 입력합니다. 값을 입력하세요.");
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
