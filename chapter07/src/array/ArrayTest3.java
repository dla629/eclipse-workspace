package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		double[]data = new double[5];
		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;
		
		double total = 1;
		
		for(int i = 0; i < size; i++) {
			System.out.println(data[i]);
			total *= data[i];
			
		}
		System.out.println(total);		//배열의 저장된 값을 곱하는 경우 문제 발생
	}

}
