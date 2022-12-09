package lesson13;

import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		int a = 5;
		Integer b = 7;
		
		int sum = a + b;
		System.out.println(sum);
		
		// Autoboxing - primitive type is changed to Class type
		// unboxing - Class type is changed to primitive type
		
		Integer.max(a, b);
		
		int[] numbers = new int[10];
		
		ArrayList<Integer> numberArr = new ArrayList<Integer>();
		numberArr.add(56);
		numberArr.add(45);
		numberArr.add(6);
		
		
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Byte.MIN_VALUE);
//		
//		int highest = Integer.max(6, 9);
//		System.out.println(highest);
//		
//		String number = "10.56";
//		int retrivedInt = Integer.parseInt(number);
//		System.out.println(retrivedInt + 2);
//		
//		Character charVal = 'w';
//		char charVal2 = '5';
//		
//		System.out.println(Character.isDigit(charVal2));
//		Character.isLetter(charVal2);
//		Character.isLetterOrDigit(charVal2);
	}

}
