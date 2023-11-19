import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadQuestions {

	public void RQdatabase() {
		Scanner scan = new Scanner(System.in);
		String ReadSQL;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException cnfex) {
			System.out.println("Problem in loadinanng or " + "registering MS Access JDBC driver");
			cnfex.printStackTrace();
		}

		String msAccDB = "Question.accdb";
		String dbURL = "jdbc:ucanaccess://" + msAccDB;
		try {
			connection = DriverManager.getConnection(dbURL);
			statement = connection.createStatement();
			ReadSQL = "SELECT * FROM QUESTIONS";
			System.out.println(ReadSQL);
			resultSet = statement.executeQuery(ReadSQL);
			double sum = 0;
			while (resultSet.next()) {
				if (resultSet.getString("TYPE").equals("MC")) {
					System.out.print(resultSet.getString("QTEXT"));
					System.out.println(" (" + resultSet.getDouble("POINT") + ")");
					String[] answer;
					answer = resultSet.getString("ANSWER").split("##");
					char choose = 'A';
					char ans = 0;
					for (int i=0; i < answer.length; i++) {
						if (answer[i].charAt(0) == '*') {
							answer[i] = answer[i].substring(1);
							ans = choose;
						}
						System.out.println(choose + ": " + answer[i]);
						choose++;
						
					}
					System.out.print("Enter your choice >>");
					if (scan.nextLine().toUpperCase().charAt(0) == ans) {
						System.out.println("You are correct!");
						sum = sum + resultSet.getDouble("POINT");
					} else {
						System.out.println("You are wrong. The correct answer is " + ans + ".");
					}

				}
				else {
					System.out.print(resultSet.getString("QTEXT"));
					System.out.println(" (" + resultSet.getDouble("POINT") + ")");
					System.out.print("True(T) or False(F) >>");
					String TF=scan.nextLine();
					TF.toLowerCase();
					if (TF.toLowerCase().charAt(0) == resultSet.getString("ANSWER").charAt(0)){
						System.out.println("You are correct!");
						sum = sum + resultSet.getDouble("POINT");
					}
					else {
						System.out.println("You are wrong. The correct answer is "+resultSet.getString("ANSWER").toUpperCase().charAt(0));
					}
					
				}
			}
			System.out.println("The quiz ends. Your score is "+sum);

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
