package variableArrangementAndLoop;

import java.util.Scanner;

public class code9 {

	public static void main(String[] args) {
		// n개의 음이 아닌 한자리 정수를 입력받아 배열에 저장
		// 이 중 1개 이상의 연속된 정수들을 합쳐 (sum X) 얻을 수 있는 소수 들 중 최대값을 구하라

		Scanner sc = new Scanner(System.in);
		System.out.println("배열 개수를 입력하세요");
		int n = sc.nextInt();
		int data[] = new int[n];

		for(int i=0; i<n; i++) data[i] = sc.nextInt();
		sc.close();

		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				// convert data[i] ... data[j] into an integer
				// test if it is a prime
				int val = 0;
				for(int k=i; k<=j; k++) {
					val = val*10 + data[k];
					// integer overflow 발생 가능성 
				}

				boolean isPrime = true;
				for(int k=2; k*k<=val && isPrime; k++){
					if(val%k==0) isPrime = false;
				}
				if(isPrime && val>1 && val > max) max=val;
			}
		}
		if(max > 0)
			System.out.println(max);
		else
			System.out.println("No Prime Number");
	}


}


