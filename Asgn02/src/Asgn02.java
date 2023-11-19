import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Asgn02 {

	public static void main(String[] args) {
		int NumberLinesPerQuestion = 0;//Variable to storage number of lines in one question
		int NumberQuestion = 0; //Variable to Storage Number of question it will be read from the file
		String path = "Files\\AstrologyQuiz.txt";//in this variable storage the path for the file in ths case the path is relative to the main folder of the project
		int NumberLines = 0;
		File file = new File(path);// In this command is initialize the file
		try {// is necessary try catch because if the file not found require a error message 
			Scanner scan = new Scanner(file);// with this command could read the lines of the file
			NumberQuestion = Integer.parseInt(scan.nextLine());//read the first line number of question and convert it in integer
			while (scan.hasNextLine()) {// doing a a loop in this case to while it loop finish when the file do not have more lines
				NumberLines++;// increment the number of lines in the file this is doing to know the lenght of the array in the next steps
				scan.nextLine();//Read all lines for doing a count
			}
			scan.close();//close the file
			NumberLinesPerQuestion = NumberLines / NumberQuestion;// doing the number of lines in each question this logic required the all questions has the same lenght

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(NumberQuestion);
		Question question = new Question();//Initialize the class question where i storage the all questions 
		question.setNumberOptions(NumberLinesPerQuestion);// set the number for the length of the arrays
		question.setQuestionAndAnswerNumber(NumberQuestion);// set the number for the length of the arrays

		Variables[][] StoreQaA = new Variables[NumberLinesPerQuestion][NumberQuestion];//Initialize the object instance variable for working in the class and can to convert in 
		Variables[] Answered = new Variables[NumberQuestion];//Initialize the object instance variable for working in the class and can to convert in 


		Question ExitData = question.StoreData();//INSTANCE VARIABLE QUESTION IN THIS STORAGE THE ALL QUESTIONS
		Answered = ExitData.getExitAnswer();//RETURN QUESTION
		StoreQaA = ExitData.getExitStoreQaA();//RETURN CORRECT ANSWER

		Scanner scan = new Scanner(System.in);// INITILIZA THE Scan for the input data
		int grade = 0;// initializa variable grade of the quiz
		System.out.println("Welcome to Astrology Test");
		
		// in this for print the question and wait for the answer when this is finish continue 

		for (int i = 0; i < StoreQaA.length; i++) {
			for (int j = 0; j < StoreQaA[1].length; j++) {
				System.out.println(StoreQaA[i][j]);
			}
			System.out.print("Enter your answer (A, B, C, or D): ");
			String input = scan.next();
			char LetterAnswer = input.charAt(0);//read the character input by the user
			int NumberAnswer = 7;
			char CorrectAnswer = 'A' - 1;// begin character 1 less than the A for add to write the correct answer
			switch (LetterAnswer) {// this switch change the answer ltter in one munber to compare with the correct answer
			case 'A':
				NumberAnswer = 1;
				break;
			case 'B':
				NumberAnswer = 2;
				break;
			case 'C':
				NumberAnswer = 3;
				break;
			case 'D':
				NumberAnswer = 4;
				break;
			default:
				System.out.println("Error in data");
			}
			int Value = Integer.parseInt(Answered[i].toString());//take the value and pass to string using the month into the variables
			if (Value == NumberAnswer) {//comparison correct answer
				grade++;
				System.out.println("Correct.");
			} else {
				char result = (char) (CorrectAnswer + Value);
				System.out.println("Incorrect. The correct answer is " + result);
			}

		}
		System.out.println("Total score: " + grade + " out of " + StoreQaA.length);// last print
	}
}
