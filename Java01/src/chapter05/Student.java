package chapter05;

public class Student {
	
	int studentID;			//�й�			��
	String studentName;		//�̸�			��
	int grade;				//�г�			��
	String address;			//��� ��			��(�Ӽ�)
	
	
	
	public void showStudentInfo(){
		System.out.println(studentName + ", " + address);	// ��
}
	public String getStudentName() {						// ��
		return studentName;
	}
	public void getStudentName(String name) {				// ��(���)
		studentName = name;
	}
	
	public static int add(int n1, int n2) {					// �����
		int result = n1 / n2;
		return result;
	}
	public static void main(String[] args) {
		
		int num1 = 9;
		int num2 = 13;
		
		int sum = add(num1,num2);
		System.out.println(num1 + " / " + num2 + " = " + sum + "�Դϴ�.");
		
		
		Student studentAhn = new Student();
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
