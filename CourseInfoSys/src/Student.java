
public class Student {
	
	private String NameStudent;
	private String CodeId;
	private int Grade;
	private String GradeLetter;
	
	
	public Student () {
		
	}
	
	public Student (String NameStudent,String CodeId,String GradeLetter,int Grade) {
		this.NameStudent=NameStudent;
		this.CodeId=CodeId;
		this.GradeLetter=GradeLetter;
		this.Grade=Grade;
		
	}
	

	public String getNameStudent() {
		return NameStudent;
	}
	public void setNameStudent(String nameStudent) {
		NameStudent = nameStudent;
	}
	public String getCodeId() {
		return CodeId;
	}
	public void setCodeId(String codeId) {
		CodeId = codeId;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}

	public String getGradeLetter() {
		return GradeLetter;
	}

	public void setGradeLetter(String gradeLetter) {
		GradeLetter = gradeLetter;
	}
	
	public String GetGrade(int Grade) {
		if(Grade<50)   GradeLetter="F";
		else if(Grade>=50 & Grade<55)   GradeLetter="D";
		else if(Grade>=55 & Grade<60)   GradeLetter="C-";
		else if(Grade>=60 & Grade<65)   GradeLetter="C";
		else if(Grade>=65 & Grade<70)   GradeLetter="C+";
		else if(Grade>=70 & Grade<75)   GradeLetter="B-";
		else if(Grade>=75 & Grade<80)   GradeLetter="B";
		else if(Grade>=80 & Grade<85)   GradeLetter="B+";
		else if(Grade>=85 & Grade<90)   GradeLetter="A-";
		else if(Grade>=90 & Grade<95)   GradeLetter="A";
		else  GradeLetter="A+";
		return GradeLetter;
	}

	@Override
	public String toString() {


	return NameStudent+"("+CodeId +")"+":"+GradeLetter+","+Grade;
	}
	
	
	

}
