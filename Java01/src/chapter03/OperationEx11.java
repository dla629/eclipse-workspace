package chapter03;

public class OperationEx11 {

	public static void main(String[] args) {
		
		int num = 0B00000101;			// 2Áø¼ö 5
		
		System.out.println(num << 2);	// 5 * 2^2
		System.out.println(num << 3); 	// 5 * 2^3
		System.out.println(num << 4);	// 5 * 2^4
		System.out.println(num >> 1);	// 5 / 2^1
		System.out.println(num >> 2);	// 5 / 2^2
		System.out.println(num >>> 2);	// 5 / 2^2
		
		System.out.println(num);
		
		num = (num << 2);
		
		System.out.println(num);

	}

}
