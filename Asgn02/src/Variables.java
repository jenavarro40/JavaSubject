
public class Variables {
	
	//Creation of the instance varibales to use in the program
	
	private String QuestionStorage;

	private int Answer;


	public Variables() {// Default constructor

	}
	
	public Variables(String QuestionStorage) {// used to insert questions and answer
		
		this.QuestionStorage=QuestionStorage;


	}
	
	public Variables(int Answer) {// used to insert correct answer
		
		this.Answer=Answer;
	}

	/**
	 * @return the questionStorage
	 */
	public String getQuestionStorage() {
		return QuestionStorage;
	}

	/**
	 * @param questionStorage the questionStorage to set
	 */
	public void setQuestionStorage(String QuestionStorage) {
		this.QuestionStorage = QuestionStorage;
	}


	/**
	 * @return the answer
	 */
	public int getAnswer() {
		return Answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(int Answer) {
		this.Answer = Answer;
	}
	
	
	
	// used to pass the object to string 
	 @Override
	    public String toString() {
		 if(QuestionStorage!=null)
	        return QuestionStorage ;
		 else
			 return ""+Answer;
	    }


}
