package inheritance;

public class Point {
	
	protected int x,y;				//��ǥ�� ��Ÿ���� ����
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}