import java.util.Scanner;

public class MockQuiz01 {

	public static void main(String[] args) {
		int number = importdata();
		printParallelogram(number);

	}

	public static int importdata() {
		Scanner scan=new Scanner(System.in);
		String paralelogram="";
		int numberofparalelogram=0;
		System.out.println("write the number of paralelogram");
		paralelogram=scan.nextLine();
		numberofparalelogram=Integer.parseInt(paralelogram);		
		return numberofparalelogram;
		
	}

	public static void printParallelogram(int number) {

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = 0; j < number; j++)
				System.out.print("*");
			System.out.println();

		}
	}

}
