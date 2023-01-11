package methodChallenge;

import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nextNumber;
		int number = 0;
		int min = 0, max = 0, loopCount = 0;
		do {
			System.out.println("Enter a number : (Or enter any char to quit.");
			try {
			nextNumber = sc.nextLine();
			number = Integer.parseInt(nextNumber);
			if(loopCount == 0 || number < min) {
				min = number;
			}
			if(loopCount == 0 || number > max) {
				max = number;
			}
			loopCount++;
			} catch(NumberFormatException nfe) {
				System.out.println("Lowest number entered is: " + min
					+	" Highest number entered is: " + max);
				System.out.println("Loop is over.");
				break;
			}
			
		}while(number >= -2147483648);
		
		
	}

}
