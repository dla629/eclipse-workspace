package chapter03;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 95;
		int engScore = 70;
		
		
		int totalScore = mathScore + engScore;
		
		System.out.println("��Ż ���� : " + totalScore);
		
		double avgScore = totalScore / 2.0;
		
		System.out.println("��� ���� : " + avgScore);
		
		int mod = mathScore % engScore;
		String ch1 = "���� �������� : "; // string�� �⺻���������� �ƴ� ��ü�� ������ Ÿ��
		System.out.println(ch1 + mod);
		
		

	}

}
