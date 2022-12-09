package inheritance;

public class Animal {
	
	// final class cannot be sub-classed (inherited from)
	// final method cannot be overridden
	// final variable cannot change the value after initialized (constant)
	// hence it is marked as static, because it is the same for all objects of that class
	
	String animalName;
	int age;
	final static String ANIMAL_COLOR = "black";
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public final void procreate() {
		
	}
	
	
	
	public void move() {
		System.out.println("Moving");
	}

}
