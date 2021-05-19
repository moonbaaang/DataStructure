package variableArrangementAndLoop;

import java.util.Scanner;

public class code9 {

	public static void main(String[] args) {
		// n���� ���� �ƴ� ���ڸ� ������ �Է¹޾� �迭�� ����
		// �� �� 1�� �̻��� ���ӵ� �������� ���� (sum X) ���� �� �ִ� �Ҽ� �� �� �ִ밪�� ���϶�

		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 ������ �Է��ϼ���");
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
					// integer overflow �߻� ���ɼ� 
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


