package test;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력 하시오 >> ");
		int money = scanner.nextInt();
		int remain;
		
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i = 0; i < unit.length; i++) {
			remain = money / unit[i];
			money = money % unit[i];		//나눈값과 나눈값의 나머지를 선입력 후 나눈 값이 0보다 크면 출력
			
			if(remain >= 0) {
				System.out.println(unit[i] + "원 짜리 : " + remain + "개");
			}
		}
		scanner.close();
	}

}
