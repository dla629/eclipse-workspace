public class Order_test {

	public static void main(String[] args) {
		Order num1;
		num1 = new Order( );
		
		num1.number = 201803140001L;
			System.out.println("�ֹ���ȣ : " + num1.number);
		num1.id = "abc123";
			System.out.println("�ֹ��� ���̵� : " + num1.id);
		num1.day = "2018�� 3�� 12��";
			System.out.println("�ֹ� ��¥ : " + num1.day);
		num1.name = "ȫ���";
			System.out.println("�ֹ��� �̸� : " + num1.name);
		num1.productNum = "PD0345-12";
			System.out.println("�ֹ� ��ǰ ��ȣ : " + num1.productNum);
		num1.address = "����� �������� ���ǵ��� 20����";
			System.out.println("��� �ּ� : " + num1.address);
			
			

	}

}
