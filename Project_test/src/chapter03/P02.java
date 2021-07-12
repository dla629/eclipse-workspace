package chapter03;

public class P02 {

	public static void main(String[] args) {

		int gameScore = 150;

		int lastScore = ++gameScore;
		System.out.println(lastScore);

		int lastScore2 = --gameScore;
		System.out.println(lastScore2);

		int value = 10;
		int num = value++;

		System.out.println(num);
		System.out.println(value);
		
		int num2 = value--;
		
		System.out.println(num2);
		System.out.println(value);

	}

}
