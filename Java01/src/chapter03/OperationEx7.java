package chapter03;

public class OperationEx7 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		

		value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		int num2 = 5;
		int z = 10;

		boolean value2 = ((num2 = num2 * 10) > 45) || ((z = z - 5) < 10);
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(z);

	}

}
