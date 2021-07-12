package chapter04;

public class PIf05 {

	public static void main(String[] args) {
		int score = 90;
		char grade;
		
		grade = (score >= 90) ? 'A' : 'B';
		
		System.out.println("당신의 점수는 " + score + "점 이고, 학점은 " + grade + "입니다");

	}

}
