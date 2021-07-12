package arraylist;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("가라이","비글"));
		dog.add(new Dog("개똥이","푸들"));
		dog.add(new Dog("말라이","진돗개"));
		dog.add(new Dog("딸랑이","치와와"));
		dog.add(new Dog("밤비","포메라니안"));
		
		for(int i = 0; i < dog.size(); i++) {
			Dog dogA = dog.get(i);
			dogA.showDogInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for(Dog dogA : dog) {
			dogA.showDogInfo();
		}
		
		System.out.println("===== dog.size() : " + dog.size() + " =====");
	}	

}
