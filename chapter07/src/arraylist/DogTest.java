package arraylist;

public class DogTest {

	public static void main(String[] args) {
				
		Dog [] dog = new Dog [5];
		
		dog[0] = new Dog("������","���");
		dog[1] = new Dog("������","Ǫ��");
		dog[2] = new Dog("������","������");
		dog[3] = new Dog("������","ġ�Ϳ�");
		dog[4] = new Dog("���","���޶�Ͼ�");
		
		for(int i = 0; i < dog.length; i++) {
			dog[i].showDogInfo();
		}
	
		System.out.println();
		System.out.println("���for��");
        System.out.println();
        
		for(Dog dogA : dog) {
			dogA.showDogInfo();
		}

	}

}
