package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("���ο�");
		
		p = s;					//��ĳ����, p = (Person) s; <== ��ĳ���� �Ҷ��� �ڷ����� ��� ���� �ʾƵ� ���������� ����
		
		System.out.println(p.name);

		s.grade = "A";
		s.department = "HR";
		
		Person k = new Student("ȫ�浿");
		
		System.out.println(k.name);
	}

}
