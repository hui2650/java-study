package ch_16;

public class LibraryMain {
	public static void main(String[] args) {
		
		//	LibraryMain
		//	크기가 3인 Library 객체를 만들고 책 3권을 추가한뒤 전체 책 정보 출력하기
		
		Library lib = new Library(3);
		
		lib.addBook("무지개물고기", "김철수");
		lib.addBook("이상한나라의앨리스", "홍장미");
		lib.addBook("인어공주", "고길동");
		
		lib.printAllBooks();
	}
}