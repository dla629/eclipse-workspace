package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		
		/*
		int a = 10;			//리터럴 데이터 영역에 저장
		int b = 20;
		double c = 10.3;
		char d = 'A';
		*/
		
		
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);

	}

}
