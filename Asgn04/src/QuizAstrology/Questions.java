package QuizAstrology;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.StringValueExp;

public class Questions{

	public ArrayList<Answer> Question = new ArrayList<>();
	public ArrayList<Answer> Answer = new ArrayList<>();

	
	public Questions () {
		
	}
	
	public Questions(ArrayList<Answer> Question,ArrayList<Answer> Answer) {
		this.Question=Question;
		this.Answer=Answer;
	}

	public Questions createquestions() {
		Answer Ques;
		Answer ans;
		Questions output;
		String path = "AstrologyQuiz.txt";
		File file =new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			int i=0;
			while(scanner.hasNextLine()) {
				String input=scanner.nextLine();
				if(input.charAt(0)=='*') {
					ans=new Answer(i);
					Answer.add(ans);
					input=input.substring(1);
				}
				Ques=new Answer(i+"."+input);
				Question.add(Ques);
				i++;
				if(i==5) i=0;			
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Question.toString());
		output=new Questions(Question,Answer);
		return output;

	}
}
