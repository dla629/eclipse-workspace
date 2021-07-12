package chapter04;

public class ExQ5 {

	public static void main(String[] args) {
		
		int num = 4;								//출력 할 라인 수
		int space = num / 2 + 1;					//공백을 처리하는 변수, 초기값으로 
		int star = 1;								//별을 출력 하는 변수, 초기값으로 1할당(변함)

		for (int i = 0; i < num; i++) {				//라인을 처리하는 for문
			for (int j = 0; j < space; j++) {		//별표 왼쪽의 공백 for문
				System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {		//별표 for문
				System.out.print('*');
			}
			for (int j = 0; j < space; j++) {		//별표 오른쪽의 공백 for문
				System.out.print(' ');
			}
			space -= 1;
			star += 2;
			System.out.println();
		}
	}
}
