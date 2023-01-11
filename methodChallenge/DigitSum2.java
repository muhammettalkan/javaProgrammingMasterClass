package methodChallenge;

public class DigitSum2 {

	public static void main(String[] args) {
//		int number = 0;
//		while(number < 15) {
//			number++;
//			
//			if(number <= 5) {
//				System.out.println("Skipping number " + number);
//				continue;
//			}
//			System.out.println("number = " + number);
//			
//			if(number >= 10) {
//				System.out.println("Breaking at " + number);
//				break;
//			}
//			int x = 10325;
//			int y = x%10;
//			System.out.println(y);
		isPalindrome(11);
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome2(101));
		}
	public static boolean isPalindrome(int number){
		if(number < 10){
            return false;
        }
		int actualNumber = number;
        int reverse = 0;
        int multiplier = 1;
        int addition = 0;
        while(number != 0){
            int digit = number % 10;
        
            number = number / 10;
           
            addition = multiplier * digit;
            reverse = reverse + addition;
            
            multiplier = multiplier * 10;
            
        }
        
        if(actualNumber == reverse){
            return true;
        }return false;
    }
	public static boolean isPalindrome2(int number) 
    {
        if (number < 0) 
        {
            number *= -1;
        }
        
        int reverse = 0;
        int stored = number;
        while (stored > 0) 
        {
            // extract the lest-significant digit
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            // drop the least-significant digit
            stored /= 10;   // same as number = number / 10;
        }
 
        if (number == reverse) 
        {
            return true;
        } else 
            {
            return false; 
            }
 
    }

	}
	


