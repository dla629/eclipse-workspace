package chapter02;

public class P11 {

	public static void main(String[] args) {
		double a = 1.2;
		float b = 0.9F;
		
		int c = (int)(a + b);    //두 실수를 더한후 형변환 하여 소수점 뒤의 숫자를 버림
		int d = (int)a + (int)b; //각각의 실수를 형변환 후 더함 각각의 소수점을 형변환시 버림
		
		System.out.println(c);
		System.out.println(d);
		
		int e = 10;
		double f = 2.0;
		
		System.out.println((int)(e + f));
		System.out.println((int)(e - f));
		System.out.println((int)(e * f));
		System.out.println((int)(e / f));
		

	}

}
