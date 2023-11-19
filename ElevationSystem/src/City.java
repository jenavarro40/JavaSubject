
public class City {
	
	private String NameCity;
	private int Height;
	
	public City () {
	}
	
	public City (String NameCity, int Height ) {
		this.NameCity=NameCity;
		this.Height=Height;
		
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
	public void setNameCity(String NameCity) {
		this.NameCity = NameCity;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return Height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int Height) {
		this.Height = Height;
	}
	
	@Override
		public String toString() {
			return (NameCity +"("+ Height +")");
		}
}
