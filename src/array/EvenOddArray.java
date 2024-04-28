package array;

public class EvenOddArray {
	
	public static void main(String[] args) {
		
		int a[] = new int[] {1,2,3,4,5,6,8,8,9,10};
		int counteven = 0, countodd = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.println("Number is even ");
				counteven++;
			}
			else {
				System.out.println("Number is odd");
				countodd++;
			}
		}
		
		System.out.println("Total even numbers are " + counteven);
		System.out.println("Total odd numbers are " + countodd);
		
	}

}
