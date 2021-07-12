package cooperation;

public class Customer {
	
	public String customerName;
	public int money;
	
	public Customer(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}
	
	public void takeStar(Star star) {
		star.take(4000);
		this.money -= 4000;
	}
	
	public void takeCong(Cong cong) {
		cong.take(4500);
		this.money -= 4500;
	}

	public void showInfo() {
		System.out.println(customerName + " 의 남은 돈은" + money + "원 입니다.");
}
}
