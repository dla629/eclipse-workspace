package gameLevel;

public class MasterLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("������ ���ϴ�.");

	}

	@Override
	public void jump() {
		System.out.println("������ ��մϴ�.");

	}

	@Override
	public void turn() {
		System.out.println("Ʈ���� �Ǽ��� �����մϴ�.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("********** ���� �Դϴ�. **********");

	}

}
