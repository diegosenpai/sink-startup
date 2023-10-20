package ec.com.orion.learning.books.sinkstartup.tests;

import java.util.Scanner;

public class GameHelper {

	public int getUserInput(String someText) {
		System.out.println(someText+":");
		Scanner userInput = new Scanner(System.in);
		return userInput.nextInt();
	}
	
}
