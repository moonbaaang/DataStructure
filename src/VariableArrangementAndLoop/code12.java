package VariableArrangementAndLoop;

import java.util.Scanner;

public class code12 {

	public static void main(String[] args) {
		// 정수가 입력될때마다 입력된 정수들을 오름차순으로 정렬해 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int[n];

		
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			int j = i-1;
			while(j>=0 && data[j]>temp) {
				data[j+1]=data[j];
				j--;
			}
			data[j+1] = temp;
			
			for(int k=0;k<=i;k++) {
				System.out.print(data[k]+" ");
			}
			System.out.println();
		}
		sc.close();
	
	}


}


