package ejemplo6;

import java.util.Scanner;



public class average {

	public static void main(String[] args) {
		int tamaño = 0;
		Scanner scan=new Scanner(System.in);
		int valido=0;
		while (valido!=1) {
			try {
				
				System.out.println("Input numbr of numbers ");
				tamaño=scan.nextInt();
				valido=1;
			}
			catch (java.util.InputMismatchException e){
				System.err.println("Error Please write again");
                scan.next();
			}
		}
		System.out.println(tamaño);
		int [] values=new int[tamaño];
		for (int i=0;i<values.length;i++)
		{
			valido=0;
			while (valido!=1) {
				try {
					
					System.out.println("Input number ");
					values[i]=scan.nextInt();
					valido=1;
				}
				catch (java.util.InputMismatchException e){
					System.err.println("Error Please write again");
	                scan.next();
				}
			}
		}
		int max=values[0];
		double average=0;
		for (int i=0;i<values.length;i++)
		{
			if(values[i]>max)
			{
				max=values[i];
			}
			average=average+values[i];
		}
		System.out.println("The sum is "+average);
		average=average/values.length;
		System.out.println("The Max Value is "+max);
		System.out.println("The Average Value is "+average);
		
			
		
		scan.close();
	}

}
