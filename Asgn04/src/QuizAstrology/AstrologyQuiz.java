package QuizAstrology;//Package Create for Doing WindowsBuilder
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AstrologyQuiz extends JFrame {//Main Class in this class initialize all Graphics Like RadioButtons,Buttons labels and text
	private JPanel contentPane;  //Main Panel into this has all Graphics Structures
	private JPanel panelfull; //Inside this panel was build for storage the elements for the Scroll  
	private JPanel panel;// Panel to storage the Name Box
	private JScrollPane scrollPane;//Scroll to have the capacity to show all questions
	private JLabel labelName;// Label for Write Name
	private JTextField txtName;// Text Box for Write the name
	protected JLabel lblQestion1; // Label for Question
	protected JRadioButton rdbtn1optionA;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn1optionB;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn1optionC;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn1optionD;//RadioButton for Write Options read for the file
	private JPanel panelRbtn1;//In this panel have the RadioButon and label for questions and option
	protected JLabel lblQestion2;// Label for Question
	protected JRadioButton rdbtn2optionA;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn2optionB;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn2optionC;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn2optionD;//RadioButton for Write Options read for the file
	private JPanel panelRbtn2;//In this panel have the RadioButon and label for questions and option
	protected JLabel lblQestion3;// Label for Question
	protected JRadioButton rdbtn3optionA;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn3optionB;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn3optionC;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn3optionD;//RadioButton for Write Options read for the file
	private JPanel panelRbtn3;//In this panel have the RadioButon and label for questions and option
	protected JLabel lblQestion4;// Label for Question
	protected JRadioButton rdbtn4optionA;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn4optionB;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn4optionC;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn4optionD;//RadioButton for Write Options read for the file
	private JPanel panelRbtn4;//In this panel have the RadioButon and label for questions and option
	protected JLabel lblQestion5;// Label for Question
	protected JRadioButton rdbtn5optionA;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn5optionB;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn5optionC;//RadioButton for Write Options read for the file
	protected JRadioButton rdbtn5optionD;//RadioButton for Write Options read for the file
	private JPanel panelRbtn5;//In this panel have the RadioButon and label for questions and option
	private final ButtonGroup buttonGroup1 = new ButtonGroup();//This are the group of the Radio Buttons for have only one choose
	private final ButtonGroup buttonGroup2 = new ButtonGroup();//This are the group of the Radio Buttons for have only one choose
	private final ButtonGroup buttonGroup3 = new ButtonGroup();//This are the group of the Radio Buttons for have only one choose
	private final ButtonGroup buttonGroup4 = new ButtonGroup();//This are the group of the Radio Buttons for have only one choose
	private final ButtonGroup buttonGroup5 = new ButtonGroup();//This are the group of the Radio Buttons for have only one choose
	protected JRadioButton[] buttons;// Group of the Radio Button for working in the diferent part of the program
	protected JLabel[] lblQestion;// Group of the labels for insert the question for working in the diferent part of the program
	//protected ButtonGroup[] rdbtngroup;
	private JButton btnSend;//Variable for the button
	private ArrayList<Answer> Answer;// Variable to get the information storage with question and answer
	private ArrayList<Answer> Question;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {// main program with the windows buider graphics interface
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AstrologyQuiz frame = new AstrologyQuiz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void SetupComponents() {//Methods to setup all components 
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 520);
		setTitle("Astrology Quiz");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));		
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		scrollPane=new JScrollPane();
		scrollPane.setBounds(5,63, 580, 362);
		
		panelfull=new JPanel();	
		panelfull.setPreferredSize(new Dimension(560, 815));//(5, 5, 580, 322);
		scrollPane.setViewportView(panelfull);
		
		contentPane.add(scrollPane);
		panelfull.setLayout(null);
		
	
		
		panel = new JPanel();
		panel.setBounds(5, 11, 580, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		labelName = new JLabel("Name:");
		labelName.setBounds(10, 11, 46, 14);
		panel.add(labelName);
		
		txtName = new JTextField();
		txtName.setBounds(50, 8, 381, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		
		lblQestion1 = new JLabel("New label");
		lblQestion1.setBounds(10, 11, 544, 29);
		panelfull.add(lblQestion1);
		
		panelRbtn1 = new JPanel();
		panelRbtn1.setBounds(10, 40, 544, 123);
		panelfull.add(panelRbtn1);
		panelRbtn1.setLayout(null);
		
		rdbtn1optionA = new JRadioButton("New radio button");
		buttonGroup1.add(rdbtn1optionA);
		rdbtn1optionA.setBounds(6, 7, 544, 23);
		panelRbtn1.add(rdbtn1optionA);
		
		rdbtn1optionB = new JRadioButton("New radio button");
		buttonGroup1.add(rdbtn1optionB);
		rdbtn1optionB.setBounds(6, 33, 544, 23);
		panelRbtn1.add(rdbtn1optionB);
		
		rdbtn1optionC = new JRadioButton("New radio button");
		buttonGroup1.add(rdbtn1optionC);
		rdbtn1optionC.setBounds(6, 59, 544, 23);
		panelRbtn1.add(rdbtn1optionC);
		
		rdbtn1optionD = new JRadioButton("New radio button");
		buttonGroup1.add(rdbtn1optionD);
		rdbtn1optionD.setBounds(6, 85, 544, 23);
		panelRbtn1.add(rdbtn1optionD);
		
		lblQestion2 = new JLabel("New label");
		lblQestion2.setBounds(10, 171, 544, 29);
		panelfull.add(lblQestion2);
		
		panelRbtn2 = new JPanel();
		panelRbtn2.setBounds(10, 200, 544, 123);
		panelfull.add(panelRbtn2);
		panelRbtn2.setLayout(null);
		
		rdbtn2optionA = new JRadioButton("New radio button");
		buttonGroup2.add(rdbtn2optionA);
		rdbtn2optionA.setBounds(6, 7, 544, 23);
		panelRbtn2.add(rdbtn2optionA);
		
		rdbtn2optionB = new JRadioButton("New radio button");
		buttonGroup2.add(rdbtn2optionB);
		rdbtn2optionB.setBounds(6, 33, 544, 23);
		panelRbtn2.add(rdbtn2optionB);
		
		rdbtn2optionC = new JRadioButton("New radio button");
		buttonGroup2.add(rdbtn2optionC);
		rdbtn2optionC.setBounds(6, 59, 544, 23);
		panelRbtn2.add(rdbtn2optionC);
		
		rdbtn2optionD = new JRadioButton("New radio button");
		buttonGroup2.add(rdbtn2optionD);
		rdbtn2optionD.setBounds(6, 85, 544, 23);
		panelRbtn2.add(rdbtn2optionD);
		
		lblQestion3 = new JLabel("New label");
		lblQestion3.setBounds(10, 331, 544, 29);
		panelfull.add(lblQestion3);
		
		panelRbtn3 = new JPanel();
		panelRbtn3.setBounds(10,360, 544, 123);
		panelfull.add(panelRbtn3);
		panelRbtn3.setLayout(null);
		
		rdbtn3optionA = new JRadioButton("New radio button");
		buttonGroup3.add(rdbtn3optionA);
		rdbtn3optionA.setBounds(6, 7, 544, 23);
		panelRbtn3.add(rdbtn3optionA);
		
		rdbtn3optionB = new JRadioButton("New radio button");
		buttonGroup3.add(rdbtn3optionB);
		rdbtn3optionB.setBounds(6, 33, 544, 23);
		panelRbtn3.add(rdbtn3optionB);
		
		rdbtn3optionC = new JRadioButton("New radio button");
		buttonGroup3.add(rdbtn3optionC);
		rdbtn3optionC.setBounds(6, 59, 544, 23);
		panelRbtn3.add(rdbtn3optionC);
		
		rdbtn3optionD = new JRadioButton("New radio button");
		buttonGroup3.add(rdbtn3optionD);
		rdbtn3optionD.setBounds(6, 85, 544, 23);
		panelRbtn3.add(rdbtn3optionD);
		
		lblQestion4 = new JLabel("New label");
		lblQestion4.setBounds(10,491, 544, 29);
		panelfull.add(lblQestion4);
		
		panelRbtn4 = new JPanel();
		panelRbtn4.setBounds(10,520, 544, 123);
		panelfull.add(panelRbtn4);
		panelRbtn4.setLayout(null);
		
		rdbtn4optionA = new JRadioButton("New radio button");
		buttonGroup4.add(rdbtn4optionA);
		rdbtn4optionA.setBounds(6, 7, 544, 23);
		panelRbtn4.add(rdbtn4optionA);
		
		rdbtn4optionB = new JRadioButton("New radio button");
		buttonGroup4.add(rdbtn4optionB);
		rdbtn4optionB.setBounds(6, 33, 544, 23);
		panelRbtn4.add(rdbtn4optionB);
		
		rdbtn4optionC = new JRadioButton("New radio button");
		buttonGroup4.add(rdbtn4optionC);
		rdbtn4optionC.setBounds(6, 59, 544, 23);
		panelRbtn4.add(rdbtn4optionC);
		
		rdbtn4optionD = new JRadioButton("New radio button");
		buttonGroup4.add(rdbtn4optionD);
		rdbtn4optionD.setBounds(6, 85, 544, 23);
		panelRbtn4.add(rdbtn4optionD);
		
		lblQestion5 = new JLabel("New label");
		lblQestion5.setBounds(10,651, 544, 29);
		panelfull.add(lblQestion5);
		
		panelRbtn5 = new JPanel();
		panelRbtn5.setBounds(10,680, 544, 123);
		panelfull.add(panelRbtn5);
		panelRbtn5.setLayout(null);
		
		rdbtn5optionA = new JRadioButton("New radio button");
		buttonGroup5.add(rdbtn5optionA);
		rdbtn5optionA.setBounds(6, 7, 544, 23);
		panelRbtn5.add(rdbtn5optionA);
		
		rdbtn5optionB = new JRadioButton("New radio button");
		buttonGroup5.add(rdbtn5optionB);
		rdbtn5optionB.setBounds(6, 33, 544, 23);
		panelRbtn5.add(rdbtn5optionB);
		
		rdbtn5optionC = new JRadioButton("New radio button");
		buttonGroup5.add(rdbtn5optionC);
		rdbtn5optionC.setBounds(6, 59, 544, 23);
		panelRbtn5.add(rdbtn5optionC);
		
		rdbtn5optionD = new JRadioButton("New radio button");
		buttonGroup5.add(rdbtn5optionD);
		rdbtn5optionD.setBounds(6, 85, 544, 23);
		panelRbtn5.add(rdbtn5optionD);
		
		btnSend = new JButton("Submit");
		btnSend.setBounds(5, 436, 569, 34);
		contentPane.add(btnSend);
		
		buttons=new JRadioButton[]{ rdbtn1optionA, rdbtn1optionB,rdbtn1optionC, rdbtn1optionD,
					rdbtn2optionA, rdbtn2optionB, rdbtn2optionC, rdbtn2optionD, rdbtn3optionA,
					rdbtn3optionB, rdbtn3optionC, rdbtn3optionD, rdbtn4optionA, rdbtn4optionB,
					rdbtn4optionC, rdbtn4optionD, rdbtn5optionA, rdbtn5optionB, rdbtn5optionC,
					rdbtn5optionD };
		lblQestion=new JLabel[] {lblQestion1,lblQestion2,lblQestion3,lblQestion4,lblQestion5};
		
		//rdbtngroup=new ButtonGroup[] {buttonGroup1,buttonGroup2,buttonGroup3,buttonGroup4};
				
	}
	
	public void EventHandeler() {
		ArrayList <Integer> choose=new ArrayList<>();
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		          int i=1;
		          boolean flag=false;
	                for (JRadioButton buttoncount : buttons) {
	                    if (buttoncount.isSelected()) {
	                        choose.add(i);
	                        flag=true;
	  
	                    }                    
	                    i++;
	                    if(i==5) {
	                    	i=1;
	                    	if(flag) {
	                    		flag=false;
	                    	}
	                    	else {
	                    		choose.add(55);
	                    	}
	                    }
	                }
	        		ArrayList <Integer> correct=new ArrayList<>();
	        		for (i=0;i<Answer.size();i++) {
	        			correct.add(Integer.parseInt(Answer.get(i).toString()));
	        		}
	        		
	        		System.out.println(choose);

	        		System.out.println(correct);
	        		SetandGetData data =new SetandGetData();
	        		String grade=data.checkAnsweres(correct, choose);
	        		grade="Hi "+txtName.getText()+" Your Score is " +grade;
	        		
	        		JOptionPane.showMessageDialog(null,grade);
	        		
	                choose.clear();
	                return;
			}
		});

	}
	
	public void MainInstructions() {
		SetandGetData data =new SetandGetData();
		data.initialhide(AstrologyQuiz.this);
		Questions ques =new Questions();
		Question = new ArrayList<>();
		Answer = new ArrayList<>();
		Questions QaA;
		QaA=ques.createquestions();
		Question=QaA.Question;
		Answer=QaA.Answer;
		System.out.println(Question.toString());
		System.out.println(Question.get(1).toString());
		int lblindex=0;
		int btindex=0;
		for(int i=0;i<Question.size();i++) {
			if(i%5==0) {
				lblQestion[lblindex].setText(Question.get(i).toString().substring(2));
				lblindex++;
			}
			else {
				buttons[btindex].setText(Question.get(i).toString().substring(2));
				btindex++;
			}
			
		}
		data.initialshow(AstrologyQuiz.this);

		
		
		
		//JOptionPane.showMessageDialog(null,printS);

	}

	/**
	 * Create the frame.
	 */
	public AstrologyQuiz() {
		
		SetupComponents();
		MainInstructions();
		EventHandeler();

	}
}
