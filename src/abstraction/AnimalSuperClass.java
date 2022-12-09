package abstraction;

public abstract class AnimalSuperClass {
	
	String name;
	double weight;
	int age;
	
	public abstract void see();
	
	public void grow() {
		System.out.println("Growing and getting bigger");
	}

}
