package chapter02;

public class P8 {

	public static void main(String[] args) {
		final int INT_MAX = 2147386682;
		
		int a = INT_MAX;
		
		System.out.println(a);
		
		int b = 200;
		
		final int MIN_MAX = - 2147386683;
		
		int c = MIN_MAX;
		
		//MIN_MAX = -1; 상수 선언 후 수정하면 에러 발생
		
		b = 123; // 일반적인 변수는 선언 후 변경해도 에러 발생 하지 않음
		
		System.out.println(b);
		System.out.println(c);
		

	}

}
