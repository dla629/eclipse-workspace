package test;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		
		int array[] = new int[10];
		
			for(int i = 0; i < 10; i++) {
				array[i] = scanner.nextInt();
				
			}
			System.out.print("3�� ����� : ");
			for(int j = 0; j < 10; j++) {
				if((array[j] % 3) == 0)
				System.out.print(array[j] + " ");
			}
		
		scanner.close();

	}

}
