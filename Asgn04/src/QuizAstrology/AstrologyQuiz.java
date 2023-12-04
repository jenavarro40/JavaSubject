package QuizAstrology;

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

public class AstrologyQuiz extends JFrame {
	private JPanel contentPane;
	private JPanel panelfull;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JLabel labelName;
	private JTextField txtName;
	protected JLabel lblQestion1;
	protected JRadioButton rdbtn1optionA;
	protected JRadioButton rdbtn1optionB;
	protected JRadioButton rdbtn1optionC;
	protected JRadioButton rdbtn1optionD;
	private JPanel panelRbtn1;
	protected JLabel lblQestion2;
	protected JRadioButton rdbtn2optionA;
	protected JRadioButton rdbtn2optionB;
	protected JRadioButton rdbtn2optionC;
	protected JRadioButton rdbtn2optionD;
	private JPanel panelRbtn2;
	protected JLabel lblQestion3;
	protected JRadioButton rdbtn3optionA;
	protected JRadioButton rdbtn3optionB;
	protected JRadioButton rdbtn3optionC;
	protected JRadioButton rdbtn3optionD;
	private JPanel panelRbtn3;
	protected JLabel lblQestion4;
	protected JRadioButton rdbtn4optionA;
	protected JRadioButton rdbtn4optionB;
	protected JRadioButton rdbtn4optionC;
	protected JRadioButton rdbtn4optionD;
	private JPanel panelRbtn4;
	protected JLabel lblQestion5;
	protected JRadioButton rdbtn5optionA;
	protected JRadioButton rdbtn5optionB;
	protected JRadioButton rdbtn5optionC;
	protected JRadioButton rdbtn5optionD;
	private JPanel panelRbtn5;
	private final ButtonGroup buttonGroup1 = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private final ButtonGroup buttonGroup3 = new ButtonGroup();
	private final ButtonGroup buttonGroup4 = new ButtonGroup();
	private final ButtonGroup buttonGroup5 = new ButtonGroup();
	protected JRadioButton[] buttons;
	protected JLabel[] lblQestion;
	//protected ButtonGroup[] rdbtngroup;
	private JButton btnSend;
	private ArrayList<Answer> Answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	
	private void SetupComponents() {
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 520);
		setTitle("AstrologyQuiz");
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
		
		labelName = new JLabel("Name");
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
			}
		});

	}
	
	public void MainInstructions() {
		SetandGetData data =new SetandGetData();
		data.initialhide(AstrologyQuiz.this);
		Questions ques =new Questions();
		ArrayList<Answer> Question = new ArrayList<>();
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
