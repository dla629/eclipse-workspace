package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student4 studentLim = new Student4(1004,"���ο�");
		
		studentLim.setKorea("����", 100);
		studentLim.setMath("����", 90);

		Student4 studentKim = new Student4(1005,"�迵��");
		
		studentKim.setKorea("����", 95);
		studentKim.setMath("����", 85);
		
		studentLim.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
