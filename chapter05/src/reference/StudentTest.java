package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student4 studentLim = new Student4(1004,"임인웅");
		
		studentLim.setKorea("국어", 100);
		studentLim.setMath("수학", 90);

		Student4 studentKim = new Student4(1005,"김영식");
		
		studentKim.setKorea("국어", 95);
		studentKim.setMath("수학", 85);
		
		studentLim.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
