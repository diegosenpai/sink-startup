package ec.com.orion.learning.books.sinkstartup.tests;

public class SingleStartupKill {

	public static void main(String[] args) {
		int [] dummyPositions = {1,2,3};
		int [] guessedPositions = {2,1,3};
		SingleStartup singleStartup = new SingleStartup();
		singleStartup.setPositions(dummyPositions);
		String outcome = null;
		for(int guessed : guessedPositions) {
			outcome = singleStartup.checkAttack(guessed);
		}
		String result = "failed";
		if("kill".equals(outcome)) {
			result = "passed";
		}
		System.out.println(result);
	}
	
}
