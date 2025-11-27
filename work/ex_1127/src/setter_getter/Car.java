package setter_getter;

public class Car {
	
	//private 접근제한자 : 같은 클래스 내에서만 접근 가능
	double speed;
	boolean stop;
	
	// setter & setter
	// 접두사에 set과 get이 붙은 메서드를 의미한다.
	
	// setter
	// 값을 세팅한다는 기능을 가진 메서드
	// 메서드는  set 필드명(){} 로 작성하는 것이 일반적이다
	// setter를 호출하면서 필드에 값을 세팅한다
	
	public void setSpeed(double speed) {
		if(speed < 0) {
			this.speed = 0;
			System.out.println("속력은 음수일 수 없습니다.");
			return;
		}else {
			this.speed = speed;
		}
	}
	
	// getter
	// 필드의 값을 조회할 때 사용한다
	// 필드의 타입 get필드명(){...}
	public double getSpeed() {
		return this.speed;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		
	}
	
	// 필드의 타입이 boolean일때 getter -> is필드명()
	public boolean isStop() {
		return this.stop;
		
	}
	
	
	
}
