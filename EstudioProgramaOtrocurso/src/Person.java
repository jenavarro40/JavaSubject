import java.util.Scanner;

public class Person {

	private String month;
	private String day;
	private int year;

	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	NameAndAddress naad=new NameAndAddress();

	public void Person() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month of birth e.g. for Jan enter 1");
		boolean flag = true;
		while (flag) {
			try {
				int month_int = scan.nextInt();
				if (month_int > 0 & month_int <= 12) {
					if(month_int<10) month="0"+month_int;
					else month=""+month_int;
					flag = false;
				}
				else
					System.out.println("invalid Month, enter the day of birth again");

			} catch (java.lang.NumberFormatException e) {
				System.out.println("invalid Month, enter the day of birth again");
			}
		}

		flag = true;
		System.out.println("Enter the day of birth e.g. 7");
		while (flag) {
			try {
				int day_int = scan.nextInt();
				if (day_int > 0 & day_int <= 31) {
					if(day_int<10) day="0"+day_int;
					else day=""+day_int;
					flag = false;

				}
				else
					System.out.println("invalid day, enter the day of birth again");

			} catch (java.lang.NumberFormatException e) {
				System.out.println("invalid day, enter the day of birth again");
			}
		}
		flag = true;

		System.out.println("Enter the year of birth");

		while (flag) {
			try {
				year = scan.nextInt();
				if (year > 1900 & year <= (2023-18))
					flag = false;
				else
					System.out.println("invalid year, enter the year of birth again");

			} catch (java.lang.NumberFormatException e) {
				System.out.println("invalid year, enter the year of birth again");
			}
		}
	}
}
