package Varad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fact2 {

	public static void main(String[] args) throws IOException {

		File f1 = new File("C:/Users/varad/eclipse-workspace/ReverseString/src/Pak2/Varad1234.txt");
		if (f1.createNewFile()) {
			System.out.println("Created new file");
		} else {
			System.out.println("Allready created file");
		}
		FileWriter w = new FileWriter("C:/Users/varad/eclipse-workspace/ReverseString/src/Pak2/Varad1234.txt");
		try {
			
			w.write("I'm Kanthale");
			
		} catch (Exception e) {
			
			e.printStackTrace();

		} finally {
			w.close();
			
			System.out.println("Write operation perform");

		}
	}

}
