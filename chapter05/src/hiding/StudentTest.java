package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.studentID = 20210728;
		
		//studentLee.studentName = "이상원";	
			//레퍼런스 변수에 직접 할당
		
		studentLee.setStudentName("이상원");	
			//setter을 통해서 우회하여 private 변수를 할당
		
		System.out.println(studentLee.getStudentName());

	}

}
