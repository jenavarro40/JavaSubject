import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Input number1: ");
		int input1 = entrada.nextInt();
		System.out.println("Input number2: ");
		int input2 = entrada.nextInt();
		System.out.println("Input number3: ");
		int input3 = entrada.nextInt();
		int mayor;
		
		if(input1>=input2) {
			mayor=input1;
		}
		else {
			mayor=input2;
		}
		if (mayor<input3) {
			mayor=input3;
		}
		
		System.out.println("the mayor is: "+mayor);
		
	}	


}
