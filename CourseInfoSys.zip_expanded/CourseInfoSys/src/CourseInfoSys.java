import java.util.ArrayList;
import java.util.Scanner;

public class CourseInfoSys {

	public static void main(String[] args) {
		
		
		ArrayList<Student> InternalNombreClase1= new ArrayList<>();

	//	ArrayList<Student> InternalNombreClase2= new ArrayList<>();


			char choose='a';
			String choosel="";
			while(choose!='E') {
				Scanner scan=new Scanner(System.in);
				System.out.println("Welcome to Course Info. System.");
				System.out.println("Please select an option:");
				System.out.println("(R)ead students from file");
				System.out.println("(S)how all students");
				System.out.println("(F)ind students by name");
				System.out.println("(E)xit");				
				System.out.print("Enter your option >> ");
				choose=scan.nextLine().charAt(0);
				if (choose=='R' ) {
					System.out.print("Enter the course code >> ");
					choosel=scan.nextLine();
					if (choosel.equalsIgnoreCase("CSIS1175")){
						ReadFile read=new ReadFile();
						ReadFile Export1=read.readfile1();
						InternalNombreClase1=Export1.getNombreClase();
						System.out.println(InternalNombreClase1);
					}
					else if(choosel.equalsIgnoreCase("CSIS2175")) {
						ReadFile read=new ReadFile();
						ReadFile Export2=read.readfile2();
						InternalNombreClase1=Export2.getNombreClase();
						System.out.println(InternalNombreClase1);
						
					}
				}
				else if(choose=='S') {
					String [] value;
					int value1=0;
					for(int i=0;i<InternalNombreClase1.size();i++) {
						String internal=InternalNombreClase1.get(i).toString();
						value=internal.split(",");
						value1=Integer.parseInt(value[1])+value1;
						System.out.println(value[0]);
				
					}
					System.out.println("Total number of students: "+InternalNombreClase1.size());
					double value2=value1/+InternalNombreClase1.size();
					System.out.println("Average marks "+value2);

				}
				else if(choose=='F') {
					System.out.print("Enter the key >>");
					String choose2=scan.nextLine();
					String [] value;
					int value1=0;
					for(int i=0;i<InternalNombreClase1.size();i++) {
						String internal=InternalNombreClase1.get(i).toString();
						value=internal.split("\\(");
						String []value2;
						if(value[0].contains(choose2)) {
							internal=InternalNombreClase1.get(i).toString();
							value2=internal.split(",");
							System.out.println(value2[0]);
							
						}
						
						
					}
					
				}
			}
			


	}

}
