package corejava;

import java.util.Scanner;
import java.io.*;

public class EvenOdd {
	
	public void checkNumber() {
		
		Scanner scanner =  new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		
		num = scanner.nextInt();
		if(num%2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
;	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EvenOdd obj =new  EvenOdd();
      obj.checkNumber();
	}

}
