import java.util.Scanner;

public class Exercise2fortest {

	public static void main(String[] args) {
		int number = importdata();
		printParallelogram(number);

	}

	public static int importdata() {
		Scanner scan = new Scanner(System.in);
		String paralelogram = "";
		int numberofparalelogram = 0;
		System.out.println("write the number of paralelogram");
		paralelogram = scan.nextLine();
		numberofparalelogram = Integer.parseInt(paralelogram);
		return numberofparalelogram;
	}

	public static void printParallelogram(int number) {
		int h = 0;
		
		for (int x = -1; x < number; x++) {
			for(int z=0;z<h;z++) System.out.print(" ");// with this i do the slice
			for (int i = -1; i < number; i++) { // this one is draw figure
				for (int j = -1; j < i; j++)
				if (i > x) {
						System.out.print("*");
					} else {
						System.out.print(" ");
				}

				for (int j = 0; j < number + i; j++) { // this one print the spaces
					System.out.print(" ");
					
				}
			}
			System.out.println();
			h++;
		}
	}

}
