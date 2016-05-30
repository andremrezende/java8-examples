package br.com.rezende.java8.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Rezende
 *
 */
public class OrderByString {
	public static void main(String args[]) throws Exception {
		List<String> list = new ArrayList<>();

		list.add("Andre Rezende");
		list.add("Darth Vader");
		list.add("R2D2");

		//list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		list.sort(Comparator.comparing(s-> s.length()));
		list.forEach(s -> System.out.println(s));
		
		//Method references:
//		list.sort(Comparator.comparing(String::length));
//		list.forEach(s -> System.out.println(s));
		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}
}
