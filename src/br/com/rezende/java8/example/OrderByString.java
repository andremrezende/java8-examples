package br.com.rezende.java8.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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

		Comparator<String> comparator = new ComparatorString();
		list.sort(comparator);
		
		Consumer<String> consumer = new PrintLine();
		list.forEach(consumer);
	}
}

class ComparatorString implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}

class PrintLine implements Consumer<String> {
	@Override
	public void accept(String s) {
		System.out.println(s);		
	}
	
}