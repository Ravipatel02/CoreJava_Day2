package Question7;

public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape();
        shape.draw(); // Output: Drawing Shape

        Circle circle = new Circle();
        circle.draw(); // Output: Drawing Circle
        circle.draw(5); // Output: Drawing Circle with radius 5

        Rectangle rectangle = new Rectangle();
        rectangle.draw(); // Output: Drawing Rectangle
        rectangle.draw(10, 6); // Output: Drawing Rectangle with length 10 and breadth 6s
	}

}

class Shape {
    public void draw() {
        System.out.println("Drawing Shape ........");
    }
}

class Circle extends Shape{
	
	@Override
	public void draw() {
        System.out.println("Drawing Shape circle ........");
    }
	
	public void draw(int radius) {
        System.out.println("Drawing Shape  circle........" + 3.14*radius);
    }
	
}

class Rectangle extends Shape{
	@Override
	public void draw() {
        System.out.println("Drawing Shape rectangle ........" );
    }
	
	public void draw(int h , int w) {
        System.out.println("Drawing Shape  rectangle........" + h*w);
    }
	
}




