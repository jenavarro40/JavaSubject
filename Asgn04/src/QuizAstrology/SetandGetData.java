package QuizAstrology;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class SetandGetData {
	
	//private JRadioButton[] buttons;

	public void initialhide(AstrologyQuiz AQ) {
		
		for (JRadioButton boton:AQ.buttons) {
			boton.setVisible(false);
		}
		for (JLabel labeles:AQ.lblQestion) {
			labeles.setVisible(false);
		}
			
	}

	public void initialshow(AstrologyQuiz AQ) {
		for (JRadioButton boton:AQ.buttons) {
			boton.setVisible(true);
		}
		for (JLabel labeles:AQ.lblQestion) {
			labeles.setVisible(true);
		}
	
	}
	
	public String checkAnsweres(ArrayList<Integer> a, ArrayList<Integer> b ) {
		int grade=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==b.get(i)) {
				grade++;
			}
		}
		
		return String.valueOf(grade);
		
	}


}
