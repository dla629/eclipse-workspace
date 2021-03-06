package witharraylist;

import java.util.ArrayList;

public class CustomerTest1 {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer ctLee = new Customer(10010, "이순신");
		Customer ctShin = new Customer(10020, "신사임당");
		Customer ctHong = new GoldCustomer(10030, "홍길동");
		Customer ctYoul = new GoldCustomer(10040, "이율곡");
		Customer ctKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(ctLee);
		customerList.add(ctShin);
		customerList.add(ctYoul);
		customerList.add(ctHong);
		customerList.add(ctKim);
		
		System.out.println("====== 고객 정보 출력 ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 85900000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
		
		

	}

}
