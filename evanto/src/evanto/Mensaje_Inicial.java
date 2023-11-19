package evanto;

import java.util.Scanner;

public class Mensaje_Inicial {
	private static int Input=0;
	private static double Persons=0;
	private static int consecutivo;
	public static int getConsecutivo() {
		return consecutivo;
	}

	public static void setConsecutivo(int consecutivo) {
		Mensaje_Inicial.consecutivo = consecutivo;
	}

	public int getInput() {
		return Input;
	}

	public void setInput(int input) {
		Input = input;
	}

	public double getPersons() {
		return Persons;
	}

	public void setPersons(int persons) {
		Persons = persons;
	}

	public static void mensajeinicial() {
		System.out.println(" ********************************************************* ");
		System.out.println(" *                                                       * ");
		System.out.println(" *                  Catering Javier                      * ");
		System.out.println(" *                                                       * ");
		System.out.println(" ********************************************************* ");
	}
	
	public static void inputdata() {
		Scanner scan=new Scanner(System.in);
		String InputS="";
		boolean flag=true;
		while(flag) {
			System.out.println("Please Write People number:");
			InputS=scan.nextLine();
			try {
				Input=Integer.parseInt(InputS);
				flag=false;				
			}
			catch (java.lang.NumberFormatException e) {System.out.println("Format error Try Again");}
			
		}
		flag=true;
		while(flag) {
			System.out.println("Please Value per person");
			InputS=scan.nextLine();
			try {
				Persons=Integer.parseInt(InputS);
				flag=false;				
			}
			catch (java.lang.NumberFormatException e) {System.out.println("Format error Try Again");}
			
		}
		

		
	}
	
	public double calculus (int users,double value){
		double cost=0;
		cost=users*value;
		return cost;
		
	}
	
	public void consecutivo() {
		

		String ConsecutivoS;
		if(consecutivo<10) ConsecutivoS="00"+consecutivo;
		else if(consecutivo<100) ConsecutivoS="0"+consecutivo;
		else ConsecutivoS= ""+consecutivo;
		System.out.println("Event number: Evento"+ConsecutivoS);

		
	}

}
