package singleton;

// 디자인 패턴
// 코드를 작성하는 방법론

// 여러 군데에서 같이 써야 하고, 여러 개 존재하면 오히려 문제를 일으키는 것을
// 싱글톤 패턴으로 정의한다.

// db 접속 / 리소스를 관리
// 많은 사람이 게시판에 글을 쓴다(insert)
// 사람들마다 db접속 객체를 만들게되면 메모리에 부하가 온다.
// db 접속 객체를 여러 개를 만들어 두고 순차적으로 사용하도록 만든다

// 스프링은 모든 객체를 싱글톤으로 관리한다.
// 메모리에 딱 한번만 올린다

// 싱글톤으로 관리하면 안되는 것들
// user객체 
// 장바구니
public class Singleton {
	
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	// Singleton 객체를 생성 (static 때문에 한번만 메모리에 올라감)
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자
	private Singleton() {
		
	}
	
	//public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		return singleton;
	}
}
