package ejemplo7;

import java.util.Scanner;

public class rombo {

	public static void main(String[] args) {
		char letter='A';
		Scanner input=new Scanner(System.in);
		boolean bandera=false;
		int numberfigure=0;
		while(!bandera)
		{
			try
			{
				System.out.println("Input lenght: ");
				numberfigure=input.nextInt();
				bandera=true;
			}
			catch (java.util.InputMismatchException e)
			{
				System.out.println("Try Again");
			}
			
		}
		int vacias=numberfigure-1;
		int llenas=1;
		int letras=1;
				
		for(int i =0;i<numberfigure;i++) {
			
			for (int j=0;j<vacias;j++) System.out.print(" ");
			for (int j=0;j<llenas;j++) {
				if((llenas+1)/2>letras) {
					
					System.out.print(letter);
					letter++;
				}
				else if((llenas+1)/2==letras)
				{					
					System.out.print(letter);

				}
				
				else  {
					letter--;
					System.out.print(letter);
				}
				letras++;
	
				
			}
			
			for (int j=0;j<vacias;j++) System.out.print(" ");
			System.out.println();
			vacias--;
			llenas=llenas+2;
			letras=1;
			letter='A';
			
			
			
			
		}
		vacias=vacias+1;
		llenas=llenas-2;
		for(int i =0;i<numberfigure;i++) {
			
			vacias++;
			llenas=llenas-2;
			letras=1;
			letter='A';
			for (int j=0;j<vacias;j++) System.out.print(" ");
			for (int j=0;j<llenas;j++) {
				if((llenas+1)/2>letras) {
					
					System.out.print(letter);
					letter++;
				}
				else if((llenas+1)/2==letras)
				{					
					System.out.print(letter);

				}
				
				else  {
					letter--;
					System.out.print(letter);
				}
				letras++;
	
				
			}
			
			for (int j=0;j<vacias;j++) System.out.print(" ");
			System.out.println();

		}
			
		

		input.close();
				

	}

}
