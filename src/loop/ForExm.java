package loop;


import util.JavaInput;

public class ForExm {
	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		int a = JavaInput.getInput().nextInt();
		for(int i = 1; i<=10; i++ ) {
			System.out.println(a  + " * "+ i + " = "+(a*i));
		}

	}
}
