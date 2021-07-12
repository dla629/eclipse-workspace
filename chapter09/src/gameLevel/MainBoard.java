package gameLevel;

public class MainBoard {

	public static void main(String[] args) {
		
		Player player = new Player();				//기본생성자 호출
		player.play(1);
		AdvencdLevel aLevel = new AdvencdLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		MasterLevel mLevel = new MasterLevel();
		player.upgradeLevel(mLevel);
		player.play(5);
		
	}
}