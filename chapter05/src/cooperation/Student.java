package cooperation;

public class Student {
	
	public String studentName;	//�л� �̸�
	public int grade;			//�г�
	public int money;			//�л��� ������ �ִµ�
	
	public Student(String studentName,int money) {
		this.studentName = studentName;				//�л� �̸��� ���� ���� �Ű������� �޴� ������
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);								//�л��� ������ Ÿ�� 1000���� �����ϴ� ����� ������ �޼���
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);							//�л��� ����ö�� Ÿ�� 1500���� �����ϴ� ����� ������ �޼���
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "�л��� ���� ����" + money + "�� �Դϴ�.");
				//�л��� ���� ������ ������ �޼���

	}

}
