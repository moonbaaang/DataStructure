package variableArrangementAndLoop;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int[n];
		
		for(int i=0;i<n;i++)
			data[i] = sc.nextInt();
		
		//¹öºí
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				int temp = data[j];
				if(data[j]>data[j+1]) {
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		for(int i=0; i<n ; i++)
			System.out.print(data[i]+" ");
	}
}
