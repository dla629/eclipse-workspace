package test;

public class Q05 {

	public static void main(String[] args) {
		
		int[]score = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);
	}

}
//