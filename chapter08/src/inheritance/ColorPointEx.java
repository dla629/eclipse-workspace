package inheritance;

public class ColorPointEx {

	public static void main(String[] args) {
		
		Point p = new Point();		// point Ŭ������ ��ü ����
		
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();	//ColorPoint ��ü
		cp.set(3, 4);						//cp.set�� ���� Ŭ������ �޼���
		cp.setColor("����");
		cp.showColorPoint();
	}

}
