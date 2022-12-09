package abstraction;

public class Dog extends AnimalSuperClass implements Animal, Mammal {

	@Override
	public void eat() {
		System.out.println("Bite and chew");
		
	}

	@Override
	public void move() {
		System.out.println("Walk or run");
		
	}

	@Override
	public int reproduce() {		
		return 5;
	}
	
	public void bark() {
		System.out.println("Woof woof");
	}

	@Override
	public void breastFeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void see() {
		// TODO Auto-generated method stub
		
	}
	
	// When inheriting from interface we use implements keyword

}
