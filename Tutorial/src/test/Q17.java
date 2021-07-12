package test;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		
		String str[] = new String[] {"가위", "바위", "보"};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보! >> ");
			
			int n = (int)(Math.random()*3);
			int count = 0;
			
			String in = scanner.next();
			
					
			if(in.equals("그만")) {
				break;
			}
			else {
				
				System.out.print("사용자 = " + in + " ");
				System.out.println("컴퓨터 = " + str[n]);
				
				for(int i = 0; i < str.length; i++) {
					if(in.equals(str[i])) {
						break;
					}
					count++;
				}
				if(count == 2 && n == 0)
					System.out.println("사용자가 졌습니다.");
				else if(count == 0 && n == 2)
					System.out.println("사용자가 이겼습니다.");
				else if(count > n && n <= 1)
					System.out.println("사용자가 이겼습니다");
				else if(count == n)
					System.out.println("비겼습니다.");
				else
					System.out.println("사용자가 졌습니다.");
			}
		}
		System.out.println("게임을 종료합니다...");
		scanner.close();

	}

}
