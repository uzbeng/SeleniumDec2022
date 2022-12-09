package collections;

import java.util.ArrayList;

public class ArraysCollection {

	public static void main(String[] args) {
		// ArrayList:
		
		ArrayList<String> numbersArr = new ArrayList<String>();
		numbersArr.add("100");
		numbersArr.add("5");
		numbersArr.add("Apple");
		numbersArr.add("Banana");
		numbersArr.add("Grapes");
		
		System.out.println(numbersArr.size());
		
//		numbersArr.clear();
		numbersArr.remove(0);
		numbersArr.remove("5");
		System.out.println(numbersArr.size());
		System.out.println(numbersArr);
		
		String myObj = numbersArr.get(0);
		System.out.println(myObj);
		
		boolean isFound = numbersArr.contains("Grapes");
		System.out.println("Found? " + isFound);
		
		numbersArr.add(1, "Grapefruit");
		System.out.println(numbersArr);
		
		numbersArr.set(1, "Melon");
		System.out.println(numbersArr);

		for(String fruit : numbersArr) {
			System.out.println(fruit);
		}
		
		for(int i=0; i<numbersArr.size(); i++) {
			System.out.println(numbersArr.get(i));
		}
	}

}
