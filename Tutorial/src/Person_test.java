public class Person_test {

	public static void main(String[] args) {
		
		Person a;
		a = new Person();
		a.age = 40;
		System.out.println("이 사람의 나이는 " + a.age + "살 입니다.");
		a.name = "James";
				System.out.println("이 사람의 이름은 " + a.name + "입니다.");
		a.isMarried = true;
				System.out.println("이 사람의 결혼 여부 = " + a.isMarried);
		a.kids = 3;
				System.out.println("이 사람의 자녀 수는 " + a.kids + "명 있다.");
			
		
	}

}
