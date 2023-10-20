package ec.com.orion.learning.books.sinkstartup.tests;

public class SingleStartup {

	private int[] positions;
	private int numberOfHits;

	public void setPositions(int[] dummyPositions) {
		this.positions = dummyPositions;
		this.numberOfHits = 0;
		
	}

	public String checkAttack(int guessedPosition) {
		String result = "missed";
		for(int cell:positions) {
			if(guessedPosition == cell) {
				numberOfHits++;
				result = "hit";
				break;
			}
		}
		if(numberOfHits == positions.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}

}
