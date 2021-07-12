package chapter05;

public class Circle_Con {
	
	int radius;
	String name;
	
	public Circle_Con() {				// 매개 변수가 없는 생성자
		radius = 1;name = " ";		//초기값 1
	}
	public Circle_Con(int r, String n) { //매개 변수가 있는 생성자, 생성자는 리턴값이 없음
		radius = r;name = n;	
	}
	public double getArea() {			
		return 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		Circle_Con pizza = new Circle_Con(10, "자바 피자");	//매개 변수를 가진 생성자를 호출
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area + "입니다.");
		
		Circle_Con dount = new Circle_Con();				// 매개 변수가 없는 생성자를 호출
		dount.radius = 2;
		dount.name = "자바 도넛";
		area = dount.getArea();
		System.out.println(dount.name + "의 면적은 " + area + "입니다.");
	}

}
