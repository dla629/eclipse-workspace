package chapter03;

public class P01 {

	public static void main(String[] args) {
		
		int mathScore = 90;
		int engScore = 75;
		
		int totalScore = mathScore + engScore;
		
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
		
		System.out.println(avgScore);
		
		int mod = mathScore % engScore;
		String ch ="나눈 나머지 값 : ";
		System.out.println(ch + mod);
		
		
		
		

	}

}
