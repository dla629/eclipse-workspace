package chapter05.circle;

import chapter05.circle.Circle;

public class Circle_test {

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle("�ڹ� ����",10);	//Circle ��ü ����, ���۷��� �̸� pizza
			
		double area = pizza.getArea();	//������ ���� (gerArea () �� ȣ�� �ؼ� area ������ �Ҵ�
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle dount = new Circle();	//Circle ��ü ����, ���۷��� �̸� dount
		dount.radius = 3;
		dount.name = "�ڹ� ����";
		area = dount.getArea();
		System.out.println(dount.name + "�� ������ " + area);
	}

}
