package inheritance;

public class ParentClass {
	
	// Access Modifier:
	// 1. public - it is available everywhere
	// 2. private - it is available in the same class only
	// 3. (default) - it is available only in the same package
	// 4. protected  - it is available only in the same package or in the subclass in any package
	
	String name = "Parent";
	
	protected void print() {
		System.out.println("I am the parent");
	}

}
