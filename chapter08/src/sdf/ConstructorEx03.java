package sdf;

class Q{
	public Q() {
	System.out.println("todtjd");
}
	public Q(int x) {
		System.out.println("매개변수 생성자E");
	}
	}
	
class W extends Q{
	public W() {
		System.out.println("생성자 W");
	}
	public W(int x) {
		System.out.println("매개변수 생성자W");
	}
}
public class ConstructorEx03 {

	public static void main(String[] args) {
		W w = new W(5);
	}

}
