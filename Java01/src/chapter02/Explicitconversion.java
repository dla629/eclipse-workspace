package chapter02;

public class Explicitconversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // �� �Ǽ��� ���� ����ȯ�Ǿ� ������ - 1(����ȯ �Ǿ� �Ҽ����� �߸�) + 0(����ȯ �Ǿ� �Ҽ����� �߸�) = 1
		int iNum4 = (int)(dNum1 + fNum2);    // �� �Ǽ��� ���� ���� ���ǰ� �� ��ȯ�� - 1.2 + 0.9 = 2.1 ==> ����ȯ  2
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int a = 10;
		double b = 2.0;
		
		int c = (int)(a + b);
		int z = (int)(a - b);
		int x = (int)(a * b);
		int v = (int)(a / b);
		
		System.out.println(a+b); // ������ ��ȯ
		
		System.out.println(c);  // ����� ��ȯ
		System.out.println(z);
		System.out.println(x);
		System.out.println(v);
		
		char d = '\uAE00';
		
		System.out.println(d);
		
		

	}

}
