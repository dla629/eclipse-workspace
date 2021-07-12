package cooperation;

public class Cong {
	
	String congName;
	int money;
	
	public Cong(String congName) {
		this.congName = congName;
	}
	
	public void take(int money) {
		this.money += money;
	}

}
