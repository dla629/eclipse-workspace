package chapter02;

public class Explicitconversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형변환되어 더해짐 - 1(형변환 되어 소수점이 잘림) + 0(형변환 되어 소수점이 잘림) = 1
		int iNum4 = (int)(dNum1 + fNum2);    // 두 실수의 합이 먼저 계산되고 형 변환됨 - 1.2 + 0.9 = 2.1 ==> 형변환  2
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int a = 10;
		double b = 2.0;
		
		int c = (int)(a + b);
		int z = (int)(a - b);
		int x = (int)(a * b);
		int v = (int)(a / b);
		
		System.out.println(a+b); // 묵시적 변환
		
		System.out.println(c);  // 명시적 변환
		System.out.println(z);
		System.out.println(x);
		System.out.println(v);
		
		char d = '\uAE00';
		
		System.out.println(d);
		
		

	}

}
