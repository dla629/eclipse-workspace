package arraylist;

public class DogTest {

	public static void main(String[] args) {
				
		Dog [] dog = new Dog [5];
		
		dog[0] = new Dog("가라이","비글");
		dog[1] = new Dog("개똥이","푸들");
		dog[2] = new Dog("말랑이","진돗개");
		dog[3] = new Dog("딸랑이","치와와");
		dog[4] = new Dog("밤비","포메라니안");
		
		for(int i = 0; i < dog.length; i++) {
			dog[i].showDogInfo();
		}
	
		System.out.println();
		System.out.println("향상for문");
        System.out.println();
        
		for(Dog dogA : dog) {
			dogA.showDogInfo();
		}

	}

}
