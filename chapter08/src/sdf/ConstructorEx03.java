package sdf;

class Q{
	public Q() {
	System.out.println("todtjd");
}
	public Q(int x) {
		System.out.println("�Ű����� ������E");
	}
	}
	
class W extends Q{
	public W() {
		System.out.println("������ W");
	}
	public W(int x) {
		System.out.println("�Ű����� ������W");
	}
}
public class ConstructorEx03 {

	public static void main(String[] args) {
		W w = new W(5);
	}

}