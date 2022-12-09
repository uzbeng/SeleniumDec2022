package lesson13;

import java.util.Random;

public class CreateRandomNumbers {

	public static void main(String[] args) {
		
		// user566545
		// user549595
		
		Random random = new Random();
		double doubleVar = random.nextDouble();
//		System.out.println(doubleVar * 100);
		
//		System.out.println(random.nextInt(100)-50);
		
		System.out.println("Dice 1: " + (random.nextInt(6) + 1));
		System.out.println("Dice 2: " + (random.nextInt(6) + 1));
		
		if(random.nextBoolean()) {
			System.out.println("I will watch movie tonight");
		} else {
			System.out.println("I go to sleep early");
		}

	}

}
