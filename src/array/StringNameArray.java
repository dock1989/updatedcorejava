package array;

import java.lang.reflect.Array;
import java.util.Arrays;

import util.JavaInput;

public class StringNameArray {
	public static void main(String[] args) {

		String [] arr = new String[] {"Ajay","Vijay","Suresh","Vijay","Vijay","Suresh"};
		String [] arr2 = new String[10];
		
		System.arraycopy(arr,1,arr2,6,4);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
//		System.out.println("Enter the name to be searched");
//		String name = JavaInput.getInput().nextLine();
//		int countName =0;
//		for(int i =0;i<arr.length;i++) {
//			if(arr[i].equals(name)) {
//				System.out.println("The position is " + (i+1));
//				countName++;
//			}
//		}
//		
//		if(countName>0) {
//			System.out.println("The total occurrence is " + countName);
//		}
	}
}
