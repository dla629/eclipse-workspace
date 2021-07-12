package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer ctLee = new Customer();
		ctLee.setCustomerID(10010);
		ctLee.setCustomerName("�̼���");
		ctLee.bonusPoint = 1000;
		
		System.out.println(ctLee.showCustomerInfo());
		
		Customer ctKim = new VIPCustomer(10020,"������", 12345);
		ctKim.bonusPoint = 10000;
		
		System.out.println(ctKim.showCustomerInfo());
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		
		int price = 10000;
		int leeprice = ctLee.calcPrice(price);
		int kimprice = ctKim.calcPrice(price);
		
		System.out.println(ctLee.getCustomerName() + "���� " + leeprice + "�� �����ϼ̽��ϴ�.");
		System.out.println(ctLee.showCustomerInfo());
		System.out.println(ctKim.getCustomerName() + "���� " + kimprice + "�� �����ϼ̽��ϴ�.");
		System.out.println(ctKim.showCustomerInfo());

	}

}
