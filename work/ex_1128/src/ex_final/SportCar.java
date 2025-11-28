package ex_final;

public class SportCar extends Car {
	
	@Override
	public void speedUp() {
		super.speedUp();
	}
	
//	private void stop() {

//	}
	
	//final로 설정된 stop() 메서드는 오버라이딩 할 수 없다.
}


