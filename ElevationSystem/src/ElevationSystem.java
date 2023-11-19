import java.io.*;
import java.util.Scanner;

public class ElevationSystem {

	public static void main(String[] args) {

		String path = "Elevation.txt";
		File file = new File(path);
		Scanner scan;
		int NumberofCity = 0;
		try {
			scan = new Scanner(file);
			NumberofCity = Integer.parseInt(scan.nextLine());

			scan.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Country count = new Country();
		count.setNumberofCity(NumberofCity);
		City[] CityinFile = new City[NumberofCity];
		String[] CountryinFile = new String[NumberofCity];
		Country exit = count.InsertData();

		CountryinFile = exit.getNameCountry();
		CityinFile = exit.getCityInFile();
		char input = 'a';
		String Pais;
		Scanner scanner = new Scanner(System.in);
		String Ciudad;

		while (input != '3') {
			System.out.println("Please choose:");
			System.out.println("1. Search the highest city in different countries");
			System.out.println("2. Search a city");
			System.out.println("3. QUIT");
			System.out.print("Your choice:");
			input = scanner.nextLine().charAt(0);
			if (input == '1') {
				for (int i = 0; i < NumberofCity; i++) {
					System.out.println("The highest city of " + CountryinFile[i] + ": " + CityinFile[i]);
				}

			}
			if (input == '2') {
				System.out.print("Enter a keyword >");
				Pais = scanner.nextLine();
				//System.out.println(Pais);
				int chhose = 1;
				String[] Ciudad1;
				for (int i = 0; i < NumberofCity; i++) {
					Ciudad = CityinFile[i].toString();
					Ciudad1 = Ciudad.split("\\(");
					if (Pais.equalsIgnoreCase(Ciudad1[0])) {
						System.out.println(chhose + ":" + CityinFile[i]);

					} else if(Ciudad1[0].contains(Pais))
					{
						System.out.println(chhose + ":" + CityinFile[i]);
						chhose++;

					}
				}

			}

		}

	}

	/*
	 * for (int i = 0; i < NumberofCity; i++) { System.out.println(CountryinFile[i]
	 * +" "+ CityinFile[i]); }
	 */
}
