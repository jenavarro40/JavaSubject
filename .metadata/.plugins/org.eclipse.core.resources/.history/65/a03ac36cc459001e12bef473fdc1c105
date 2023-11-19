public class MastermindGame {

	// The number of possible by guess
	public static final int MAX_GUESS = 12;

	// The main program
	public static void main(String[] args) {

		// create the CodeMaker and CodeBreaker objects
		CodeMaker cm = new CodeMaker();
		CodeBreaker cb = new CodeBreaker();

		// generate the secret code
		cm.makeSecretCode();

		System.out.println("Welcome to Mastermind.");
		System.out.print("I generated a secrete code. Please guess (R, P, O, Y, G, B): ");

		for (int i = 0; i < MAX_GUESS; i++) {

			// get player's input
			cb.getGuessCodeInput();

			// match the input and the secret code
			if (cm.getSecretCode().compare(cb.getGuessCode())) {
				System.out.println("Congratulations! You win!");
				return;
			}

			// find the hints by coder maker
			int numBlack = cm.getSecretCode().getNumBlackKeyPegs(cb.getGuessCode());
			int numWhite = cm.getSecretCode().getNumWhiteKeyPegs(cb.getGuessCode());
			System.out.println("Sorry! It is not correct.");
			System.out.println("Hints: " + numBlack + " Black and " + numWhite + " White");
			if (i != MastermindGame.MAX_GUESS - 1) {
				System.out.print("Please guess again (" + (MastermindGame.MAX_GUESS - i - 1) + " guesses left): ");
			}
		}
		System.out.println("Sorry! You loss.");
		System.out.print("The secrete code is: ");
		cm.getSecretCode().printCode();

	}

}