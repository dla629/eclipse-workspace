package chapter02;

public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);       //���� ���
		System.out.println((int)ch1);  //���ڿ� �ش��ϴ� ������(�ƽ�Ű �ڵ�)
		                               //���� ���
		
		char ch2 = 66;                 //�ƽ�Ű �ڵ尪�� ����
		System.out.println(ch2);       //�ƽ�Ű �ڵ忡 �´� �������
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char ch4 = 69;
		System.out.println(ch4);
		
		char ch5 = 'V';
		System.out.println(ch5);
		System.out.println((int)ch5);
		
		
		for(char i = 'a'; i<= 'z'; ++i)
		{			
			System.out.print(i +" ");
		}
		

	}

}
