package inheritance;

public class ColorPoint extends Point {
	
	protected String color; 			//���� ���� ǥ���ϴ� ����
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();				//��ӹ��� �޼ҵ�(Point Ŭ�������� ��ӹ޾ƿ�)
	}

	

	


}
