package abstraction;

public class Main {

	public static void main(String[] args) {
		AnimalSuperClass dog = new Dog();
		Animal cat = new Animal() {
			
			@Override
			public int reproduce() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void move() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
