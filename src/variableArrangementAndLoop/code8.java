package variableArrangementAndLoop;

import java.util.Scanner;

public class code8 {

	public static void main(String[] args) {
		// �迭 �� ���� ���� ������ ���� ã��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 ������ �Է��ϼ���");
		int n = sc.nextInt();
		int data[] = new int[n];
		
		for(int i=0; i<n; i++) {
			data[i]=sc.nextInt();
		}
		sc.close();
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(data[i]==data[j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
