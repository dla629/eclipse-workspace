package chapter04;

public class SwitchEx02 {

	public static void main(String[] args) {
		String medal = "g";

		switch (medal) {
		case "Gold": case "G" : case "g" : case "Gol" :
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
			
		case "Silver": case "S" : case "s" : case "Sli" :
			System.out.println("���޴� �Դϴ�.");
			break;
		
		case "Bronze": case "B" : case "b" : case "Bro" :
			System.out.println("���޴� �Դϴ�.");
			break;
		
		default :
			System.out.println("�޴��� �����ϴ�.");
			break;

	}

}
}