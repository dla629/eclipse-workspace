package template;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Car myCar = new AiCar();
		myCar.run();
		
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car yCar = new ManualCar();
		yCar.run();
	}

}
