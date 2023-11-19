
public class Programa1Hello {

	public static void main(String[] args) {

		int a = 37;
		int div;
		int bin;
		int num=a;
		int num1=0;
		String binstring="";
		String binario="";
		
		String c=Integer.toString(a);
		int f=c.length();
		int d=f-1;
		
		System.out.println(d);
		for(int i=0;i<f;i++)
		{
		 int ar=num/(int)Math.pow(10,d);
		 num1=ar*(int)Math.pow(16,d)+num1;
		 num=num-(ar*(int)Math.pow(10,d));
		 d=d-1;
		 System.out.println(num1);
				 
		}
		div=(int)num1;
		bin=(int)num1;
		while(div!=0 )
		{
			bin=div%2;
			div=div/2;
			
			
			binario=binario + bin;
			
		}
		System.out.println(binario);
		
	
		
	}

}
