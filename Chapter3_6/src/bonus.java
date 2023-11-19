
public class bonus {
	private String name;
	private double grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void porcentage() {
		double credit=grade*10;
		System.out.println(name + " Your credit is:" + credit);
	}
	

}
