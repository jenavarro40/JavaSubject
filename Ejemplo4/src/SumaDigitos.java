import java.util.Scanner;

public class SumaDigitos {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Input number1: ");
		int input1 = entrada.nextInt();
		System.out.println("Input number2: ");
		int input2 = entrada.nextInt();
		int out1=input1 +input2;
		System.out.println("Result is: "+out1);
		entrada.close();
		String out1s=Integer.toString(out1);
		int caracteres=out1s.length();
		char out1c;
		int salida=0;
		for(int i=0;i<caracteres;i++) {
			out1c=out1s.charAt(i);
			int out1v=Character.getNumericValue(out1c);
			salida=salida+out1v;
			
		}
		System.out.println("Digit Sum is: "+salida);

	}

}
