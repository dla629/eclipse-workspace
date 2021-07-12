package abstractex;

public abstract class Computer {			//추상 메소드를 포함. 프레임워크 구현, 인터페이스 구현.
	
	public abstract void display();			//추상 메소드: 선언부만 존재하고, 실행부가 없는 메소드
	public abstract void typing();
	public void turnOn() {					//일반 메소드
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
