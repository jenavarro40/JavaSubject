import java.util.ArrayList;

public class MCQuestion {
	
	private String questionText;
	private Double point;
	private ArrayList<String> options;
	private String answer;
	String option;

	
	public MCQuestion() {
		options = new ArrayList<>();
	}
	
	public MCQuestion(String questionText, ArrayList<String> options, double point) {
		this.questionText = questionText;
		this.options = options;
		this.point=point;
		
	}
	
	/**
	 * @return the questionText
	 */
	public String getQuestionText() {
		return questionText;
	}
	/**
	 * @param questionText the questionText to set
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	/**
	 * @return the point
	 */
	public Double getPoint() {
		return point;
	}
	/**
	 * @param point the point to set
	 */
	public void setPoint(Double point) {
		this.point = point;
	}
	/**
	 * @return the options
	 */
	public ArrayList<String> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	/**
	 * @return the option
	 */

	
	public void addOption(String option) {
		this.options.add(option);
	}

	public void clearOption() {
		this.options.clear();
	}	
	
	@Override
	public String toString() {
		return 	questionText+"&"+ options+"&"+ point;

	}
	
	
	

}
