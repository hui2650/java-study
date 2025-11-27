package ch_16;

public class Book {
	String title;
	String author;
	
	//필드는 생성자를 통해 초기화한다.
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// 메서드
	// void printInfo() : "제목 : xx, 저자 : xxx"형태로 출력
	public void printInfo() {
		System.out.println("제목 : " + this.title + ", " + "저자 : " + this.author);
	}
}
 