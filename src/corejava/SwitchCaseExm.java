package corejava;

import java.util.Scanner;

public class SwitchCaseExm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character");
		char a = scanner.next().charAt(0);
		switch(a) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("The character is vowel");
			break;
		default:
			System.out.println("The character is consonant");
		}
	}

}
