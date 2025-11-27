package ch_16;

public class Library {
	//	Library클래스
	//	필드
	//	Book[] books : 책들을 담는 배열
	//	int count : 현재 저당된 책의 수
	//	생성자에서는 배열의 길을 받아 배열을 생성, count는 0으로 초기화 하기
	
	Book[] books;
	int count;
	
	public Library(int leng) {
		books = new Book[leng];
		//Book 객체가 들어갈 칸을 leng개 만드는 것 [ null, null, null ]
		//객체를 만든것이 X
		count = 0;
	}
	
	//	메서드
	//	void addBook(String title, String author)
	//	새로운 Book 객체를 만들어 배열에 추가한다.
	//	"책 추가: 제목 - xx, 저자 - xxx" 출력하기
	//	배열이 꽉 찼으면 "더 이상 책을 추가할 수 없습니다." 출력
	
	public void addBook(String title, String author) {
		if (count == books.length) {
            System.out.println("더 이상 책을 추가할 수 없습니다.");
            return;
        }

        books[count] = new Book(title, author);
        System.out.println("책 추가: 제목 - " + title + ", 저자 - " + author);
        count ++;
    }
	//	void printAllBooks()
	//	저장된 모든 책의 정보 출력하기
	public void printAllBooks() {
		if (count == 0) {
			System.out.println("등록된 책이 없습니다.");
			return;
		}
		System.out.println("==도서 목록==");
		for(int i = 0; i < count; i++) {
			books[i].printInfo();
		}
	}
}
