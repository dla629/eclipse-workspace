package chapter05.circle;

import chapter05.circle.Circle;

public class Circle_test {

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle("자바 피자",10);	//Circle 객체 생성, 레퍼런스 이름 pizza
			
		double area = pizza.getArea();	//피자의 면적 (gerArea () 를 호출 해서 area 변수에 할당
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle dount = new Circle();	//Circle 객체 생성, 레퍼런스 이름 dount
		dount.radius = 3;
		dount.name = "자바 도넛";
		area = dount.getArea();
		System.out.println(dount.name + "의 면적은 " + area);
	}

}
