package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer ctLee = new Customer();
		ctLee.setCustomerID(10010);
		ctLee.setCustomerName("이순신");
		ctLee.bonusPoint = 1000;
		
		System.out.println(ctLee.showCustomerInfo());
		
		Customer ctKim = new VIPCustomer(10020,"김유신", 12345);
		ctKim.bonusPoint = 10000;
		
		System.out.println(ctKim.showCustomerInfo());
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		
		int price = 10000;
		int leeprice = ctLee.calcPrice(price);
		int kimprice = ctKim.calcPrice(price);
		
		System.out.println(ctLee.getCustomerName() + "님이 " + leeprice + "원 지불하셨습니다.");
		System.out.println(ctLee.showCustomerInfo());
		System.out.println(ctKim.getCustomerName() + "님이 " + kimprice + "원 지불하셨습니다.");
		System.out.println(ctKim.showCustomerInfo());

	}

}
