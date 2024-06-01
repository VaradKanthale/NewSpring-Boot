package Varad;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arraylist {

	public static void main(String[] args) {

		StringJoiner al = new StringJoiner(",", "(", ")");
		al.add("varad");
		al.add("akash");
		al.add("sudhir");
		al.add("marathi");

		System.out.print(al);
		System.out.println();

		String arr[] = { "varad", "akash", "sudhir", "anjali", "goa" };
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(n -> System.out.print(n + ","));

		System.out.println();

		List<String> aa = Arrays.asList("Varad", "I'm", "8", "Clock");
		List<String> bb = Arrays.asList("Akash", "I'm", "10", "Watch");

		Stream<String> concatString = Stream.concat(aa.parallelStream(), bb.parallelStream());

		concatString.forEach(x -> System.out.print(x + " "));
		System.out.println();

		int vv[] = new int[] { 1, 5, 1, 5, 5 };
		List<int[]> result = Arrays.asList(vv);
		Set<int[]> res = result.stream().collect(Collectors.toSet());

		res.forEach((i) -> System.out.print(" " + i));

	}

}
