package chapter04;

import java.util.Scanner;

public class ExQ2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȣ�� �Է����ּ���.");
		
		int num1 = 10;
		int num2 = 2;
		
		String operator = "1";
		operator = scanner.nextLine();
		
		int result = 0;
		
		switch(operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:
				System.out.println("�����Դϴ�");
				scanner.close();
				return;
			
		}
		System.out.println("��� ���� " + result + "�Դϴ�");
		scanner.close();
	}



	}

