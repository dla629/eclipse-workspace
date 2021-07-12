package chapter04;

import java.util.Scanner;

public class ExQ1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("기호를 입력해주세요.");
		
		int num1 = 10;
		int num2 = 2;
		String operator = "+";
		operator = scanner.nextLine();
		
		int result = 0;
		
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}
		else {
			System.out.println("오류입니다");
			scanner.close();
			return;
		}
		System.out.println("결과 값은 " + result + "입니다");
		scanner.close();
	}
}