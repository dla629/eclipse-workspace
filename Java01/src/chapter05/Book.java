package chapter05;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t; author = "���� �̻�";
	}
	
	public Book(String t,String a) {
		title = t; author = a;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮");
		Book loverStory = new Book("������");
		Book Destroy = new Book("�ı���","���ο�");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loverStory.title + " " + loverStory.author);
		System.out.println(Destroy.title + " " + Destroy.author);
	}

}
