package cooperation;

public class Bus {
	int busNumber;			//버스 번호
	int passengerCount;		//승객 수
	int money;				//버스 수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;		//버스 번호를 매개변수로 받는 생성자
	}
	
	public void take(int money) {
		this.money += money;			//승객의 버스에 탄 경우를 구현한 메서드
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고,수입은 " + money + "원 입니다.");
	}		//버스 정보를 출력하는 메서드
}
