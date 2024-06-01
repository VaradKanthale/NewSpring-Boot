package Varad;

import java.awt.Cursor;
import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Customer{
	
}
public class Sortedlist implements Customer{

	public static void main(String[] args) {
	//	Stream.of(0,1,2,3,4,5,6).limit(5).forEach(res-> System.out.println("/n"+res));
	 //   Stream.of(0,1,2,3,4,5,6,7,8,9).skip(5).forEach(res-> System.out.println("List "+res));
		
	/*	List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		int result=al.stream().mapToInt(i-> i).sum();
		System.out.println(result);     */
		
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		long count=al.stream().count();
		System.out.println("Count is: "+count);
		
      int max= Stream.of(10,50,46,78,100).max(Comparator.comparing(Integer::valueOf)).get();
      int max2=al.stream().max(Comparator.comparing(Integer::valueOf)).get();
       
      System.out.println(max);
      System.out.println(max);
       
     
       
      
		List<String> al2=new ArrayList<>();
		al2.add("varad");
		al2.add("akash");
		al2.add("anjali");
		al2.add("sudhir");
		al2.add("omkar");
		
		List<String> startwith=al2.stream().filter(w-> w.startsWith("v")).collect(Collectors.toUnmodifiableList());
		
		System.out.println(startwith);
		OptionalDouble arr=al.stream().mapToInt(n-> n * n).filter(n-> n >= 100).average();
		
		System.out.println(arr);
		
		List<Integer> List=Stream.of(5,10,15,20,25,30,87,56).filter(n-> n%2==0).limit(5).collect(Collectors.toList());
		 System.out.println(List);
		 
		List<String> uppercase= al2.stream().map(String::toUpperCase).collect(Collectors.toList());
		 uppercase.forEach(System.out::println);
		
		
	}

}
