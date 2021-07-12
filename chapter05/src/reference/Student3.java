package reference;

public class Student3 {
	
	int studentID;
	String studentName;
	
	Subject korea;		//참조 자료형 (Subject class)국어 점수
	Subject math;		//참조 자료형 (Subject class)수학 점수
	
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
