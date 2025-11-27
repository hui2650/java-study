package setter_getter;

public class Main {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setSpeed(-10);
		
		c.getSpeed(); // 세팅된 필드의 값을 얻어올 수 있다
		
		System.out.println("차량의 속도 : " + c.getSpeed());
		
		// getter & setter 상요하면 좋은 점
		// 값에 대한 검증을 할 수 있다
		
		// getter만 제공하여 읽기 전용으로 만들 수 있다.
		// ex) 주민등록 번호는 바뀔 일이 거의 없다
		// 필드를 노출시키지 않을 수 있다
		
		Score s = new Score();
		
		s.setKor(100);
		s.setEng(90);
		s.setMath(70);
		
		System.out.println(s.getKor());
		System.out.println(s.getEng());
		System.out.println(s.getMath());
		
	}
}
