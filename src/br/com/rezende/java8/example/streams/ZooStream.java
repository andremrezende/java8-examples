package br.com.rezende.java8.example.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 
 * @author Rezende
 *
 */
class Animal {
	private String name;
	private int count;
	public Animal(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
public class ZooStream {
	
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		Animal lion = new Animal("Lion", 10);
		Animal tiger = new Animal("Tiger", 1);
		Animal fish = new Animal("Fish", 102);
		Animal bird = new Animal("Brid", 150);
		Animal duck = new Animal("duck", 44);
		zoo.add(lion);
		zoo.add(tiger);
		zoo.add(fish);
		zoo.add(bird);
		zoo.add(duck);
		
		zoo.sort(Comparator.comparing(Animal::getCount));
		int sum = zoo.stream().filter(a -> a.getCount() > 100).mapToInt(a -> a.getCount()).sum();
		System.out.println("Sum >> " + sum);
		
		System.out.println();
		//Using optionals
		Optional<Animal> animalsGT50 = zoo.parallelStream().filter(a -> a.getCount() > 50).findAny();		
		//animalsGT50.ifPresent(a -> System.out.println(a.getName()));
		
		//Using collector
		List<Animal> collect = zoo.stream().filter(a -> a.getCount() > 50).collect(Collectors.toList());
		zoo.stream().filter(a -> a.getCount() > 50).collect(Collectors.toMap(a -> a.getName(), a-> a.getCount())).forEach((name, animals) -> System.out.println("Zoo has " + animals + " " + name));	
		
	}

}
