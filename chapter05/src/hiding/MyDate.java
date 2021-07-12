package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day >28) {
				System.out.println("오류입니다.");
			}else {
				this.day = day;}}
			}
		
	public String isValid() {
		if(isValid) {
			return "유효한 날짜 입니다.";
		}else {
			return "유효하지 않은 날짜 입니다.";
		
	}
		}
	}
	
	


