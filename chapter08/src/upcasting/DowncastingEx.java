package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("���ο�");
		Student s;
		
		s = (Student) p;			
		
		System.out.println(p.name);
		s.grade = "A";
		
		

	}

}
