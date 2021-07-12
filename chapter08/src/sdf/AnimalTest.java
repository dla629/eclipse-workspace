package sdf;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

	class Human extends Animal {
		@Override
		public void move() {
			System.out.println("사람이 두 발로 걷습니다.");
		}

		public void readBook() {
			System.out.println("사람이 책을 읽습니다.");
		}
	}
	class Tiger extends Animal {
		@Override
		public void move() {
			System.out.println("호랑이가 네 발로 뜁니다.");
		}

		public void hunting() {
			System.out.println("호랑이가 사냥을 합니다.");
		}
	}

	class Eagle extends Animal {
		@Override
		public void move() {
			System.out.println("독수리가 하늘을 납니다.");
		}
		
		public void flying() {
			System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
		}
	}

public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();	//선언
	
	public static void main(String[] args) {
		AnimalTest aT = new AnimalTest();
		aT.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aT.testCasting();
		
	}
	public void addAnimal() {
		aniList.add(new Human());		//ArrayList에 추가 되면서 Animal형으로 형 변환
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {		//배열의 요소들을 Animal형으로 꺼내서 move함수를 호출하면 오버라이딩된 함수가 호출됨
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;	//Human으로 다운캐스팅
				h.readBook();	
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
}

	


