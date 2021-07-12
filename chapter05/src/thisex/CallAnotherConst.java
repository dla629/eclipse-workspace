package thisex;

	class Person{
		String name;
		int age;
		
		Person(){
			this("�̸� ����", 1);			//�����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� this
		}
		Person(String name, int age){	//�޼ҵ��� �����̸��� ��ü���� �̸��� ������ ���
			this.name = name;			//��ü ���� �̸� �տ� this
			this.age = age;
		}
		Person returnItSelf() {
			return this;				//this ��ȯ
		}
	}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();	//this ���� Ŭ���� ������ ����
		System.out.println(p);				//noName.returnItSelf()�� ��ȯ �� ���
		System.out.println(noName);			//���� ���� ���

	}

}
