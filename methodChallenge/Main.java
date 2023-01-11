package methodChallenge;

public class Main {

	public static void main(String[] args) {
		int highScorePosition = calculateHighscorePosition(1400);
		displayHighscorePosition("Mesut", highScorePosition);
		
		
		

	}

	public static void displayHighscorePosition(String playerName, int position) {
		
		System.out.println(playerName + " managed to get into position " + position + " on the high score list");
		
	}
	
	public static int calculateHighscorePosition(int score) {
		
		int position = 4;
		System.out.println("The player's score is: " + score);
		if( score >= 1000 ) {
			position = 1;
		}else if( score >= 500) {
			position = 2;
		}else if(score >= 100) {
			position = 3;
		}
		return position;
	
		
		
	}
}
