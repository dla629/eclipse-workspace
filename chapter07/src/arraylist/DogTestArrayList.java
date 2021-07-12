package arraylist;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("������","���"));
		dog.add(new Dog("������","Ǫ��"));
		dog.add(new Dog("������","������"));
		dog.add(new Dog("������","ġ�Ϳ�"));
		dog.add(new Dog("���","���޶�Ͼ�"));
		
		for(int i = 0; i < dog.size(); i++) {
			Dog dogA = dog.get(i);
			dogA.showDogInfo();
		}
		System.out.println();
		
		System.out.println("=== ���� for�� ��� ===");
		for(Dog dogA : dog) {
			dogA.showDogInfo();
		}
		
		System.out.println("===== dog.size() : " + dog.size() + " =====");
	}	

}
