import java.time.LocalDate;
import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args) {

		String Address[] = new String[3];
		String[] Name = new String[3];
		String[] day = new String[3];
		String[] month = new String[3];
		int [] year = new int[3];
		int[] id = new int[3];
		double[] balance = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("**************************************");
			switch (i) {
			case 0:
				System.out.println("Let's create the first account");
				break;
			case 1:
				System.out.println("Let's create the Second account");
				break;
			case 2:
				System.out.println("Let's create the Third account");
				break;
			}
			NameAndAddress naad = new NameAndAddress();
			naad.NameAndAddress();
			Address[i] = naad.getAdress();
			Name[i] = naad.getName();
			Person person = new Person();
			person.Person();
			day[i] = person.getDay();
			month[i] = person.getMonth();
			year[i] = person.getYear();
			Account account = new Account();
			boolean flag2 = true;
			while (flag2) {
				account.Acount_ID();
				int id_s = account.getAccountid();
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						if (id[j] == id_s)
							System.out.println("Igual Id");
						else {

							if (j == i - 1) {
								id[i] = account.getAccountid();
								flag2 = false;
							}
						}

					}
				} else {
					id[i] = account.getAccountid();
					flag2 = false;
				}
			}

			account.Acount_Balance();

			balance[i] = account.getBalance();
			System.out.println("Account holder information");
			System.out.println("Name: " + Name[i]);
			System.out.println("Address: " + Address[i]);
			System.out.println("DOB: " + year[i] + "-" + month[i] + "-" + day[i]);
			System.out.println("Id: " + id[i]);
			System.out.println("Balance: " + balance[i]);
			System.out.println("Date: " + LocalDate.now());
		}
		

		Scanner scan = new Scanner(System.in);
		int arrayi=0;
		boolean flag=true;
		boolean flag2=true;
		System.out.println("Welcome to ATM");
		System.out.println("Enter an id to search for:");
		while (flag2) {
			int search = scan.nextInt();
			for(int i=0;i<3;i++){
				if(id[i]==search) {
					arrayi=i;
					flag2=false;
				}
				
				else if(i==2) {System.out.println("ID does not exist");}
				
			}
		}

		while (flag) {
			
				
			
			System.out.println("MAIN MENU");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: account details");
			System.out.println("5: exit");
			System.out.println("Enter a choice");
			int choose=0;
			boolean flag3=true;
			while(flag3) {
				choose = scan.nextInt();
				if(choose>0 & choose<6)flag3=false;
				else System.out.println("Enter a choice Again");
				
			} 
			switch (choose) {
			case 1:System.out.println("Balance: " + balance[arrayi]);break;
			case 2:{
				
				System.out.println("Enter the amount to withdraw");
				double withdraw = scan.nextInt();
				if((balance[arrayi]-withdraw)>0) balance[arrayi]=balance[arrayi]-withdraw;
				else System.out.println("not enouhg founds");
				break;			
			}
			case 3:{
				
				System.out.println("Enter the amount to withdraw");
				double deposit = scan.nextInt();
				balance[arrayi]=balance[arrayi]+deposit;
				break;
			}
			case 4:{
				System.out.println("Account holder information");
				System.out.println("Name: " + Name[arrayi]);
				System.out.println("Address: " + Address[arrayi]);
				System.out.println("DOB: " + year[arrayi] + "-" + month[arrayi] + "-" + day[arrayi]);
				System.out.println("Id: " + id[arrayi]);
				System.out.println("Balance: " + balance[arrayi]);
				System.out.println("Date: " + LocalDate.now());
				break;
				
			}
			case 5:flag=false;break;
			}
			
			
		}
		
	}

}
