package Varad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Javapro {

	static int add(int n) {
		int fact=1;

		for (int i = 2; i <= n ; i++) {

			int res = fact * i ;
			fact=res;
		}
		return fact;

	}

	public static void main(String[] args) {
	/*	List<String> al = Arrays.asList("Varad", "Akash", "Sudhir", "Anjali", "Omkar", "Gouri");
		Collections.sort(al, (x, y) -> x.compareToIgnoreCase(y));

		for (String arr : al) {
			System.out.print(arr + " ,");
		}*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = Javapro.add(n);
		System.out.println(result);

	}

}
