package gameLevel;

public class Player {
	
	private PlayerLevel level;			//PlayerLevel(객체자료형), level(인스턴스명)
										//level 인스턴스 변수에 객체가 담길경우 형변환 됨(업캐스팅)
	
	public Player() {					//기본 생성자
		level = new BeginnerLevel();	//PlayerLevel 자료형으로 업캐스팅
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {	//객체를 인풋값으로 받고,업캐스팅 됨
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {		//
		level.go(count);
	}
	
	
}
