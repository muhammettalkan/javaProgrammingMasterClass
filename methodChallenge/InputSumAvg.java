package methodChallenge;

import java.util.Scanner;

public class InputSumAvg {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();

	}
	public static void inputThenPrintSumAndAverage(){
        String number;
        int sum=0;
        int average = 0;
        int loopCount = 0;
        do{
        try{
        	Scanner scan = new Scanner(System.in);
            number = scan.nextLine();
            int num = Integer.parseInt(number);
            sum += num;
            loopCount++;
            average = sum / loopCount;
        }
        catch(NumberFormatException nfe){
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
        }while(true);
    }
}
