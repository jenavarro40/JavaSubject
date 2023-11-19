import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Country {

	private int numberofingress;
	private String NameCountry;
	private City[] ArrayCity;
	private Country[] Arrayname;

	public Country() {

	}

	public Country(String NameCountry) {
		this.NameCountry = NameCountry;

	}

	public Country(Country[] ArrayName, City[] ArrayCity) {
		this.Arrayname = ArrayName;
		this.ArrayCity = ArrayCity;
	}

	/**
	 * @return the numberofingress
	 */
	public int getNumberofingress() {
		return numberofingress;
	}

	/**
	 * @param numberofingress the numberofingress to set
	 */
	public void setNumberofingress(int numberofingress) {
		this.numberofingress = numberofingress;
	}

	/**
	 * @return the nameCountry
	 */
	public String getNameCountry() {
		return NameCountry;
	}

	/**
	 * @param nameCountry the nameCountry to set
	 */
	public void setNameCountry(String nameCountry) {
		NameCountry = nameCountry;
	}

	/**
	 * @return the arrayname
	 */
	public Country[] getArrayname() {
		return Arrayname;
	}

	/**
	 * @param arrayname the arrayname to set
	 */
	public void setArrayname(Country[] arrayname) {
		Arrayname = arrayname;
	}

	/**
	 * @return the arrayCity
	 */
	public City[] getArrayCity() {
		return ArrayCity;
	}

	/**
	 * @param arrayCity the arrayCity to set
	 */
	public void setArrayCity(City[] arrayCity) {
		ArrayCity = arrayCity;
	}

	public Country GetDataFile() {
		Country[] ArraynameValue = new Country[numberofingress];
		City[] ArrayCityValue = new City[numberofingress];
		String path = "Elevation.txt";
		File file = new File(path);
		try {
			Scanner scan = new Scanner(file);
			scan.nextLine();
			String[] input;
			for (int i = 0; i < numberofingress; i++) {
				input = scan.nextLine().split("##");
				int VarHeight = Integer.parseInt(input[2]);
				Country InputCountry = new Country(input[1]);
				City InputCity = new City(input[0], VarHeight);
				ArraynameValue[i] = InputCountry;
				ArrayCityValue[i] = InputCity;
			}
			scan.close();

			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Country ExitData = new Country(ArraynameValue, ArrayCityValue);
		return ExitData;

	}

	@Override
	public String toString() {
		return NameCountry;
	}

}
