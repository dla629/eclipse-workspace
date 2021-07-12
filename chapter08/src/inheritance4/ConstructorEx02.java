package inheritance4;

class A {
	
	public A() {
		System.out.println("생성자 A");
	}

}
class B extends A{
	
	public B() {
		super();
		System.out.println("생성자 B");
	}

}
class C extends B{
	
	public C() {
		super();							//super : 슈퍼 클래스(부모 클래스), 부모 클래스의 생성자 호출
		System.out.println("생성자 C");
	}

}
public class ConstructorEx02 {

	public static void main(String[] args) {
		
		C c = new C(); 
	}

}
