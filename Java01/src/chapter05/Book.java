package chapter05;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t; author = "작자 미상";
	}
	
	public Book(String t,String a) {
		title = t; author = a;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loverStory = new Book("춘향전");
		Book Destroy = new Book("파괴작","임인웅");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loverStory.title + " " + loverStory.author);
		System.out.println(Destroy.title + " " + Destroy.author);
	}

}
