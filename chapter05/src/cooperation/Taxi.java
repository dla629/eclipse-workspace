package cooperation;

public class Taxi {
	int number;
	int money;
	
	public Taxi(int number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("�ý�" + number + "������ " + money + "�� �Դϴ�.");
	}
}