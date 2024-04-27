package loop;

import util.JavaInput;

public class DoWhileExm {
public static void main(String[] args) {
	System.out.println("Enter any number");
	int a = JavaInput.getInput().nextInt();
	int i =1;
	 do{
		System.out.println(a*i);
		i++;
	}
	 while(i<=10);
}
}
