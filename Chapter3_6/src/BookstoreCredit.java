import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Student Name:");
		String name=scan.nextLine();
		double grade=0;
		String gradeS="";
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("Student Grade(0-5):");
			gradeS=scan.nextLine();
			try {
				grade=Double.parseDouble(gradeS);
				if (grade>=0.0 & grade<=5) flag=false;
				else System.out.println("Error grade Try again");
				
			}
			catch (java.lang.NumberFormatException e) {System.out.println("Error Data Try again");}

			
		}
		bonus Bonus=new bonus();
		Bonus.setName(name);
		Bonus.setGrade(grade);
		Bonus.porcentage();
		
			

	}

}
