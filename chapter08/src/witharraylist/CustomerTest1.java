package witharraylist;

import java.util.ArrayList;

public class CustomerTest1 {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer ctLee = new Customer(10010, "�̼���");
		Customer ctShin = new Customer(10020, "�Ż��Ӵ�");
		Customer ctHong = new GoldCustomer(10030, "ȫ�浿");
		Customer ctYoul = new GoldCustomer(10040, "������");
		Customer ctKim = new VIPCustomer(10050, "������", 12345);
		
		customerList.add(ctLee);
		customerList.add(ctShin);
		customerList.add(ctYoul);
		customerList.add(ctHong);
		customerList.add(ctKim);
		
		System.out.println("====== ���� ���� ��� ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		int price = 85900000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
		}
		
		

	}

}