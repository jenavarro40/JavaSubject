
import java.io.*;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;



public class EstudioMidTerm {

	public static void main(String[] args) {
		
		  FileSystem fs = FileSystems.getDefault(); 
		  Path path=fs.getPath("files.txt");
		  
		  path=path.toAbsolutePath(); System.out.println(path.toString());
		  try {
			BasicFileAttributes attr=Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println(attr.size());
			System.out.println(attr.lastAccessTime());
			System.out.println(attr.lastModifiedTime());
			System.out.println(attr.creationTime());
			Path fileName = path.getFileName();
			System.out.println(fileName.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		
		/*
		 * 
		 * String fileName = "files.txt"; // Replace with your file name File file = new
		 * File(fileName);
		 * 
		 * if (Desktop.isDesktopSupported()) { Desktop desktop = Desktop.getDesktop();
		 * 
		 * try { desktop.open(file); } catch (IOException e) { e.printStackTrace(); //
		 * Handle exceptions if the file cannot be opened } } } }
		 */

		String name;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a file name >> ");
		name = keyboard.nextLine();
		Path inputPath = Paths.get(name);
		Path fullPath = inputPath.toAbsolutePath();
		System.out.println("Full path is " + fullPath.toString());
	}
}
