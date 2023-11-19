import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class ReadFile {
	
	
	private ArrayList<Student> grade= new ArrayList<>();
	private ArrayList<Student> NombreClase= new ArrayList<>();
	

	
	public ArrayList<Student> getGrade() {
		return grade;
	}

	public void setGrade(ArrayList<Student> grade) {
		this.grade = grade;
	}


	
	public ReadFile() {
		
	}
	
	public ReadFile(ArrayList<Student> NombreClase) {
		this.NombreClase=NombreClase;
		
	}

	public ArrayList<Student> getNombreClase() {
		return NombreClase;
	}

	public void setNombreClase(ArrayList<Student> nombreClase) {
		NombreClase = nombreClase;
	}
	
	public ReadFile readfile1() {
		ArrayList<Student> Internalgrade= new ArrayList<>();
		ArrayList<Student> InternalNombreClase= new ArrayList<>();
		
		String path="CSIS1175.txt";
		File file=new File(path);
		String GradeLetter; 
		int grade=0;
		try {
			Scanner scan=new Scanner(file);
			String [] pivot;
			while(scan.hasNextLine()) {
				pivot=scan.nextLine().split(",");
				grade=Integer.parseInt(pivot[2]);
				Student stud =new Student();
				GradeLetter=stud.GetGrade(grade);
				Student NameS =new Student(pivot[0],pivot[1],GradeLetter,grade);

				InternalNombreClase.add(NameS);

			}
			scan.close();	
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReadFile export=new ReadFile (InternalNombreClase);
		return export;
		
	}
	public ReadFile readfile2() {
		ArrayList<Student> Internalgrade= new ArrayList<>();
		ArrayList<Student> InternalNombreClase= new ArrayList<>();
		
		String path="CSIS1175.txt";
		File file=new File(path);
		String GradeLetter; 
		int grade=0;
		try {
			Scanner scan=new Scanner(file);
			String [] pivot;
			while(scan.hasNextLine()) {
				pivot=scan.nextLine().split(",");
				grade=Integer.parseInt(pivot[2]);
				Student stud =new Student();
				GradeLetter=stud.GetGrade(grade);
				Student NameS =new Student(pivot[0],pivot[1],GradeLetter,grade);

				InternalNombreClase.add(NameS);

			}
			scan.close();	
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReadFile export=new ReadFile (InternalNombreClase);
		return export;
		
	}

}
