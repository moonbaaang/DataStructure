package variableArrangementAndLoop;

import java.util.Scanner;

public class code10 {

	public static void main(String[] args) {
		// n개의 정수를 입력받아 배열에 저장, 이들 중 0개 이상의 연속된 정수들을 더해 얻을 수 있는 최대값을 구해 출력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 개수를 입력하세요");
		int n = sc.nextInt();
		int data[] = new int[n];
		
		for(int i=0; i<n; i++) data[i] = sc.nextInt();
		sc.close();
		
		int maxSum = 0;
		for(int i=0; i<n; i++) {
			int sum=0;
			for(int j=i; j<n; j++) {
					sum += data[j];
				if(sum>maxSum) maxSum = sum;
			}
		}
		System.out.println("Maxsum is "+maxSum);
	}

}
