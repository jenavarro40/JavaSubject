
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question {

	private int QuestionAndAnswerNumber;// in this variable insert the number of the array
	private int NumberOptions;// in this variable insert the number of the array
	Variables[][] ExitStoreQaA;//this obeject to storage the question
	Variables[] ExitAnswer;//this obeject to storage the answer

	public Question() {// Default constructor

	}
	
	
	//constructor to storage question and answers

	public Question(Variables[][] ExitStoreQaA, Variables[] ExitAnswer) {// a contructor to storage answer and questions
		this.ExitStoreQaA = ExitStoreQaA;
		this.ExitAnswer = ExitAnswer;
	}

	/**
	 * @return the questionAndAnswerNumber
	 */
	public int getQuestionAndAnswerNumber() {
		return QuestionAndAnswerNumber;
	}

	/**
	 * @param questionAndAnswerNumber the questionAndAnswerNumber to set
	 */
	public void setQuestionAndAnswerNumber(int questionAndAnswerNumber) {
		QuestionAndAnswerNumber = questionAndAnswerNumber;
	}

	/**
	 * @return the numberOptions
	 */
	public int getNumberOptions() {
		return NumberOptions;
	}

	/**
	 * @param numberOptions the numberOptions to set
	 */
	public void setNumberOptions(int numberOptions) {
		NumberOptions = numberOptions;
	}

	/**
	 * @return the exitStoreQaA
	 */
	public Variables[][] getExitStoreQaA() {
		return ExitStoreQaA;
	}

	/**
	 * @param exitStoreQaA the exitStoreQaA to set
	 */
	public void setExitStoreQaA(Variables[][] exitStoreQaA) {
		ExitStoreQaA = exitStoreQaA;
	}

	/**
	 * @return the exitAnswer
	 */
	public Variables[] getExitAnswer() {
		return ExitAnswer;
	}

	/**
	 * @param exitAnswer the exitAnswer to set
	 */
	public void setExitAnswer(Variables[] exitAnswer) {
		ExitAnswer = exitAnswer;
	}

	public Question StoreData() {
		Variables[][] StoreQaA = new Variables[NumberOptions][QuestionAndAnswerNumber];// Initialize with info introduce in the main program
		Variables[] Answers = new Variables[QuestionAndAnswerNumber];// Initialize with info introduce in the main program
		String path = "Files\\AstrologyQuiz.txt";//in this variable storage the path for the file in ths case the path is relative to the main folder of the project
		File file = new File(path);// In this command is initialize the file
		try {// is necessary try catch because if the file not found require a error message 
			Scanner scan = new Scanner(file);
			scan.nextLine();
			String pivot;
			int answer;
			//like know the number of lines in the file can be used the loop with for
			for (int i = 0; i < StoreQaA.length; i++) {
				char Letter = 'A';
				for (int j = 0; j < StoreQaA[1].length; j++) {
					pivot = scan.nextLine();// read the file

					if (j == 0) {// for all first line is the question inside this if put the number of question and is storage
						pivot = "Question " + (i + 1) + ": " + pivot;
						Variables store = new Variables(pivot);
						StoreQaA[i][j] = store;
					} else {
						if (pivot.charAt(0) == '*') {//read the correct answer
							pivot = pivot.substring(1);// delete the * in the correct answer
							answer = j;// storage the answer
							Variables option = new Variables(answer);// storage the answer
							Answers[i] = option;//storage in the array the anwer
						}
						pivot = Letter + ": " + pivot;// create the question with the leeter of the option
						Variables store = new Variables(pivot);
						StoreQaA[i][j] = store;// storage the options A,B,C,D
						Letter++; // incriase the letter for the storage the next answer

					}
				}

			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Question(StoreQaA, Answers);// return the question and answer

	}
}
