package inheritance;

public class ColorPoint extends Point {
	
	protected String color; 			//점의 색을 표현하는 변수
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();				//상속받은 메소드(Point 클래스에서 상속받아옴)
	}

	

	


}
