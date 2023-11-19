import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Country {

	private int NumberofCity;
	City[] CityInFile;
	String[] NameCountry;

	public Country() {

	}

	public Country(String[] NameCountry, City[] CityInFile) {

		this.NameCountry = NameCountry;
		this.CityInFile = CityInFile;

	}

	/**
	 * @return the numberofCity
	 */
	public int getNumberofCity() {
		return NumberofCity;
	}

	/**
	 * @param numberofCity the numberofCity to set
	 */
	public void setNumberofCity(int numberofCity) {
		NumberofCity = numberofCity;
	}

	/**
	 * @return the cityInFile
	 */
	public City[] getCityInFile() {
		return CityInFile;
	}

	/**
	 * @param cityInFile the cityInFile to set
	 */
	public void setCityInFile(City[] cityInFile) {
		CityInFile = cityInFile;
	}

	/**
	 * @return the nameCountry
	 */
	public String[] getNameCountry() {
		return NameCountry;
	}

	/**
	 * @param nameCountry the nameCountry to set
	 */
	public void setNameCountry(String[] nameCountry) {
		NameCountry = nameCountry;
	}

	public Country InsertData() {
		City [] ImportDataCity= new City[NumberofCity];
		String [] NameCountryfile= new String[NumberofCity];
		String path = "Elevation.txt";
		File file = new File(path);
		Scanner scan;
		try {
			scan = new Scanner(file);
			scan.nextLine(); 
			String [] InsertData;
			for (int i = 0; i < NumberofCity; i++) {
				InsertData=scan.nextLine().split("##");
				NameCountryfile[i]=InsertData[1];
				int ValueHeight=Integer.parseInt(InsertData[2]);
				City Insertcity =new City(InsertData[0],ValueHeight) ;
				ImportDataCity[i]=Insertcity;
								
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Country allCaountryInfo=new Country(NameCountryfile,ImportDataCity);
		return allCaountryInfo;

	}
	


}
