package chapter04;

import java.util.Scanner;		// 1. Scanner import

public class ScanerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시 , 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력 하세요.");
		Scanner scanner = new Scanner(System.in);	// 2. Scanner 객체 생성
		
		String name = scanner.next(); //문자열 읽기	// 3. Scanner 에서  받을 값을 변수에 할당
		System.out.print("이름은 " + name + ",");
		
		String city = scanner.next(); //문자열 읽기
		System.out.print("도시는 " + city + ",");
		
		int age = scanner.nextInt();  //정수 읽기
		System.out.print("나이는 " + age + "살,");
		
		double weight = scanner.nextDouble(); //실수 읽기
		System.out.print("체중은 " + weight + "kg,");
		
		boolean single = scanner.nextBoolean(); //논리값 일기
		System.out.println("독신 여부는 "+ single + "입니다.");
		
		scanner.close();  //scanner 닫기
	}

}
