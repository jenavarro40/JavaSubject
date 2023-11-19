import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Scanner;

public class EstudioMidTerm2 {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path path3=fs.getPath("");
		System.out.println(path3.toAbsolutePath().toString());
		Path path = fs.getPath("Carpet//files.txt");
		Path path1 = fs.getPath("files2.txt");
		Path path2 = fs.getPath("files3.txt");
		if (path2.toAbsolutePath().getParent().toString().equals(path.toAbsolutePath().getParent().toString())) {
			if (path2.toAbsolutePath().getParent().toString().equals(path1.toAbsolutePath().getParent().toString())) {
				System.out.println("Archivo en misma carpeta");
			} else {

				System.out.println("Archivo en diferentes carpeta");

			}
		} else {
			System.out.println("Archivo en diferentes carpeta");

		}
		try {
			BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println(attr.size());
			System.out.println("Tamaño de " + path.toString() + " es: " + attr.size() + " Bytes");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BasicFileAttributes attr1 = Files.readAttributes(path1, BasicFileAttributes.class);
			System.out.println("Tamaño de " + path1.toString() + " es: " + attr1.size() + " Bytes");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BasicFileAttributes attr2 = Files.readAttributes(path2, BasicFileAttributes.class);
			System.out.println("Tamaño de " + path2.toString() + " es: " + attr2.size() + " Bytes");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList <String> files=new ArrayList<>();
		String CurrentLines="";
		String pathfiles=".";
		try {
			BufferedReader br=new BufferedReader(new FileReader("archivosnombres.txt"));
			CurrentLines=br.readLine();
			while(CurrentLines!=null) {
				
				files.add(CurrentLines);
				File file=new File(pathfiles,CurrentLines);
				if (file.exists()) System.out.println(CurrentLines + " Existe");
				else System.out.println(CurrentLines + " No Existe");
				CurrentLines=br.readLine();
				
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String Opath="otro_archivo.txt";
		
		File file1=new File(Opath);
		try {
			PrintWriter pw=new PrintWriter(new FileWriter("Exit.txt"));
			PrintWriter pw1=new PrintWriter(new FileWriter("Exit1.txt"));
			Scanner scan=new Scanner(file1);
			ArrayList <variables>  files1=new ArrayList<>();
			ArrayList <String>  files2=new ArrayList<>();
			String [] info;
			while(scan.hasNextLine()) {
				info=scan.nextLine().split(",");
				variables var3=new variables(info[0],info[2]);
				files1.add(var3);
				files2.add(info[1]);
				
				
			}
			
			for(int i=0;i<files1.size();i++) {
				pw.println(files1.get(i));
			}
			for(int i=0;i<files1.size();i++) {
				pw1.println(files2.get(i));
			}
			pw.close();
			pw1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
