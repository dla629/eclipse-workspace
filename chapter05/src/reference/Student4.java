package reference;

public class Student4 {
	
	int studentID;			//기본 자료형
	String studentName;		//참조 자료형(객체 자료형),자바에서 기본 제공되는 객체 타입
	Subject korea;			//참조 자료형(사용자 정의 객체 자료형)
	Subject math;			//참조 자료형(사용자 정의 객체 자료형)
	
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
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
		
	}
