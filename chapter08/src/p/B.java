package p;

public class B extends A{
	
	void set() {
		pub = 1;	//public : 모든 다른 패키지에서 접근 가능
		pro = 2;	//protected : 같은 패키지 일때 접근 가능, 상속관계의 다른 패키지에서 접근 가능
		def = 3;	//default : 같은 패키지 일때만 접근 가능, 다른 패키지에서는 접근 불가
	//	pri = 4; 	//private : 다른 패키지에서 접근 차단
		
	}
	
	

}
