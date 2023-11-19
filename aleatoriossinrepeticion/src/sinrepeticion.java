
public class sinrepeticion {
	
	public boolean revisar(int []data,int numberarray,int numbercomparison) {
		boolean validar=true;
		for (int i=0;i<numberarray;i++)
		{
			if(numbercomparison==data[i]) validar=false;
		}
		return validar;
	}

}
