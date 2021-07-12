package chapter05;

import java.util.Scanner;

public class Rectangle {
	int width;
	int heigth;
		
	public int getArea() {
		return width*heigth;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();
		rect.heigth = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scanner.close();
		
	}

}
