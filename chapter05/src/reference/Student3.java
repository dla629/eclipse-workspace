package reference;

public class Student3 {
	
	int studentID;
	String studentName;
	
	Subject korea;		//���� �ڷ��� (Subject class)���� ����
	Subject math;		//���� �ڷ��� (Subject class)���� ����
	
	public Student3() {
		korea = new Subject();
		math = new Subject(); 
	}
	
	public void setKorean (String name, int score) {
		korea.subjectName = name;
		korea.scorePoint = score;
	}

	public void setMath (String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
}
