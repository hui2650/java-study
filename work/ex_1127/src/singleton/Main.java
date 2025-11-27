package singleton;

public class Main {
	public static void main(String[] args) {
		
		// singleton 생성자가 private 라서 객체 생성이 불가능함
		
		// static으로 정의된 필드나 메서드는 객체 생성없이 호출이 가능하다.
		// 클래스명.메서드명() 형태로 메서드를 호출할 수 있다. why? static이라서
		
		Singleton.getInstance();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		// 같은 주소를 가지고 있음
		System.out.println(s1);
		System.out.println(s2);
		
		
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();

		c1.increment();
		c2.increment();
		c2.increment();
		c2.increment();
		
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
		
		//c1, c2의 count 값 조회하기	
		
	}
}
