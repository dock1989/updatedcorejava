package array;

import util.JavaInput;

public class SumUsing2dArray {
public static void main(String[] args) {
	int a[][]= new int [2][2];
	int b[][]= new int [2][2];
	int c[][]= new int [2][2];
	
System.out.println("	 -------------------For A -----------------------------------------");
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.println("Enter any number");
			a[i][j] = JavaInput.getInput().nextInt();
		}
	}
	
System.out.println("	 -------------------For B -----------------------------------------");	
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.println("Enter any number");
			b[i][j] = JavaInput.getInput().nextInt();
		}
	}
	
//	 -------------------For C -----------------------------------------	
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			c[i][j] = a[i][j] + b[i][j];
			System.out.print(c[i][j] + " " );
		}
		System.out.println();
	}	
	
	
}
}
