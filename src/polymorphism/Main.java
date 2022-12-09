package polymorphism;

public class Main {
	
	// "is a" - relationship
	// polymorphism - taking many shapes

	public static void main(String[] args) {
		Shape shape = new Shape();		
		Triangle triange = new Triangle();		
		Shape circle = new Circle();
		
		draw(circle);
	}
	
	public static void draw(Shape shape) {
		shape.drawShape();
	}

}
