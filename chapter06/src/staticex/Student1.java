package staticex;

public class Student1 {
	
	public static int serialNum = 1005;			//클래스 변수 (데이터 영역에 생성)
	public int studentID;						//모든 인스턴스에서 접근, 프로그램이 로드 생성
	public String studentName;					//프로그램이 종료 될때 제거
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;				//학생이 증가 될때 마다 증가
		studentID = serialNum;		//증가된 값을 학번 인스턴스 변수에 부여
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	
}
