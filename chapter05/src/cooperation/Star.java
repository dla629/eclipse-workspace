package cooperation;

public class Star {
	
	String starName;
	int money;
	
	public Star(String starName) {
		this.starName = starName;
	}
	
	public void take(int money) {
		this.money += money;
		
	}

}
