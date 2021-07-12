package chapter03;

public class OperationEx4 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean flag = (num1 > 0) && (num2 > 0); // 두 항 모두 True 일때 True
		System.out.println(flag);

		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);

		flag = (num1 > 0) && (num2 < 0);
		System.out.println(flag);

		flag = (num1 < 0) && (num2 < 0);
		System.out.println(flag);

	}

}
