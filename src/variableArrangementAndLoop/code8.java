package variableArrangementAndLoop;

import java.util.Scanner;

public class code8 {

	public static void main(String[] args) {
		// 배열 내 같은 수의 조합의 갯수 찾기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 개수를 입력하세요");
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
