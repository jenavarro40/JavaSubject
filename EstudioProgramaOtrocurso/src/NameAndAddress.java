import java.util.Scanner;

public class NameAndAddress {
	
	private String Name;
	private String Adress;


	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String Name) {
		this.Name = Name;
	}

	/**
	 * @return the adress
	 */
	public String getAdress() {
		return Adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String Adress) {
		this.Adress = Adress;
	}
	
	public void NameAndAddress () {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter account holder information");
		System.out.println("Enter name");
		Name=scan.nextLine();
		System.out.println("Enter address");
		Adress=scan.nextLine();
		
	}
	
}
