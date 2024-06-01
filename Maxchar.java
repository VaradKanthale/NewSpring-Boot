package Varad;

public class Maxchar {

	static char Maxvalue(String s) {
		char c =' ';
		int count= 0;
		char arr[]=new char[140];
		for(int i=0; i<s.length(); i++) {
			arr [s.charAt(i)]++;
		}
		for(int i=0; i<s.length(); i++) {
			char ch1= s.charAt(i);
			
			if(arr[ch1] > count) {
				count= arr[ch1];
				c= ch1;
			}
			
		}
		return c;
	}
	
	public static void main(String[] args) {
		char value=Maxchar.Maxvalue("Varad");
		System.out.println(value);

	}

}
