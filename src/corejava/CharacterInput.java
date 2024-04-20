package corejava;

import java.util.Scanner;

public class CharacterInput {
	char a;
	public void checkVowel() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character");
		 a = scanner.next().charAt(0);
		System.out.println(checkCharMsg());
	}
	
	private String checkCharMsg() {
		if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u') {
			return "The character is vowel";
		}
		else {
			return "The character is consonant";
		}
	}
	
//	public static void main(String[] args) {
//		CharacterInput characterInput = new CharacterInput();
//		characterInput.
//	}
	
}
