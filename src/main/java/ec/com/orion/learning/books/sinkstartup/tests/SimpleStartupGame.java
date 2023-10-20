package ec.com.orion.learning.books.sinkstartup.tests;

public class SimpleStartupGame {

	public static void main(String[] args) {
		int numberOfGuesses = 0;
		boolean isAlive = true;
		SingleStartup startup = new SingleStartup();
		int randomValue = (int)(Math.random()*5);	
		int [] positions = {randomValue,randomValue+1,randomValue+2};
		startup.setPositions(positions);
		GameHelper gameHelper = new GameHelper();
		while(isAlive) {
			int userInput = gameHelper.getUserInput("Enter a number");
			String checkAttack = startup.checkAttack(userInput);
			numberOfGuesses++;	
			if("kill".equals(checkAttack)) {
				isAlive = false;
				System.out.println("You took : "+numberOfGuesses+" guesses");
			}
		}
	}
	
}
