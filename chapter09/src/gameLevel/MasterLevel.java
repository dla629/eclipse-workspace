package gameLevel;

public class MasterLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("축지를 씁니다.");

	}

	@Override
	public void jump() {
		System.out.println("구름을 노닙니다.");

	}

	@Override
	public void turn() {
		System.out.println("트리플 악셀을 시전합니다.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("********** 무적 입니다. **********");

	}

}
