package chapter02;

public class BinaryTest2 {

	public static void main(String[] args) {

		int num1 = 0B00000000000000000000000001000110; //��� : 70
		int num2 = 0B11111111111111111111111110111010; //���� : -70
		
		int sum = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);

	}

}
