package thisex;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;				//태어난 연도를 지정하는 메서드
	}	//ㄴ bDay.year = year; 와 같음
	
	public void printThis() {
		System.out.println(this);		//this출력 메서드
	}	//ㄴ System.out.println(bDay); 와 같음
}
	public class ThisExmaple{
	
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);				//태어난 연도를 2000으로 지정
		System.out.println(bDay);		//참조 변수 출력 힙 메모리 주소
		bDay.printThis();				//this 출력 메서드 호출

		System.out.println(bDay.year);
	}

}


	


