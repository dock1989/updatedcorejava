package loop;

import util.JavaInput;

public class DaysSwitchLoop {
	public static void main(String[] args) {
		char opt ;
		do {
			System.out.println("Enter any number between 1- 7 ");
			int a = JavaInput.getInput().nextInt();

			switch(a) {
			case 1:
				System.out.println("Sunday");
				break;

			case 2:
				System.out.println("Monday");
				break;

			case 3:
				System.out.println("Tuesday");
				break;

			case 4:
				System.out.println("WednesdAY");
				break;
			case 5:
				System.out.println("Thursday");
				break;

			case 6:
				System.out.println("Friday");
				break;

			case 7:
				System.out.println("Saturday");
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
			System.out.println("Do you want to process more . Say y/n");
			opt = JavaInput.getInput().next().charAt(0);
		}

		while(opt == 'y' || opt == 'Y');
	}
}