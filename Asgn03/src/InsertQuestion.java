import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertQuestion {

	private MCQuestion MCoptions;
	private TFQuestion TFoptions;

	/**
	 * @return the mCoptions
	 */
	public MCQuestion getMCoptions() {
		return MCoptions;
	}

	/**
	 * @param mCoptions the mCoptions to set
	 */
	public void setMCoptions(MCQuestion mCoptions) {
		MCoptions = mCoptions;
	}

	/**
	 * @return the tCoptions
	 */
	public TFQuestion getTCoptions() {
		return TFoptions;
	}

	/**
	 * @param tCoptions the tCoptions to set
	 */
	public void setTCoptions(TFQuestion TFoptions) {
		this.TFoptions = TFoptions;
	}

	public MCQuestion insertMC() {
		Scanner scan = new Scanner(System.in);
		MCQuestion Questions = new MCQuestion();
		System.out.print("Enter the question text >>");
		String Question = scan.nextLine();
		char OptionLetter = 'A';
		System.out.print("How many options?");
		String numberoptions = scan.nextLine();
		int numberoption = Integer.parseInt(numberoptions);
		while (numberoption < 3 || numberoption > 5) {
			System.out.print("Values between 3 and 5 How many options?");
			numberoptions = scan.nextLine();
			numberoption = Integer.parseInt(numberoptions);
		}
		boolean flag = true;
		while (flag) {
			int flagmorethanone = 0;
			for (int i = 0; i < numberoption; i++) {
				System.out.print("Enter Option " + OptionLetter + " (Start with * for correct answer) >>");
				String answer = scan.nextLine();
				if (answer.charAt(0) == '*') {
					flag = false;
					flagmorethanone++;
					if (flagmorethanone > 1)
						flag = true;
				}
				Questions.addOption(answer);
				OptionLetter++;
			}
			if (flag == true) {
				System.out.println("Do not have Correct Answer");
				OptionLetter = 'A';
				Questions.clearOption();

			}

		}
		System.out.print("How many points?");
		int grade = scan.nextInt();
		MCoptions = new MCQuestion(Question, Questions.getOptions(), grade);
		System.out.println(MCoptions.toString());
		return MCoptions;

	}

	public TFQuestion insertTF() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the question text >>");
		String Question = scan.nextLine();
		System.out.print("Answer is True or False?");
		String numberoptions = scan.nextLine();
		while (!numberoptions.equalsIgnoreCase("True") && !numberoptions.equalsIgnoreCase("False")) {
			System.out.print("Error in ingress, Answer is True or False?");
			numberoptions = scan.nextLine();
		}
		boolean numberoption = Boolean.parseBoolean(numberoptions.toLowerCase());
		System.out.print("How many points?");
		int grade = scan.nextInt();
		TFoptions = new TFQuestion(Question, numberoption, grade);
		System.out.println(TFoptions.toString());
		return TFoptions;
	}

	public void writedatabase(String chooseQuestion, MCQuestion MCoptions,TFQuestion TFoptions) {
		String insertSQL;
		Connection connection = null;
		Statement statement = null;
		// ResultSet resultSet = null;

		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException cnfex) {
			System.out.println("Problem in loading or " + "registering MS Access JDBC driver");
			cnfex.printStackTrace();
		}

		String msAccDB = "Question.accdb";
		String dbURL = "jdbc:ucanaccess://" + msAccDB;
		try {
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			if (chooseQuestion.equalsIgnoreCase("MC")) {
				String[] Options;
				Options = MCoptions.toString().split("&");
				String changetostring = "" + Options[1];
				changetostring = changetostring.replace(", ", "##");
				changetostring = changetostring.replace("[", "");
				changetostring = changetostring.replace("]", "");
				insertSQL = "INSERT INTO QUESTIONS (QTEXT, ANSWER,POINT,TYPE) VALUES('" + Options[0] + "','"
						+ changetostring + "'," + Double.parseDouble(Options[2]) + ",'MC')";
			} else {
				String[] Options;
				Options = TFoptions.toString().split(",");
				insertSQL = "INSERT INTO QUESTIONS (QTEXT, ANSWER,POINT,TYPE) VALUES('" + Options[0] + "','"
						+ Options[1] + "'," + Double.parseDouble(Options[2]) + ",'TF')";

			}
			System.out.println(insertSQL);
			statement.executeUpdate(insertSQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}