package chapter05;

public class Circle {
	int radius;		//���� ������
	String name;	//���� �̸�
	
		public Circle() { }		//Circle Ŭ������ �⺻ ������(Ŭ���� ��� ������ �̸��� �޼���)
								//��ǲ �Ű������� ����, ����ΰ� ���� ������ : �⺻������, �⺻�����ڴ� ���� ����
		
		public double getArea() {
			return 3.14*radius*radius;
		}
		public static void main(String[] args) {
			Circle pizza;
			pizza = new Circle();	//Circle ��ü ����, ���۷��� �̸� pizza
			pizza.radius = 10;		//������ �������� 10���� ����
			pizza.name = "�ڹ� ����";	//������ �̸��� ����
			double area = pizza.getArea();	//������ ���� (gerArea () �� ȣ�� �ؼ� area ������ �Ҵ�
			System.out.println(pizza.name + "�� ������ " + area);
			
			Circle dount = new Circle();	//Circle ��ü ����, ���۷��� �̸� dount
			dount.radius = 2;
			dount.name = "�ڹ� ����";
			area = dount.getArea();
			System.out.println(dount.name + "�� ������ " + area);
		}
}
