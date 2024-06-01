package Varad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fact {

	public static void main(String[] args) throws Exception {
		

		File f1 = new File("C:/Users/varad/eclipse-workspace/ReverseString/src/Pak2/Akash1234.txt");
		if (f1.createNewFile()) {
			System.out.println("Created new file");
		} else {
			System.out.println("Allready created file");
		}
		FileWriter w = new FileWriter("C:/Users/varad/eclipse-workspace/ReverseString/src/Pak2/Akash1234.txt");
		try {
			
			w.write("Hii varad");
			
		} catch (Exception e) {
			
			e.printStackTrace();

		} finally {
			w.close();
			
			System.out.println("Write operation perform");

		}

	}

}
