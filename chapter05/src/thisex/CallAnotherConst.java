package thisex;

	class Person{
		String name;
		int age;
		
		Person(){
			this("이름 없음", 1);			//생성자에서 다른 생성자를 호출하는 this
		}
		Person(String name, int age){	//메소드의 변수이름과 객체변수 이름이 동일한 경우
			this.name = name;			//객체 변수 이름 앞에 this
			this.age = age;
		}
		Person returnItSelf() {
			return this;				//this 반환
		}
	}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();	//this 값을 클래스 변수에 대입
		System.out.println(p);				//noName.returnItSelf()의 반환 값 출력
		System.out.println(noName);			//참조 변수 출력

	}

}
