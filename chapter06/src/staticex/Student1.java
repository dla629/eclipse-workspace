package staticex;

public class Student1 {
	
	public static int serialNum = 1005;			//Ŭ���� ���� (������ ������ ����)
	public int studentID;						//��� �ν��Ͻ����� ����, ���α׷��� �ε� ����
	public String studentName;					//���α׷��� ���� �ɶ� ����
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;				//�л��� ���� �ɶ� ���� ����
		studentID = serialNum;		//������ ���� �й� �ν��Ͻ� ������ �ο�
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	
}
