package QuizAstrology;

public class Answer extends Question {
	
	private int Answers;
	
	public Answer() {
		
	}
	
		
	public Answer(int Answers) {

		this.Answers=Answers;
		
	}

	public Answer(String Questions) {
		this.Questions=Questions;

	}

	/**
	 * @return the answers
	 */
	public int getAnswers() {
		return Answers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(int answers) {
		Answers = answers;
	}
	
	@Override
	public String toString() {
		if(Questions!=null)
			return ""+Questions;
		else
			return ""+Answers;
	}
	
	

}
