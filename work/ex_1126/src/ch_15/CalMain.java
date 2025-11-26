package ch_15;

public class CalMain {
	public static void main(String[] args) {
		//클래스에 속해있는 함수는 독립적으로 실행할 수 없다.
		
		//객체를 생성하고 객체를 통해서 호출해야 한다.
		
		Calculator c = new Calculator();
		
		c.PowerOn();
		c.PowerOff();
		
		int result1 = c.plus(5, 8);
		double result2 = c.divide(7, 2);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
