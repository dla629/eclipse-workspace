package chapter04;

public class ExQ5 {

	public static void main(String[] args) {
		
		int num = 4;								//��� �� ���� ��
		int space = num / 2 + 1;					//������ ó���ϴ� ����, �ʱⰪ���� 
		int star = 1;								//���� ��� �ϴ� ����, �ʱⰪ���� 1�Ҵ�(����)

		for (int i = 0; i < num; i++) {				//������ ó���ϴ� for��
			for (int j = 0; j < space; j++) {		//��ǥ ������ ���� for��
				System.out.print(' ');
			}
			for (int j = 0; j < star; j++) {		//��ǥ for��
				System.out.print('*');
			}
			for (int j = 0; j < space; j++) {		//��ǥ �������� ���� for��
				System.out.print(' ');
			}
			space -= 1;
			star += 2;
			System.out.println();
		}
	}
}
