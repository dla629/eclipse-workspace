package test;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		
		String str[] = new String[] {"����", "����", "��"};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��! >> ");
			
			int n = (int)(Math.random()*3);
			int count = 0;
			
			String in = scanner.next();
			
					
			if(in.equals("�׸�")) {
				break;
			}
			else {
				
				System.out.print("����� = " + in + " ");
				System.out.println("��ǻ�� = " + str[n]);
				
				for(int i = 0; i < str.length; i++) {
					if(in.equals(str[i])) {
						break;
					}
					count++;
				}
				if(count == 2 && n == 0)
					System.out.println("����ڰ� �����ϴ�.");
				else if(count == 0 && n == 2)
					System.out.println("����ڰ� �̰���ϴ�.");
				else if(count > n && n <= 1)
					System.out.println("����ڰ� �̰���ϴ�");
				else if(count == n)
					System.out.println("�����ϴ�.");
				else
					System.out.println("����ڰ� �����ϴ�.");
			}
		}
		System.out.println("������ �����մϴ�...");
		scanner.close();

	}

}
