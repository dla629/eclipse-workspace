package test;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		String operator = " ";

		int result;
		while (true) {
			System.out.print("과목 이름 >> ");
			operator = scanner.nextLine();
			if (operator.equals(course[0])) {
				result = score[0];
				System.out.println("Java의 점수는 : " + result);
			} else if (operator.equals(course[1])) {
				result = score[1];
				System.out.println("C++의 점수는 : " + result);
			} else if (operator.equals(course[2])) {
				result = score[2];
				System.out.println("HTML5의 점수는 : " + result);
			} else if (operator.equals(course[3])) {
				result = score[3];
				System.out.println("컴퓨터구조의 점수는 : " + result);
			} else if (operator.equals(course[4])) {
				result = score[4];
				System.out.println("안드로이드의 점수는 : " + result);
			} else if (operator.equals("그만")) {
				System.out.println("종료 하였습니다.");
				break;
			} else {
				System.out.println("없는 과목입니다.");
			}
		}
		scanner.close();
	}

}
