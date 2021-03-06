package staticex;

public class Student2 {

	private static int serialNum = 1000; //외부 클래스에서 접근을 차단, setter에서 변수값 할당, getter에서 값을 가지고 온다.
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student2() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/*
	 * public String getStudentName() { return studentName; }
	 * 
	 * public void setStudentName(String name) { studentName = name; }
	 */
	public static int getSerialNum() {
		int i = 10;		//스택 영역에 저장, 메소드가 끝나면 소멸
						//static 메소드에서는 멤버변수(인스턴트 변수)를 사용할 수 없음
		return serialNum;
	}

	public static void stetSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}

}
