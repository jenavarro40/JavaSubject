
public class Example {

	public static void main(String[] args) {
		Code Example; 
		Code Example1;
		Code code=new Code();
		char var='A';
		for(int i=0;i<4;i++)
		{
			code.setPeg(var,i);
			var-=6;
		}
		Example=new Code(code.getPeg(0),code.getPeg(1),code.getPeg(2),code.getPeg(3));
		System.out.println(Example);
		Example1=new Code('A','A','A','A');
		System.out.print(Example1);

		

	}

}
