package chapter02;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		char ch1 = '��';
		char ch2 = '\uD55c';   //�����ڵ� �� (��)
		char ch3 = '\uAD6D';   //�����ڵ� �� (��)
		char ch4 = '\uAC38';
		
		System.out.println(ch1);
		System.out.print(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		
		for(int i = 1; i<= 100; i++)
		{
			System.out.print(i + " ");
		}

	}

}
