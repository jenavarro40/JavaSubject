
public class City {
	
	private String NameCity;
	private int height;
	
	
	public City() {
		
	}
	public City(String NameCity,int height ) {
		this.NameCity=NameCity;
		this.height=height;
	}
	
	/**
	 * @return the nameCity
	 */
	public String getNameCity() {
		return NameCity;
	}
	/**
	 * @param nameCity the nameCity to set
	 */
	public void setNameCity(String nameCity) {
		NameCity = nameCity;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	

	@Override
	public String toString() {
		return NameCity+","+height;
	}
	
	
	

}
