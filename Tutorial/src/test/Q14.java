package test;



public class Q14 {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		int sum = 0;
		
		
		System.out.print("·£´ıÇÑ Á¤¼öµé : ");
		for(int j = 0; j < 10; j++) {
			int i = (int)(Math.random()*10+1);
			array[j] = i;
			System.out.print(array[j] + " ");
		}
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println();
		System.out.println("Æò±ÕÀº " + (double)sum / array.length);
	}

}
