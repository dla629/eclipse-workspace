package chapter05.circle;

public class Circle {
	int radius;		//���� ������
	String name;	//���� �̸�
	
		public Circle() { 
			radius = 1; name ="";
		}		//Circle Ŭ������ �⺻ ������(Ŭ���� ��� ������ �̸��� �޼���)
								//��ǲ �Ű������� ����, ����ΰ� ���� ������ : �⺻������, �⺻�����ڴ� ���� ����
		public Circle(String n,int r) {
			radius = r; name = n;
		}
		public double getArea() {
			return 3.14*radius*radius;
		}

}
