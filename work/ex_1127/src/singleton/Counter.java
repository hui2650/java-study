package singleton;

public class Counter {
	// 필드로 정수형 타입의 count를 가진다.
	// 외부에서 new Counter로 객체 생성을 하지 못한다.
	// getInstance() 메서드로만 객체의 정보를 얻을 수 있다
	// increment() 메서드를 호출하면 count가 1 증가한다.
	// getCount() 메서드로 현재 count값을 조회할 수 있다
	
	
	private static Counter counter = new Counter();
	
	private int count;
	
	private Counter() {
	}
	
	
	public static Counter getInstance() {
		return counter;
	}
	
	public int increment() {
		return count ++;
	}
	
	public int getCount() {
		return count;
	}
	
	
}
