package chapter02;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		char ch1 = '한';
		char ch2 = '\uD55c';   //유니코드 값 (한)
		char ch3 = '\uAD6D';   //유니코드 값 (국)
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
