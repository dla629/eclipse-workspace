package override2;

public class Shape {
	
	protected String name;
		public void print() {
			draw();
		}
		public void draw() {
			System.out.println("Shape");
		}
		
	public static void main(String[] args) {
		
		Shape a = new Shape();
		
		a.print();
	}

}
