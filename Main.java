package Varad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException  {
		String line , content="";

		File f1 = new File("C:/Users/varad/eclipse-workspace/ReverseString/src/Pak2/Sudhir1234.txt");
		if (f1.createNewFile()) {
			System.out.println("Created new file");
		} else {
			System.out.println("Allready created file");
		}
		FileReader r=new FileReader("C:/Users/varad/eclipse-workspace/ReverseString/src/Pak2/Akash1234.txt");
	BufferedReader br=new BufferedReader(r);
	
	FileReader r2=new FileReader("C:/Users/varad/eclipse-workspace/ReverseString/src/Pak2/Varad1234.txt");
	BufferedReader br2=new BufferedReader(r2);
	
	
	for(line=br.readLine(); line !=null; line=br.readLine());
	content=content+line+"\n";
	br.close();
	
	for(line=br2.readLine(); line !=null; line=br2.readLine());
	content=content+line+"\n";
	br2.close();
	
	FileWriter fw=new FileWriter("C:/Users/varad/eclipse-workspace/ReverseString/src/Pak2/Sudhir1234.txt",true);
	
	fw.write(content);
	System.out.println("Sucessfully write operation perform");
	fw.close();
	}

}
