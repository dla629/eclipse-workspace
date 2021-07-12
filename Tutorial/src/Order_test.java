public class Order_test {

	public static void main(String[] args) {
		Order num1;
		num1 = new Order( );
		
		num1.number = 201803140001L;
			System.out.println("주문번호 : " + num1.number);
		num1.id = "abc123";
			System.out.println("주문자 아이디 : " + num1.id);
		num1.day = "2018년 3월 12일";
			System.out.println("주문 날짜 : " + num1.day);
		num1.name = "홍길순";
			System.out.println("주문자 이름 : " + num1.name);
		num1.productNum = "PD0345-12";
			System.out.println("주문 상품 번호 : " + num1.productNum);
		num1.address = "서울시 영등포구 여의도동 20번지";
			System.out.println("배송 주소 : " + num1.address);
			
			

	}

}
