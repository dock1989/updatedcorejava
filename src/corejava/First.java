package corejava;

import java.util.Scanner;

public class First {
	
	int a,b,c,d;
	
	public void getInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		a = scanner.nextInt();
		System.out.println("Enter second number");
		b = scanner.nextInt();
		System.out.println("Enter Third number");
		c = scanner.nextInt();
		d = a + b + c;
		
	}
	
	public void displayOutput() {
		System.out.println("The result is " + c);
	}
	
	public static void main(String[] args) {
		First first = new First();
		first.getInput();
		first.displayOutput();
		CharacterInput character = new CharacterInput();
		character.checkVowel();
	}

}
