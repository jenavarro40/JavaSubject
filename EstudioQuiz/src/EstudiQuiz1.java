import java.util.Scanner;

public class EstudiQuiz1 {

	public static void main(String[] args) {
		
		Scanner sacn=new Scanner(System.in);
		System.out.println("Ingrese numero y dele enter ");
		String sumastring=sacn.nextLine();
		int suma1=Integer.parseInt(sumastring);
		int suma=ejemplo(suma1);
		System.out.println("Resultado= "+ suma);
		System.out.println("Ingrese numero y dele enter ");
		int sumaint=sacn.nextInt();
		int suma2=ejemplo(sumaint);
		System.out.println("Resultado= "+ suma2);
		sacn.close();
		Ejemploclase ejm=new Ejemploclase();
		ejm.setNumber1(suma2);
		ejm.ejemplo2();
		int resultado=ejm.getNumber1();
		System.out.println("entender= "+ resultado);
		
		


	}
	
	public static int ejemplo (int suma) {
		System.out.println("Hola a Todos el numero que ingreso es "+ suma);
		int suma1=suma*10;
		return suma1;
	}

}
