import java.util.Scanner;

public class Account {

	private int accountid;
	private double balance;

	/**
	 * @return the accountid
	 */
	public int getAccountid() {
		return accountid;
	}

	/**
	 * @param accountid the accountid to set
	 */
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Acount_ID() {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		System.out.println("Enter account id");

		while (flag) {
			try {

				accountid = scan.nextInt();
				if (accountid > 1110 & accountid <= 9999)
					flag = false;
				else
					System.out.println("invalid account id, enter the accountid again");

			} catch (java.lang.NumberFormatException e) {
				System.out.println("invalid account id, enter the accountid again");
			}
		}

	}

	public void Acount_Balance() {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		System.out.println("Enter the account's initial balance");

		while (flag) {
			try {

				balance = scan.nextDouble();
				if (accountid > 0)
					flag = false;
				else
					System.out.println("invalid account's initial balance, enter account's initial balance again");

			} catch (java.lang.NumberFormatException e) {
				System.out.println("invalid account's initial balance, enter the account's initial balance again");
			}

		}

	}

}
