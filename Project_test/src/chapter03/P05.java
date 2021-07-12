package chapter03;

public class P05 {

	public static void main(String[] args) {
		
		int num = 10;
		int i = 2;
		
		boolean value = ((num = num + 5) > 10) && ((i = i + 2) < 2);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		
		boolean value1 = ((num = num + 5) > 10) || ((i = i + 2) < 2);
		System.out.println(value1);
		System.out.println(num);
		System.out.println(i);
		

	}

}
