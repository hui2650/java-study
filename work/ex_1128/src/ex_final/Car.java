package ex_final;

public class Car {
	
	int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	//final 메서드
	//부모클래스의 메서드를 final로 지정하면 자식이 오버라이딩 할 수 없다
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
