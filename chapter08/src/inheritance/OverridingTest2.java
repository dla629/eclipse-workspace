package inheritance;

import witharraylist.Customer;
import witharraylist.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer ctLee = new Customer(10010,"�̼���");
		System.out.println(ctLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + ctLee.calcPrice(price) + "�� �Դϴ�.");

		VIPCustomer ctKim = new VIPCustomer(10020, "������", 12345);
		System.out.println(ctKim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + ctKim.calcPrice(price) + "�� �Դϴ�.");
		
		Customer vc = new VIPCustomer(10030,"������", 2000);
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(price) + "�� �Դϴ�.");
	}
	

}