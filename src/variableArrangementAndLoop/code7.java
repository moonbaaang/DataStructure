package variableArrangementAndLoop;

import java.util.Scanner;

public class code7 {

	public static void main(String[] args) {
		// 10�� ������ ��� �Ҽ� ã��

		for(int n=2; n<=100000; n++) {
			boolean isPrime=true;	
			for(int i=2 ; i*i<=n; i++) { // 2, 3, ... sqrt(n) / 2/n
				if(n%i==0) {
					isPrime = false;
					break; // �Ǵ� for�� ���ǿ� i<=n/2 && isPrime ��� �����ص� ��
				}
			}

			if(isPrime) {
				System.out.println(n);
			}
		}


	}

}
