package test;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		String operator = " ";

		int result;
		while (true) {
			System.out.print("���� �̸� >> ");
			operator = scanner.nextLine();
			if (operator.equals(course[0])) {
				result = score[0];
				System.out.println("Java�� ������ : " + result);
			} else if (operator.equals(course[1])) {
				result = score[1];
				System.out.println("C++�� ������ : " + result);
			} else if (operator.equals(course[2])) {
				result = score[2];
				System.out.println("HTML5�� ������ : " + result);
			} else if (operator.equals(course[3])) {
				result = score[3];
				System.out.println("��ǻ�ͱ����� ������ : " + result);
			} else if (operator.equals(course[4])) {
				result = score[4];
				System.out.println("�ȵ���̵��� ������ : " + result);
			} else if (operator.equals("�׸�")) {
				System.out.println("���� �Ͽ����ϴ�.");
				break;
			} else {
				System.out.println("���� �����Դϴ�.");
			}
		}
		scanner.close();
	}

}
