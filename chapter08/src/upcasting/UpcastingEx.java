package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("임인웅");
		
		p = s;					//업캐스팅, p = (Person) s; <== 업캐스팅 할때는 자료형을 명시 하지 않아도 묵시적으로 적용
		
		System.out.println(p.name);

		s.grade = "A";
		s.department = "HR";
		
		Person k = new Student("홍길동");
		
		System.out.println(k.name);
	}

}
