package variableArrangementAndLoop;

import java.util.Scanner;

public class code11 {

	public static void main(String[] args) {
		// bubble sort 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int[n];
		
		for(int i =0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = n-1; i>0 ; i--) {
			for(int j =0; j<i; j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		for(int one : data)
		System.out.print(one);
		
	}


}


