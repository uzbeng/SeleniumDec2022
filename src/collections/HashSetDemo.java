package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<String>();
		
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Apple");
		fruits.add("Spinach");
		fruits.add("Cucumber");
		fruits.add("Banana");
		
		System.out.println(fruits.size());
		System.out.println(fruits);
		
		fruits.contains("Apple");
		fruits.remove("Apple");
		System.out.println(fruits);
		
		// Using enhanced for loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// Using iterator
		Iterator<String> fruitIterator = fruits.iterator();
		while(fruitIterator.hasNext()) {
			String fruit = fruitIterator.next();
			System.out.println(fruit);
		}

	}

}
