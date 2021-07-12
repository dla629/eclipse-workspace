package chapter04;

public class IfelseEx06 {

	public static void main(String[] args) {
		int score = 98;
		char grade;

		if (score > 100) {
			grade = 'F';
		} else if (score >= 90) {
			grade = 'A';
			
		} else if (score >= 80) {
			grade = 'B';
			
		} else if (score >= 70) {
			grade = 'C';
			
		} else if (score >= 60) {
			grade = 'D';
			
		} else {
			grade = 'F';
			
		}
		System.out.println(score + "점은 = 최종성적" + grade + "입니다.");
	}

	}

