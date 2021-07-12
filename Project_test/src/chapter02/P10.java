package chapter02;

public class P10 {

	public static void main(String[] args) {
		double a = 1;

		for (int i = 0; i < 10000; i++) {

			a = a + 0.1;
		}

		System.out.println(a);// 이처럼 부동 소수점 방식은 0을 표현을 못해 오류가 날수도 있음

	}
}