package construtor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personkim = new Person();					//�⺻ ������ ȣ��
		
		personkim.name = "������";							//�ν���Ʈ ���� ���� ���� �ʱ�ȭ
		personkim.weight = 85.5F;
		personkim.height = 180.0F;
		
		Person personLee = new Person("�̼���", 175, 75);
		
	}

}