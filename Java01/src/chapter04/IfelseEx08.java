package chapter04;

public class IfelseEx08 {

	public static void main(String[] args) {
		String rank = "a";
		String medalColor;

		if (rank == "1" || rank == "g" || rank == "G" || rank == "Gol") {

			medalColor = "�ݸ޴� �Դϴ�.";

		} else if (rank == "2" || rank == "S" || rank == "s" || rank == "Sli") {
			
			medalColor = "���޴� �Դϴ�.";
			
		} else if (rank == "3" || rank == "B" || rank == "b" || rank == "Bron") {
			
			medalColor = "���޴� �Դϴ�.";
			
		} else {
			
			medalColor = "�޴��� ȹ������ ���߽��ϴ�.";
			
		}
		System.out.println(medalColor);
	}

}
