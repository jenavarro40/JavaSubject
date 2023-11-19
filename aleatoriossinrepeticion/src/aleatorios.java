import java.util.Random;

public class aleatorios {

	public static void main(String[] args) {
		Random random=new Random();
		sinrepeticion repi=new sinrepeticion();
		int [] number=new int[10];
		int i_while=0;
		int aleatorio=0;
		while (i_while<number.length) {
			aleatorio=random.nextInt(15);
			while(repi.revisar(number, i_while, aleatorio)) {
				number[i_while]=aleatorio;
				i_while++;
			}
				
		}
		for (int i=0;i<number.length;i++) {
			System.out.print(number[i] + " ");
		}


	}

}
