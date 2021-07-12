package chapter05.circle;

public class Circle {
	int radius;		//원의 반지름
	String name;	//원의 이름
	
		public Circle() { 
			radius = 1; name ="";
		}		//Circle 클래스의 기본 생성자(클래스 명과 동일한 이름의 메서드)
								//인풋 매개변수도 없고, 실행부가 없는 생성자 : 기본생성자, 기본생성자는 생략 가능
		public Circle(String n,int r) {
			radius = r; name = n;
		}
		public double getArea() {
			return 3.14*radius*radius;
		}

}
