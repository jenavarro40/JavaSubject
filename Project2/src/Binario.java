
public class Binario {

	public static void main(String[] args) {

		String binario="111";
		String hexad="";
		char Val;
		int dec=0;
		int num;
		int caracteres=binario.length();
		System.out.println(caracteres);
		for (int i=0; i<caracteres; i++)
		{
			
			Val=binario.charAt(caracteres-i-1);
			int dec1=Character.getNumericValue(Val)*(int)Math.pow(2, i);
			dec=dec+dec1;
			
		}
		System.out.println(dec);
		
		while (dec>7)
		{
			num=dec%8;
			dec=dec/8;
			if(num<10)
			{
				hexad=Integer.toString(num)+hexad;
			}
			else
			{
				switch (num)
				{
				case 10: hexad="A"+hexad;break;
				case 11: hexad="B"+hexad;break;
				case 12: hexad="C"+hexad;break;
				case 13: hexad="D"+hexad;break;
				case 14: hexad="E"+hexad;break;
				case 15: hexad="F"+hexad;break;
						
				}
			}
			
					
					
		}
		
		if(dec<10)
		{
			hexad=Integer.toString(dec)+hexad;
		}
		else
		{
			switch (dec)
			{
			case 10: hexad="A"+hexad;break;
			case 11: hexad="B"+hexad;break;
			case 12: hexad="C"+hexad;break;
			case 13: hexad="D"+hexad;break;
			case 14: hexad="E"+hexad;break;
			case 15: hexad="F"+hexad;break;
					
			}
		}
		
		System.out.println(hexad);

		


	}

}
