package test;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է� �Ͻÿ� >> ");
		int money = scanner.nextInt();
		int remain;
		
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i = 0; i < unit.length; i++) {
			remain = money / unit[i];
			money = money % unit[i];		//�������� �������� �������� ���Է� �� ���� ���� 0���� ũ�� ���
			
			if(remain >= 0) {
				System.out.println(unit[i] + "�� ¥�� : " + remain + "��");
			}
		}
		scanner.close();
	}

}
