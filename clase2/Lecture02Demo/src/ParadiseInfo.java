
public class ParadiseInfo {

	public final static String GREETING = "Welcome to Paradise Spa";
	
	public static double computeDiscountInfo(double price, 
			double discountRate) {
		double saving;
		saving = price * discountRate / 100;
		if(saving < 0) {
			return 0;
		}
		return saving;
	}
	
	public static int computeDiscountInfo(double price, 
			int discountRate) {
		int saving;
		saving = (int) (price * discountRate / 100);
		if(saving < 0) {
			return 0;
		}
		return saving;
	}
	
	public static double computeDiscountInfo(double price) {
		double saving;
		saving = price * 5.0 / 100;
		if(saving < 0) {
			return 0;
		}
		return saving;
	}
	
	public static void displayInfo() {
		System.out.println(GREETING);
		System.out.println("Paradise Day Spa wants to pamper you.");
		System.out.println("We will make you look good.");
	}
	
	public static void main(String[] args) {
		displayInfo();
		
		double price = 150.0;
		double rate = 10.0;
		
		double saving = computeDiscountInfo(price, 30);
		
		System.out.println("Special this week:");
		System.out.println("Discount of " + rate + " percent");
		System.out.println("That's a saving of at least $" + saving);
		
		
	}

}
