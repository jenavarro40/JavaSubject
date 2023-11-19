
public class variables {
	private String var1;
	private String var2;
	
	public variables() {
	}
	public variables(String var1,String var2 ) {
		this.var1=var1;
		this.var2=var2;
	}
	/**
	 * @return the var1
	 */
	public String getVar1() {
		return var1;
	}
	/**
	 * @param var1 the var1 to set
	 */
	public void setVar1(String var1) {
		this.var1 = var1;
	}
	/**
	 * @return the var2
	 */
	public String getVar2() {
		return var2;
	}
	/**
	 * @param var2 the var2 to set
	 */
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	
	@Override
	public String toString() {
		return(var1+" "+var2);
	}
	
	

}
