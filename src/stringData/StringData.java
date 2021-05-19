package stringData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringData {
	
	static String [] names = new String [1000];
	static int [] numbers = new int [1000];
	static int n = 0;
	
	public static void main(String[] args) {
	
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			
			while(sc.hasNext()) {
				names[n] = sc.next();
				numbers[n] = sc.nextInt();
				n++;
			}
			sc.close();
		} catch(FileNotFoundException e){
			System.out.println(e);
			System.exit(1);
		}
				
		bubbleSort(n, names, numbers);
		for(int i=0; i<n; i++) {
			System.out.println(names[i]+":"+numbers[i]);
		}
	}
	
	static public void bubbleSort(int n, String [] names, int [] numbers) {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(names[j].compareTo(names[j+1])>0) { //names[j].equals(names[j+1]) // names[j].compareTo(names[j+1]) >> ������ �� ũ�� ������ �˻�����
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
					
					String tmpstr = names[j];
					names[j] = names[j+1];
					names[j+1] = tmpstr;
				}
			}
		}
	}
}
