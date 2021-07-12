package chapter04;

public class PIf06 {

	public static void main(String[] args) {
		String medal = "s";
		
		if(medal == "1" || medal =="Gold" || medal == "G" || medal == "g" || medal == "Gol") {
			System.out.println("금메달 입니다.");
		}else if(medal == "2"||medal =="Silver"||medal == "S"||medal == "s"|| medal =="Sil") {
			System.out.println("은메달 입니다.");
		}else if(medal == "3"||medal =="Bronze"||medal == "B"||medal == "b"|| medal =="Bro") {
			System.out.println("동메달 입니다.");
		}else {
			System.out.println("메달을 획득하지 못했습니다.");
		}

	}

}
