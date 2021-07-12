package reference;

public class Student4 {
	
	int studentID;			//�⺻ �ڷ���
	String studentName;		//���� �ڷ���(��ü �ڷ���),�ڹٿ��� �⺻ �����Ǵ� ��ü Ÿ��
	Subject korea;			//���� �ڷ���(����� ���� ��ü �ڷ���)
	Subject math;			//���� �ڷ���(����� ���� ��ü �ڷ���)
	
	public Student4(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	
	
	public void setKorea(String name, int score) {
		korea.subjectName = name;
		korea.scorePoint = score;
	}



	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	


	public void showStudentInfo() {
		int total = korea.getScorePoint() + math.getScorePoint();
		System.out.println("�л� " + studentName + "�� ������ " + total + " �Դϴ�.");
	}
		
	}
