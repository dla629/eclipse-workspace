package override2;

class Shape2 {
	protected String name;
	public void print() {
		draw();
	}
	
	public void draw() {
		System.out.println("Shape2");
	}
}

public class Circle extends Shape2{
	
	@Override
	public void draw() {
		System.out.println("Circle");
		super.draw();
	}

	public static void main(String[] args) {
		Shape2 b = new Circle();
		b.print();

	}

}
