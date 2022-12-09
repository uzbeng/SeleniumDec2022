package inheritance;

public class Tiger extends Animal {

	
	// Method overriding (method signature should be the same)
	@Override
	public void move() {
		System.out.println("Walking");
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("Bite and chew");
	}
	


}
