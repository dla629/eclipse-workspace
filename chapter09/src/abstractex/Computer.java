package abstractex;

public abstract class Computer {			//�߻� �޼ҵ带 ����. �����ӿ�ũ ����, �������̽� ����.
	
	public abstract void display();			//�߻� �޼ҵ�: ����θ� �����ϰ�, ����ΰ� ���� �޼ҵ�
	public abstract void typing();
	public void turnOn() {					//�Ϲ� �޼ҵ�
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}
