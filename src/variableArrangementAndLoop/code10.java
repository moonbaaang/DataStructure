package variableArrangementAndLoop;

import java.util.Scanner;

public class code10 {

	public static void main(String[] args) {
		// n���� ������ �Է¹޾� �迭�� ����, �̵� �� 0�� �̻��� ���ӵ� �������� ���� ���� �� �ִ� �ִ밪�� ���� ����ϴ� ���α׷��� �ۼ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 ������ �Է��ϼ���");
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
