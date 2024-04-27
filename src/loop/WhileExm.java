package loop;

import util.JavaInput;

public class WhileExm {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		int a = JavaInput.getInput().nextInt();
		int i =1;
		while(i<=10) {
			System.out.println(a*i);
			i++;
		}
	}

}
