package chapter04;

public class ExQ6 {

	public static void main(String[] args) {
		int num = 7;
		int space = num / 2 + 1;
		int star = 1;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < space; j++) {		//
				System.out.print(' ');
			}
			for(int j = 0; j < star; j++) {
				System.out.print('*');
			}
			for(int j = 0; j < space; j++){
				System.out.print(' ');
				
			}
			if(i < num / 2) {
				space -= 1;
				star += 2;
			}
			else {
				space += 1;
				star -= 2;
			}
			System.out.println();
		}
}

	}

