package inheritance;

public class Point {
	
	protected int x,y;				//좌표를 나타내는 변수
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}
