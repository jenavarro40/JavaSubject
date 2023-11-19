import java.util.Scanner;

public class Main3_5 {

	public static void main(String[] args) {
		int one=1;
		double number1=inputdata(one);
		one=2;
		double number2=inputdata(one);
		computePercent(number1,number2);
		computePercent(number2,number1);

	}

	public static double inputdata(int one) {
		Scanner scan=new Scanner(System.in);
		
		double input=0;
		boolean flag=true;
		String inputS="";
		String OneS="";
		
		if (one == 1) OneS="One";
		else OneS="Two";
		while (flag) {
			System.out.println("Ingres Number " + OneS);
			inputS=scan.nextLine();
			try {
				input=Integer.parseInt(inputS);
				flag=false;	
			}
			catch (java.lang.NumberFormatException e) { System.out.println("try again");}
		}
		//scan.close();
		return input;
	}
	public static void computePercent(double number1,double number2) {
		double number3=(number1/number2)*100;
		double number4=70.0;
		System.out.println("the "+ number1 + " is " +number3+"% of: "+number2 );
		double number5=number4*number3/100;
		System.out.println("the "+ number3 + "% of " +number4+" is: "+number5 );
		
		
	}
}
