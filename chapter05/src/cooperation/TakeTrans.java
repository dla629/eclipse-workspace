package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James",5000);		//�л� �θ� ����
		Student studentTomas = new Student("Tomas",10000);
		Student studentEdward = new Student("Edward",20000);
		
		Bus bus100 = new Bus(100);					//�뼱 ��ȣ�� 100���� ���� ����
		studentJames.takeBus(bus100);				//���ӽ��� 100�� ������ Ž
		studentJames.showInfo();					//���ӽ� ���� ���
		bus100.showInfo();							//���� ���� Ǯ��
		
		Subway subwayGreen = new Subway("2ȣ��");		//�뼱 ��ȣ�� 2ȣ���� ����ö ����
		studentTomas.takeSubway(subwayGreen);		//�丶���� 2ȣ���� Ž
		studentTomas.showInfo();					//�丶�� ���� ���
		subwayGreen.showInfo();						//����ö ���� ���
		
		Taxi taxi120 = new Taxi(120);
		studentEdward.takeTaxi(taxi120);
		studentEdward.showInfo();
		taxi120.showInfo();
		
		Customer cusKim = new Customer("Kim", 14000);
		Customer cusLee = new Customer("Lee", 12000);
		
		Star starbus = new Star("��Ÿ����");
		cusKim.takeStar(starbus);
		cusKim.showInfo();
		
		Cong congdabang = new Cong("��ٹ�");
		cusLee.takeCong(congdabang);
		cusLee.showInfo();

	}

}
