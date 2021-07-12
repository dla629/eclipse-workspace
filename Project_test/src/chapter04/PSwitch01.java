package chapter04;

public class PSwitch01 {

	public static void main(String[] args) {
		String medal = "g";
		
		switch(medal) {
		case "Gold": case "G": case "g": case "Gol":
			System.out.println("금메달 입니다.");
			break;
			
		case "Silver": case "S": case "s": case "Sil":
			System.out.println("은메달 입니다.");
			break;
		
		case "Bronze": case "B": case "b": case "Bro":
			System.out.println("동메달 입니다");
			break;
			
		default :
			System.out.println("메달을 획득하지 못했습니다.");
			break;
			
		}

	}

}
