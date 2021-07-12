package chapter02;

public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);       //문자 출력
		System.out.println((int)ch1);  //문자에 해당하는 정수값(아스키 코드)
		                               //값을 출력
		
		char ch2 = 66;                 //아스키 코드값을 저장
		System.out.println(ch2);       //아스키 코드에 맞는 문자출력
		
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
