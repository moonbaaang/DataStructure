package variableArrangementAndLoop;

import java.util.Scanner;

public class code7 {

	public static void main(String[] args) {
		// 10만 이하의 모든 소수 찾기

		for(int n=2; n<=100000; n++) {
			boolean isPrime=true;	
			for(int i=2 ; i*i<=n; i++) { // 2, 3, ... sqrt(n) / 2/n
				if(n%i==0) {
					isPrime = false;
					break; // 또는 for문 조건에 i<=n/2 && isPrime 라고 개선해도 됨
				}
			}

			if(isPrime) {
				System.out.println(n);
			}
		}


	}

}
