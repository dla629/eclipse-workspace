package chapter05;

public class Student {
	
	int studentID;			//학번			멤
	String studentName;		//이름			버
	int grade;				//학년			변
	String address;			//사는 곳			수(속성)
	
	
	
	public void showStudentInfo(){
		System.out.println(studentName + ", " + address);	// 메
}
	public String getStudentName() {						// 서
		return studentName;
	}
	public void getStudentName(String name) {				// 드(기능)
		studentName = name;
	}
	
	public static int add(int n1, int n2) {					// 선언부
		int result = n1 / n2;
		return result;
	}
	public static void main(String[] args) {
		
		int num1 = 9;
		int num2 = 13;
		
		int sum = add(num1,num2);
		System.out.println(num1 + " / " + num2 + " = " + sum + "입니다.");
		
		
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
