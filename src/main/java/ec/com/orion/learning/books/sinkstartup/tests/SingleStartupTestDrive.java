package ec.com.orion.learning.books.sinkstartup.tests;

public class SingleStartupTestDrive {
	public static void main(String[] args) {
		SingleStartup newStartup = new SingleStartup();
		int [] dummyPositions = {2,3,4};
		newStartup.setPositions(dummyPositions);
		int guessedPosition = 3;
		String result = newStartup.checkAttack(guessedPosition);
		String expectedResult = "hit";
		String outcome = "Test Missed";
		if(expectedResult.compareTo(result) == 0) {
			outcome = "Test Passed";
		}
		System.out.println(outcome);
		
	}

}
