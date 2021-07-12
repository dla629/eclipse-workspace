package chapter04;

public class IfelseEx08 {

	public static void main(String[] args) {
		String rank = "a";
		String medalColor;

		if (rank == "1" || rank == "g" || rank == "G" || rank == "Gol") {

			medalColor = "금메달 입니다.";

		} else if (rank == "2" || rank == "S" || rank == "s" || rank == "Sli") {
			
			medalColor = "은메달 입니다.";
			
		} else if (rank == "3" || rank == "B" || rank == "b" || rank == "Bron") {
			
			medalColor = "동메달 입니다.";
			
		} else {
			
			medalColor = "메달을 획득하지 못했습니다.";
			
		}
		System.out.println(medalColor);
	}

}
