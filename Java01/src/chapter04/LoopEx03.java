package chapter04;

public class LoopEx03 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		}while(num <=10);
		
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);

	}

}
