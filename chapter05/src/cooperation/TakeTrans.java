package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James",5000);		//학생 두명 생성
		Student studentTomas = new Student("Tomas",10000);
		Student studentEdward = new Student("Edward",20000);
		
		Bus bus100 = new Bus(100);					//노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100);				//제임스가 100번 버스를 탐
		studentJames.showInfo();					//제임스 정보 출력
		bus100.showInfo();							//버스 정보 풀력
		
		Subway subwayGreen = new Subway("2호선");		//노선 번호가 2호선은 지하철 생성
		studentTomas.takeSubway(subwayGreen);		//토마스가 2호선을 탐
		studentTomas.showInfo();					//토마스 정보 출력
		subwayGreen.showInfo();						//지하철 정보 출력
		
		Taxi taxi120 = new Taxi(120);
		studentEdward.takeTaxi(taxi120);
		studentEdward.showInfo();
		taxi120.showInfo();
		
		Customer cusKim = new Customer("Kim", 14000);
		Customer cusLee = new Customer("Lee", 12000);
		
		Star starbus = new Star("스타벅스");
		cusKim.takeStar(starbus);
		cusKim.showInfo();
		
		Cong congdabang = new Cong("콩다방");
		cusLee.takeCong(congdabang);
		cusLee.showInfo();

	}

}
