import java.io.*;
import java.util.Scanner;

public class ElevationSystem {

	public static void main(String[] args) {
		String path="Elevation.txt";
		File file=new File(path);
		int Numberofcity=0;
		try {
			Scanner scan=new Scanner(file);
			Numberofcity=scan.nextInt();
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//System.out.println(Numberofcity);
		Country count =new Country();
		count.setNumberofingress(Numberofcity);
		City [] ExitCity=new City[Numberofcity];
		Country [] ExitCountry=new Country[Numberofcity];
		Country Exit=count.GetDataFile();
		ExitCity=Exit.getArrayCity();
		ExitCountry=Exit.getArrayname();
				char choose='q';
		Scanner scan=new Scanner(System.in);
		while(choose!='3') {
			System.out.println("Please choose:");
			System.out.println("1. Search the highest city in different countries");
			System.out.println("2. Search a city");
			System.out.println("3. QUIT");
			System.out.print("Your choice:");
			choose=scan.nextLine().charAt(0);
			if(choose=='1') {
				for (int i=0;i<count.getNumberofingress();i++) {
					System.out.print("The highest city of ");					
					System.out.print(ExitCountry[i]+ ": " );
					System.out.println(ExitCity[i] );
				}
			}
		
		}
		
		
		
		
	}

}
