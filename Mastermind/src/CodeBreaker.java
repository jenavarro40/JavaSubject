import java.util.Scanner;

public class CodeBreaker {

// A member variable of Code to store the guess code
	Code guessCode;

// default constructor
	public CodeBreaker() {
	}

// getter of guessCode
	public Code getGuessCode() { 
		return guessCode;  // with this instruction return the char array with the user input code 
		  				  // this secret code is doing inside the method getGuessCodeInput inside that 
		 				 // Using the class code method to ask the values to the user 
	}

// setter of guessCode
	public void setGuessCode(Code guessCode) {
		this.guessCode = guessCode;
	}

// This is a method to get the guess code from the player, and store
// the input to guessCode.
	public void getGuessCodeInput() {
		Scanner scan = new Scanner(System.in); //Initialize thScanner to ask for the input usere 
		String codescan=scan.nextLine(); // Ask the input user
		Code code=new Code(); //Initialize the Class code
		int a=0;

		// With this for take the user input and put this information into the code class and storage in Temporally char  pegs
		for (int i = 0; i <code.getPegs().length;  i++) {			
			code.setPeg(codescan.charAt(a), i); 
			a=a+2;
		}
		
		guessCode=new Code (code.getPeg(0),code.getPeg(1),code.getPeg(2),code.getPeg(3)); //storage this information in guessCode
																						  // With this data are get in the main program 
		                                                                                 // with this data and the secret data in the class code 
																						// doing the comparison and count of black and white in three diferents method compare,
		                                                                               // getNumBlackKeyPegs, getNumWhiteKeyPegs
	}
	


}