package test;

public class Q15 {

	public static void main(String[] args) {
		
		int ten;
		int one;
		
		for(int i = 1; i < 100; i++) {
			
			ten = i / 10;
			one = i % 10;
			
			if(ten > 0 && one > 0 && ten % 3 == 0 && one % 3 == 0)
				System.out.println(i + "¹Ú¼ö Â¦Â¦");
			else if(ten > 0 && ten % 3 == 0)
				System.out.println(i + "¹Ú¼ö Â¦");
			else if(one > 0 && one % 3 == 0)
				System.out.println(i + "¹Ú¼ö Â¦");
		}
	}

}
