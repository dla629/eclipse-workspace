package construtor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personkim = new Person();					//기본 생성자 호출
		
		personkim.name = "김유신";							//인스턴트 변수 값을 따로 초기화
		personkim.weight = 85.5F;
		personkim.height = 180.0F;
		
		Person personLee = new Person("이순신", 175, 75);
		
	}

}
