package methodChallenge;

public class DigitSum {
	public static void main(String[] args) {
		System.out.println(digitSum(82));
	}
	public static int digitSum(int number) {
		int digit1;
		int digit2;
		int digit3;
		if(number < 1) {
			System.out.println("Invalid value was passed.");
			return -1;
		}
		if(number < 10) {
			return number;
		}
		if(number >= 10 && number < 100) {
			digit1 = number/10;
			System.out.println("Numbers first digit is " + digit1);
			digit2 = number - (digit1*10);
			System.out.println("Numbers second digit is " +digit2);
			return digit1+digit2;
		}
		if(number>=100 && number < 1000) {
			digit1 = number/100;
			System.out.println("Numbers first digit is " + digit1);
			digit2 = (number - (digit1*100))/10;
			System.out.println("Numbers second digit is " + digit2);
			digit3 = (number - ((digit1*100) + (digit2*10)));
			System.out.println("Numbers third digit is " + digit3);
			return digit1+digit2+digit3;
		}
		return 0;
	}
}
